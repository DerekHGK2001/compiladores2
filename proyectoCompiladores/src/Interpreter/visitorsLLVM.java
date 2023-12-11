package Interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class visitorsLLVM extends InterpreterBaseVisitor {
    private static Map<String, Object> symbolVariableTable = new HashMap<>();
    private static Map<String, Object> symbolConstTable = new HashMap<>();
    private static Map<String, Object> symbolArrayTable = new HashMap<>();
    private static String llvmDeclarations = "";
    private static String llvmHeader = "";
    private static String llvmBody = "";
    private static String llvmEND = "";
    private static int writeI = 0;
    private static int expI = 0;
    private static int ifStatement = 0;
    private static String variable = "";
    private static int forI = 0;
    private static int whileI = 0;
    private static int initString = 0;

    @Override
    public Object visitProgram(InterpreterParser.ProgramContext ctx) {

        llvmHeader =  "define i32 @main() {\n";

        if(ctx.declarations()!=null){
            for(int i=0; i<ctx.declarations().size();i++){
                visit(ctx.declarations(i));
            }
        }
        if(ctx.statements()!=null){
            visit(ctx.statements());
        }
        if(ctx.endprogram()!=null){
            visit(ctx.endprogram());
        }

        return null;
    }

    @Override
    public Object visitVariable_declaration(InterpreterParser.Variable_declarationContext ctx) {
        String type = ctx.TYPE().getText();

        for (TerminalNode idNode : ctx.ID()) {
            String name = idNode.getText();

            if(type.equalsIgnoreCase("integer")){

                llvmBody+="%" + name + " = alloca i32\n";

            }
            if(type.equalsIgnoreCase("string")){
                llvmBody+="%" + name + " = alloca [100 x i8], align 1\n";
            }
            if(type.equalsIgnoreCase("char")){
                llvmBody+="%" + name + " = alloca i8\n";
            }
            if(type.equalsIgnoreCase("boolean")){
                llvmBody+="%" + name + " = alloca i1\n";
            }

            EntryVariable entry = new EntryVariable(name, type, 0);
            entry.setValue(0);
            symbolVariableTable.put(name, entry);

        }

        return null;
    }

    @Override
    public Object visitArray_declaration(InterpreterParser.Array_declarationContext ctx) {

        String type = ctx.TYPE().getText();
        String name = ctx.ID().getText();
        int limiteInf = Integer.parseInt(ctx.array_range().NUMBER(0).getText());
        int limiteSup = Integer.parseInt(ctx.array_range().NUMBER(1).getText());
        String variableT = "";

        for(int i = limiteInf; i<=limiteSup; i ++){
            if(type.equalsIgnoreCase("integer")){
                llvmBody+="%array_" + name + "_" + i + " = alloca i32\n";
                variableT = "integer";
            }
            if(type.equalsIgnoreCase("string")){
                llvmBody+="%array_" + name + "_" + i + " = alloca [100 x i8], align 1\n";
                variableT = "string";
            }
            if(type.equalsIgnoreCase("char")){
                llvmBody+="%array_" + name + "_" + i + " = alloca i8\n";
                variableT = "char";
            }
            if(type.equalsIgnoreCase("boolean")){
                llvmBody+="%array_" + name + "_" + i + " = alloca i1\n";
                variableT = "boolean";
            }

            String nameV = "array_" + name + "_" + i;
            EntryVariable entryV1 = new EntryVariable(nameV, variableT, 0);
            entryV1.setValue(0);
            symbolVariableTable.put(nameV, entryV1);

        }

        EntryArray entry = new EntryArray(name, type, limiteInf, limiteSup, 0);
        symbolArrayTable.put(name, entry);
        return null;
    }

    @Override
    public Object visitArray_init(InterpreterParser.Array_initContext ctx) {
        String arrayName = ctx.array_access(0).ID().getText();
        String firstId = "";

        if(ctx.array_access(0).index().NUMBER()!=null){
            firstId = "array_" + arrayName + "_" + Integer.parseInt(ctx.array_access(0).index().NUMBER().getText());
        }else{
            if(symbolVariableTable.containsKey(ctx.array_access(0).index().ID().getText())){
                EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(ctx.array_access(0).index().ID().getText());
                firstId = "array_" + arrayName + "_" + entry1.getValue();
            }else{
                EntryConst entry1 = (EntryConst) symbolConstTable.get(ctx.array_access(0).index().ID().getText());
                firstId = "array_" + arrayName + "_" + entry1.getValue();
            }
        }

        if (ctx.ID()!=null) {
            String secondId = ctx.ID().getText();

            if(symbolVariableTable.containsKey(secondId)){
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(secondId);
                String secondTypeId = entry.getType();

                if(secondTypeId.equalsIgnoreCase("integer")){

                    llvmBody+="%valor_" + firstId + " = load i32, i32* %"+secondId + "\n";
                    llvmBody+="store i32 %valor_" + firstId + ", i32* %"+firstId + "\n";

                    EntryVariable entryV = (EntryVariable) symbolVariableTable.get(firstId);
                    EntryVariable entryV2 = (EntryVariable) symbolVariableTable.get(secondId);
                    entryV.setValue(entryV2.getValue());

                }
                if(secondTypeId.equalsIgnoreCase("string")){
                    initString++;

                    llvmBody+="%valor_"+ initString + firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                    llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_"+ initString + firstId + ", i8 0, i32 20, i1 false)\n";
                    if(llvmBody.contains("valor_"+ 1 + secondId + " = getelementptr")){
                        llvmBody+="%valor_" + initString + secondId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                        llvmBody+="call void @strcpy(i8* %valor_" + initString + firstId + ", i8* %valor_" + initString+ secondId + ")\n";
                    }else{
                        llvmBody+="call void @strcpy(i8* %valor_"+ initString + firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_"+ initString + firstId + ", i32 0, i32 0))\n";

                        String mensaje = " ";

                        int mensajeSize = mensaje.length()+2;
                        llvmEND+="@mensaje_"+initString+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\0A\\00\"\n\n";
                    }

                    if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                        llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                    }

                    if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                        llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                    }

                }
                if(secondTypeId.equalsIgnoreCase("char")){
                    llvmBody+="%valor_" + firstId + " = load i8, i8* %"+secondId + "\n";
                    llvmBody+="store i8 %valor_" + firstId + ", i8* %"+firstId + "\n";
                }
                if(secondTypeId.equalsIgnoreCase("boolean")){
                    llvmBody+="%valor_" + firstId + " = load i1, i1* %"+secondId + "\n";
                    llvmBody+="store i1 %valor_" + firstId + ", i1* %"+firstId + "\n";
                }

            } else if(symbolConstTable.containsKey(secondId)){
                EntryConst entry = (EntryConst) symbolConstTable.get(secondId);
                String secondTypeId = entry.getType();

                if(secondTypeId.equalsIgnoreCase("integer")){

                    llvmBody+="%valor_" + firstId + " = load i32, i32* %"+secondId + "\n";
                    llvmBody+="store i32 %valor_" + firstId + ", i32* %"+firstId + "\n";

                    EntryVariable entryV = (EntryVariable) symbolVariableTable.get(firstId);
                    EntryVariable entryV2 = (EntryVariable) symbolVariableTable.get(secondId);
                    entryV.setValue(entryV2.getValue());

                }
                if(secondTypeId.equalsIgnoreCase("string")){
                    initString++;
                    llvmBody+="%valor_"+initString + firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                    llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_"+initString + firstId + ", i8 0, i32 20, i1 false)\n";
                    if(llvmBody.contains("valor_"+ 1 + secondId + " = getelementptr")){
                        llvmBody+="%valor_" + initString + secondId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                        llvmBody+="call void @strcpy(i8* %valor_"+ initString + firstId + ", i8* %valor_"+initString + secondId + ")\n";
                    }else{
                        llvmBody+="call void @strcpy(i8* %valor_"+ initString + firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_"+ initString + firstId + ", i32 0, i32 0))\n";

                        String mensaje = " ";

                        int mensajeSize = mensaje.length()+2;
                        llvmEND+="@mensaje_"+initString+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\0A\\00\"\n\n";
                    }

                    if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                        llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                    }

                    if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                        llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                    }
                }
                if(secondTypeId.equalsIgnoreCase("char")){
                    llvmBody+="%valor_" + firstId + " = load i8, i8* %"+secondId + "\n";
                    llvmBody+="store i8 %valor_" + firstId + ", i8* %"+firstId + "\n";
                }
                if(secondTypeId.equalsIgnoreCase("boolean")){
                    llvmBody+="%valor_" + firstId + " = load i1, i1* %"+secondId + "\n";
                    llvmBody+="store i1 %valor_" + firstId + ", i1* %"+firstId + "\n";
                }

            }
        }
        if(ctx.array_access().size()==2){

            String idTerm = "";
            String type = "";

            if(ctx.array_access(1).index().NUMBER()!=null){

                idTerm = "array_" + ctx.array_access(1).ID().getText() + "_" + Integer.parseInt(ctx.array_access(1).index().NUMBER().getText());
            }else{

                if(symbolVariableTable.containsKey(ctx.array_access(1).index().ID().getText())){
                    EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(ctx.array_access(1).index().ID().getText());
                    idTerm = "array_" + ctx.array_access(1).ID().getText() + "_" + entry2.getValue();
                }else{
                    EntryConst entry2 = (EntryConst) symbolConstTable.get(ctx.array_access(1).index().ID().getText());
                    idTerm = "array_" + ctx.array_access(1).ID().getText() + "_" + entry2.getValue();
                }
            }

            if(symbolVariableTable.containsKey(idTerm)){
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(idTerm);
                type = entry.getType();
                EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(firstId);

                if(type.equalsIgnoreCase("integer")){
                    entry1.setValue(entry.getValue());

                    llvmBody+="%valor_" + firstId + " = load i32, i32* %"+idTerm + "\n";
                    llvmBody+="store i32 %valor_" + firstId + ", i32* %"+firstId + "\n";

                }
                if(type.equalsIgnoreCase("string")){
                    initString++;
                    llvmBody+="%valor_" + initString+ firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                    llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_" + initString + firstId + ", i8 0, i32 20, i1 false)\n";
                    if(llvmBody.contains("valor_" + 1 + idTerm + " = getelementptr")){
                        llvmBody+="%valor_" + initString + idTerm + " = getelementptr [100 x i8], [100 x i8]* %" + idTerm + ", i32 0, i32 0\n";

                        llvmBody+="call void @strcpy(i8* %valor_"+initString + firstId + ", i8* %valor_" + initString + idTerm + ")\n";
                    }else{
                        llvmBody+="call void @strcpy(i8* %valor_" + initString+ firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_"+initString + firstId + ", i32 0, i32 0))\n";

                        String mensaje = " ";

                        int mensajeSize = mensaje.length()+2;
                        llvmEND+="@mensaje_"+ initString +firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\0A\\00\"\n\n";
                    }

                    if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                        llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                    }

                    if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                        llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                    }

                }
                if(type.equalsIgnoreCase("char")){
                    llvmBody+="%valor_" + firstId + " = load i8, i8* %"+idTerm + "\n";
                    llvmBody+="store i8 %valor_" + firstId + ", i8* %"+firstId + "\n";
                }
                if(type.equalsIgnoreCase("boolean")){
                    llvmBody+="%valor_" + firstId + " = load i1, i1* %"+idTerm + "\n";
                    llvmBody+="store i1 %valor_" + firstId + ", i1* %"+firstId + "\n";
                }

            }
        }

        if(ctx.NUMBER()!=null){
            llvmBody+="store i32 " + Integer.parseInt(ctx.NUMBER().getText()) + ", i32* %"+firstId + "\n";
            EntryVariable entryV = (EntryVariable) symbolVariableTable.get(firstId);
            entryV.setValue(Integer.parseInt(ctx.NUMBER().getText()));
        }

        if(ctx.CHAR()!=null){
            char caracter = ctx.CHAR().getText().charAt(1);
            int ascii = (int) caracter;
            llvmBody+="store i8 " + ascii + ", i8* %"+firstId + "\n";
        }

        if(ctx.TEXT()!=null){
            initString++;
            llvmBody+="%valor_"+initString + firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
            llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_"+initString + firstId + ", i8 0, i32 20, i1 false)\n";
            llvmBody+="call void @strcpy(i8* %valor_" + initString+ firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_"+initString + firstId + ", i32 0, i32 0))\n";

            if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
            }

            if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
            }

            //@mensaje = private unnamed_addr constant [ 20 x i8] c"Hola,Mama que tal!\0A\00"
            String mensaje = ctx.TEXT().getText().replace("\"","");

            int mensajeSize = mensaje.length()+2;
            llvmEND+="@mensaje_"+initString+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\00\\00\"\n\n";
        }

        if(ctx.BOOLEANVALUE()!=null){
            boolean valorB;

            if(ctx.BOOLEANVALUE().getText().equalsIgnoreCase("true"))
                valorB = true;
            else
                valorB = false;

            llvmBody+="store i1 " + valorB + ", i1* %"+firstId + "\n";
        }

        if(ctx.simple_expression()!=null){
            variable = firstId;
            visit(ctx.simple_expression());
        }

        return null;
    }

    @Override
    public Object visitConst_variable_declaration(InterpreterParser.Const_variable_declarationContext ctx) {
        String firstId =  ctx.ID().getText();
        String type = "";

        if(ctx.CHAR()!=null){
            type = "char";
            llvmBody+="%" + firstId + " = alloca i8\n";

            char caracter = ctx.CHAR().getText().charAt(1);
            int ascii = (int) caracter;
            llvmBody+="store i8 " + ascii + ", i8* %"+ctx.ID().getText() + "\n";
        }
        if(ctx.TEXT()!=null){
            type = "string";
            llvmBody+="%" + firstId + " = alloca [100 x i8], align 1\n";

            llvmBody+="%valor_" + firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
            llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_" + firstId + ", i8 0, i32 20, i1 false)\n";
            llvmBody+="call void @strcpy(i8* %valor_" + firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_" + firstId + ", i32 0, i32 0))\n";

            if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
            }

            if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
            }

            String mensaje = ctx.TEXT().getText().replace("\"","");

            int mensajeSize = mensaje.length()+2;
            llvmEND+="@mensaje_"+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\00\\00\"\n\n";
        }

        EntryConst entry = new EntryConst(firstId, type, 0);
        symbolConstTable.put(firstId, entry);

        return null;
    }

    @Override
    public Object visitVariable_init(InterpreterParser.Variable_initContext ctx) {
        List<TerminalNode> idNodes = ctx.getTokens(InterpreterLexer.ID);

        String firstId = idNodes.get(0).getText();
        EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(firstId);
        String firstTypeId = entry1.getType();

        variable = firstId;

        if (idNodes.size() == 2) {
            String secondId = idNodes.get(1).getText();

            if(symbolVariableTable.containsKey(secondId)){
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(secondId);
                String secondTypeId = entry.getType();

                if(secondTypeId.equalsIgnoreCase("integer")){
                    entry1.setValue(entry.getValue());

                    llvmBody+="%valor_" + firstId + " = load i32, i32* %"+secondId + "\n";
                    llvmBody+="store i32 %valor_" + firstId + ", i32* %"+firstId + "\n";

                }
                if(secondTypeId.equalsIgnoreCase("string")){
                    initString++;

                    llvmBody+="%valor_" + initString + firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                    llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_" + initString + firstId + ", i8 0, i32 20, i1 false)\n";
                    if(llvmBody.contains("valor_" + 1 + secondId + " = getelementptr")){

                        llvmBody+="%valor_" + initString + secondId + " = getelementptr [100 x i8], [100 x i8]* %" + secondId + ", i32 0, i32 0\n";

                        llvmBody+="call void @strcpy(i8* %valor_" + initString + firstId + ", i8* %valor_" + initString + secondId + ")\n";
                    }else{
                        llvmBody+="call void @strcpy(i8* %valor_" + initString + firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_" + initString + firstId + ", i32 0, i32 0))\n";

                        String mensaje = " ";

                        int mensajeSize = mensaje.length()+2;
                        llvmEND+="@mensaje_"+initString+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\0A\\00\"\n\n";
                    }

                    if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                        llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                    }

                    if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                        llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                    }

                }
                if(secondTypeId.equalsIgnoreCase("char")){
                    llvmBody+="%valor_" + firstId + " = load i8, i8* %"+secondId + "\n";
                    llvmBody+="store i8 %valor_" + firstId + ", i8* %"+firstId + "\n";
                }
                if(secondTypeId.equalsIgnoreCase("boolean")){
                    llvmBody+="%valor_" + firstId + " = load i1, i1* %"+secondId + "\n";
                    llvmBody+="store i1 %valor_" + firstId + ", i1* %"+firstId + "\n";
                }

            } else if(symbolConstTable.containsKey(secondId)){
                EntryConst entry = (EntryConst) symbolConstTable.get(secondId);
                String secondTypeId = entry.getType();

                if(secondTypeId.equalsIgnoreCase("integer")){
                    entry1.setValue(entry.getValue());
                    llvmBody+="%valor_" + firstId + " = load i32, i32* %"+secondId + "\n";
                    llvmBody+="store i32 %valor_" + firstId + ", i32* %"+firstId + "\n";

                }
                if(secondTypeId.equalsIgnoreCase("string")){
                    initString++;
                    llvmBody+="%valor_" + initString+ firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                    llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_"+initString + firstId + ", i8 0, i32 20, i1 false)\n";
                    if(llvmBody.contains("valor_" + 1 + secondId + " = getelementptr")){
                        llvmBody+="%valor_" + initString + secondId + " = getelementptr [100 x i8], [100 x i8]* %" + secondId + ", i32 0, i32 0\n";

                        llvmBody+="call void @strcpy(i8* %valor_"+initString + firstId + ", i8* %valor_" + initString + secondId + ")\n";
                    }else{
                        llvmBody+="call void @strcpy(i8* %valor_"+initString + firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_" + initString + firstId + ", i32 0, i32 0))\n";

                        String mensaje = " ";

                        int mensajeSize = mensaje.length()+2;
                        llvmEND+="@mensaje_"+initString+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\0A\\00\"\n\n";
                    }

                    if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                        llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                    }

                    if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                        llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                    }
                }
                if(secondTypeId.equalsIgnoreCase("char")){
                    llvmBody+="%valor_" + firstId + " = load i8, i8* %"+secondId + "\n";
                    llvmBody+="store i8 %valor_" + firstId + ", i8* %"+firstId + "\n";
                }
                if(secondTypeId.equalsIgnoreCase("boolean")){
                    llvmBody+="%valor_" + firstId + " = load i1, i1* %"+secondId + "\n";
                    llvmBody+="store i1 %valor_" + firstId + ", i1* %"+firstId + "\n";
                }

            }
        }
        if(ctx.array_access()!=null){
            String idTerm = "";
            String type = "";

            if(ctx.array_access().index().NUMBER()!=null){
                idTerm = "array_" + ctx.array_access().ID().getText() + "_" + Integer.parseInt(ctx.array_access().index().NUMBER().getText());
            }else{

                if(symbolVariableTable.containsKey(ctx.array_access().index().ID().getText())){
                    EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(ctx.array_access().index().ID().getText());
                    idTerm = "array_" + ctx.array_access().ID().getText() + "_" + entry2.getValue();
                }else{
                    EntryConst entry2 = (EntryConst) symbolConstTable.get(ctx.array_access().index().ID().getText());
                    idTerm = "array_" + ctx.array_access().ID().getText() + "_" + entry2.getValue();
                }
            }

            if(symbolVariableTable.containsKey(idTerm)){
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(idTerm);
                type = entry.getType();

                if(type.equalsIgnoreCase("integer")){
                    entry1.setValue(entry.getValue());

                    llvmBody+="%valor_" + firstId + " = load i32, i32* %"+idTerm + "\n";
                    llvmBody+="store i32 %valor_" + firstId + ", i32* %"+firstId + "\n";

                }
                if(type.equalsIgnoreCase("string")){
                    initString++;
                    llvmBody+="%valor_" + initString+ firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                    llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_" + initString + firstId + ", i8 0, i32 20, i1 false)\n";
                    if(llvmBody.contains("valor_" + 1 + idTerm + " = getelementptr")){
                        llvmBody+="%valor_" + initString + idTerm + " = getelementptr [100 x i8], [100 x i8]* %" + idTerm + ", i32 0, i32 0\n";

                        llvmBody+="call void @strcpy(i8* %valor_"+initString + firstId + ", i8* %valor_" + initString + idTerm + ")\n";
                    }else{
                        llvmBody+="call void @strcpy(i8* %valor_" + initString+ firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_"+initString + firstId + ", i32 0, i32 0))\n";

                        String mensaje = " ";

                        int mensajeSize = mensaje.length()+2;
                        llvmEND+="@mensaje_"+ initString +firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\0A\\00\"\n\n";
                    }

                    if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                        llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                    }

                    if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                        llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                    }

                }
                if(type.equalsIgnoreCase("char")){
                    llvmBody+="%valor_" + firstId + " = load i8, i8* %"+idTerm + "\n";
                    llvmBody+="store i8 %valor_" + firstId + ", i8* %"+firstId + "\n";
                }
                if(type.equalsIgnoreCase("boolean")){
                    llvmBody+="%valor_" + firstId + " = load i1, i1* %"+idTerm + "\n";
                    llvmBody+="store i1 %valor_" + firstId + ", i1* %"+firstId + "\n";
                }

            }
        }

        if(ctx.NUMBER()!=null){
            entry1.setValue(Integer.parseInt(ctx.NUMBER().getText()));
            llvmBody+="store i32 " + Integer.parseInt(ctx.NUMBER().getText()) + ", i32* %"+firstId + "\n";
        }

        if(ctx.CHAR()!=null){
            char caracter = ctx.CHAR().getText().charAt(1);
            int ascii = (int) caracter;
            llvmBody+="store i8 " + ascii + ", i8* %"+firstId + "\n";
        }

        if(ctx.TEXT()!=null){
            initString++;
            llvmBody+="%valor_"+ initString + firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
            llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_"+initString + firstId + ", i8 0, i32 20, i1 false)\n";
            llvmBody+="call void @strcpy(i8* %valor_"+initString + firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_" +initString+ firstId + ", i32 0, i32 0))\n";

            if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
            }

            if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
            }

            //@mensaje = private unnamed_addr constant [ 20 x i8] c"Hola,Mama que tal!\0A\00"
            String mensaje = ctx.TEXT().getText().replace("\"","");

            int mensajeSize = mensaje.length()+2;
            llvmEND+="@mensaje_"+initString+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\00\\00\"\n\n";
        }

        if(ctx.BOOLEANVALUE()!=null){
            boolean valorB;

            if(ctx.BOOLEANVALUE().getText().equalsIgnoreCase("true"))
                valorB = true;
            else
                valorB = false;

            llvmBody+="store i1 " + valorB + ", i1* %"+firstId + "\n";
        }

        if(ctx.simple_expression()!=null){
            variable = firstId;
            visit(ctx.simple_expression());
        }

        return null;
    }

    @Override
    public Object visitSimple_expression(InterpreterParser.Simple_expressionContext ctx) {

        expI++;

        int valorO = 0;
        int indexO = 0;
        String nameOperatorV = "";

        if(ctx.factor(0).ID()!=null){

            if(!llvmBody.contains("%valorID_" + expI + ctx.factor(0).ID().getText()))
                llvmBody+="%valorID_" + expI + ctx.factor(0).ID().getText() + " = load i32, i32* %" + ctx.factor(0).ID().getText() + "\n";
        }
        if(ctx.factor(1).ID()!=null){
            if(!llvmBody.contains("%valorID_" + expI + ctx.factor(1).ID().getText()))
                llvmBody+="%valorID_" + expI + ctx.factor(1).ID().getText() + " = load i32, i32* %" + ctx.factor(1).ID().getText() + "\n";
        }

        if(ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("+")){

            if(ctx.factor(0).NUMBER()!=null){
                llvmBody+="%suma_"+expI+" = add i32 "+Integer.parseInt(ctx.factor(0).NUMBER().getText());
                valorO = Integer.parseInt(ctx.factor(0).NUMBER().getText());
            }else if(ctx.factor(0).ID()!=null){

                llvmBody+="%suma_"+expI+" = add i32 %valorID_" + expI + ctx.factor(0).ID().getText();
                if(symbolVariableTable.containsKey(ctx.factor(0).ID().getText())){
                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(0).ID().getText());
                    valorO = entry.getValue();
                }else{
                    EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(0).ID().getText());
                    valorO = entry.getValue();
                }
            }
            if(ctx.factor(1).NUMBER()!=null){
                llvmBody+=", "+Integer.parseInt(ctx.factor(1).NUMBER().getText())+"\n";
                valorO += Integer.parseInt(ctx.factor(1).NUMBER().getText());
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(variable);
                entry.setValue(valorO);

            }else if(ctx.factor(1).ID()!=null){
                llvmBody+=", %valorID_" + expI + ctx.factor(1).ID().getText()+"\n";
                if(symbolVariableTable.containsKey(ctx.factor(1).ID().getText())){

                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(1).ID().getText());
                    valorO += entry.getValue();

                    if(symbolVariableTable.containsKey(variable)){
                        EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }else{
                        EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }
                }else{
                    EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(0).ID().getText());
                    valorO += entry.getValue();
                    if(symbolVariableTable.containsKey(variable)){
                        EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);

                    }else{
                        EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }
                }
            }
            llvmBody+="store i32 %suma_"+expI+ ", i32* %"+variable + "\n";
            nameOperatorV="suma_"+expI;
        }
        if(ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("-")){
            if(ctx.factor(0).NUMBER()!=null){
                llvmBody+="%resta_"+expI+" = sub i32 "+Integer.parseInt(ctx.factor(0).NUMBER().getText());
                valorO = Integer.parseInt(ctx.factor(0).NUMBER().getText());
            }else if(ctx.factor(0).ID()!=null){

                llvmBody+="%resta_"+expI+" = sub i32 %valorID_" + expI + ctx.factor(0).ID().getText();
                if(symbolVariableTable.containsKey(ctx.factor(0).ID().getText())){
                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(0).ID().getText());
                    valorO = entry.getValue();
                }else{
                    EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(0).ID().getText());
                    valorO = entry.getValue();
                }
            }
            if(ctx.factor(1).NUMBER()!=null){
                llvmBody+=", "+Integer.parseInt(ctx.factor(1).NUMBER().getText())+"\n";
                valorO -= Integer.parseInt(ctx.factor(1).NUMBER().getText());
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(variable);
                entry.setValue(valorO);

            }else if(ctx.factor(1).ID()!=null){
                llvmBody+=", %valorID_" + expI + ctx.factor(1).ID().getText()+"\n";
                if(symbolVariableTable.containsKey(ctx.factor(1).ID().getText())){

                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(1).ID().getText());
                    valorO -= entry.getValue();

                    if(symbolVariableTable.containsKey(variable)){
                        EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }else{
                        EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }
                }else{
                    EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(0).ID().getText());
                    valorO -= entry.getValue();
                    if(symbolVariableTable.containsKey(variable)){
                        EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);

                    }else{
                        EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }
                }
            }
            llvmBody+="store i32 %resta_"+expI+ ", i32* %"+variable + "\n";
            nameOperatorV="resta_"+expI;
        }
        if(ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("*") || ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("mod")){

            if(ctx.factor(0).NUMBER()!=null){
                llvmBody+="%multiplicacion_"+expI+" = mul i32 "+Integer.parseInt(ctx.factor(0).NUMBER().getText());
                valorO = Integer.parseInt(ctx.factor(0).NUMBER().getText());
            }else if(ctx.factor(0).ID()!=null){

                llvmBody+="%multiplicacion_"+expI+" = mul i32 %valorID_" + expI + ctx.factor(0).ID().getText();
                if(symbolVariableTable.containsKey(ctx.factor(0).ID().getText())){
                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(0).ID().getText());
                    valorO = entry.getValue();
                }else{
                    EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(0).ID().getText());
                    valorO = entry.getValue();
                }
            }
            if(ctx.factor(1).NUMBER()!=null){
                llvmBody+=", "+Integer.parseInt(ctx.factor(1).NUMBER().getText())+"\n";
                valorO *= Integer.parseInt(ctx.factor(1).NUMBER().getText());
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(variable);
                entry.setValue(valorO);

            }else if(ctx.factor(1).ID()!=null){
                llvmBody+=", %valorID_" + expI + ctx.factor(1).ID().getText()+"\n";
                if(symbolVariableTable.containsKey(ctx.factor(1).ID().getText())){

                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(1).ID().getText());
                    valorO *= entry.getValue();

                    if(symbolVariableTable.containsKey(variable)){
                        EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }else{
                        EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }
                }else{
                    EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(0).ID().getText());
                    valorO *= entry.getValue();
                    if(symbolVariableTable.containsKey(variable)){
                        EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);

                    }else{
                        EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }
                }
            }
            llvmBody+="store i32 %multiplicacion_"+expI+ ", i32* %"+variable + "\n";
            nameOperatorV="multiplicacion_"+expI;
        }
        if(ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("/") || ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("div")){
            if(ctx.factor(0).NUMBER()!=null){
                llvmBody+="%division_"+expI+" = sdiv i32 "+Integer.parseInt(ctx.factor(0).NUMBER().getText());
                valorO = Integer.parseInt(ctx.factor(0).NUMBER().getText());
            }else if(ctx.factor(0).ID()!=null){

                llvmBody+="%division_"+expI+" = sdiv i32 %valorID_" + expI + ctx.factor(0).ID().getText();
                if(symbolVariableTable.containsKey(ctx.factor(0).ID().getText())){
                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(0).ID().getText());
                    valorO = entry.getValue();
                }else{
                    EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(0).ID().getText());
                    valorO = entry.getValue();
                }
            }
            if(ctx.factor(1).NUMBER()!=null){
                llvmBody+=", "+Integer.parseInt(ctx.factor(1).NUMBER().getText())+"\n";
                valorO /= Integer.parseInt(ctx.factor(1).NUMBER().getText());
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(variable);
                entry.setValue(valorO);

            }else if(ctx.factor(1).ID()!=null){
                llvmBody+=", %valorID_" + expI + ctx.factor(1).ID().getText()+"\n";
                if(symbolVariableTable.containsKey(ctx.factor(1).ID().getText())){

                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(1).ID().getText());
                    valorO /= entry.getValue();

                    if(symbolVariableTable.containsKey(variable)){
                        EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }else{
                        EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }
                }else{
                    EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(0).ID().getText());
                    valorO /= entry.getValue();
                    if(symbolVariableTable.containsKey(variable)){
                        EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);

                    }else{
                        EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                        entry2.setValue(valorO);
                    }
                }
            }
            llvmBody+="store i32 %division_"+expI+ ", i32* %"+variable + "\n";
            nameOperatorV="division_"+expI;
        }

        if(ctx.factor().size()>1){
            for(int i=2;i<ctx.factor().size();i++){
                indexO++;

                if(ctx.factor(i).ID()!=null){
                    if(!llvmBody.contains("%valorID_" + expI + ctx.factor(i).ID().getText()))
                        llvmBody+="%valorID_" + expI + ctx.factor(i).ID().getText() + " = load i32, i32* %" + ctx.factor(i).ID().getText() + "\n";
                }

                if(ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("+")){

                    llvmBody+="%suma_"+expI+ "_"+ i +" = add i32 %"+nameOperatorV;

                    if(ctx.factor(i).NUMBER()!=null){
                        llvmBody+=", "+Integer.parseInt(ctx.factor(i).NUMBER().getText())+"\n";
                        valorO += Integer.parseInt(ctx.factor(i).NUMBER().getText());
                        EntryVariable entry = (EntryVariable) symbolVariableTable.get(variable);
                        entry.setValue(valorO);
                    }else if(ctx.factor(i).ID()!=null){
                        llvmBody+=", %valorID_" + expI + ctx.factor(i).ID().getText()+"\n";
                        if(symbolVariableTable.containsKey(ctx.factor(i).ID().getText())){

                            EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(i).ID().getText());
                            valorO += entry.getValue();

                            if(symbolVariableTable.containsKey(variable)){
                                EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }else{
                                EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }
                        }else{
                            EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(i).ID().getText());
                            valorO += entry.getValue();
                            if(symbolVariableTable.containsKey(variable)){
                                EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);

                            }else{
                                EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }
                        }
                    }
                    llvmBody+="store i32 %suma_"+expI+ "_"+ i +", i32* %"+variable + "\n";
                    nameOperatorV="suma_"+expI+ "_"+i;
                }
                if(ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("-")){

                    llvmBody+="%resta_"+expI+ "_"+ i +" = sub i32 %"+nameOperatorV;

                    if(ctx.factor(i).NUMBER()!=null){
                        llvmBody+=", "+Integer.parseInt(ctx.factor(i).NUMBER().getText())+"\n";
                        valorO -= Integer.parseInt(ctx.factor(i).NUMBER().getText());
                        EntryVariable entry = (EntryVariable) symbolVariableTable.get(variable);
                        entry.setValue(valorO);
                    }else if(ctx.factor(i).ID()!=null){
                        llvmBody+=", %valorID_" + expI + ctx.factor(i).ID().getText()+"\n";
                        if(symbolVariableTable.containsKey(ctx.factor(i).ID().getText())){

                            EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(i).ID().getText());
                            valorO -= entry.getValue();

                            if(symbolVariableTable.containsKey(variable)){
                                EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }else{
                                EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }
                        }else{
                            EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(i).ID().getText());
                            valorO -= entry.getValue();
                            if(symbolVariableTable.containsKey(variable)){
                                EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);

                            }else{
                                EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }
                        }
                    }
                    llvmBody+="store i32 %resta_"+expI+ "_"+ i +", i32* %"+variable + "\n";
                    nameOperatorV="resta_"+expI+ "_"+i;
                }
                if(ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("*") || ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("mod")){
                    llvmBody+="%multiplicacion_"+expI+ "_"+ i +" = mul i32 %"+nameOperatorV;
                    if(ctx.factor(i).NUMBER()!=null){
                        llvmBody+=", "+Integer.parseInt(ctx.factor(i).NUMBER().getText())+"\n";
                        valorO *= Integer.parseInt(ctx.factor(i).NUMBER().getText());
                        EntryVariable entry = (EntryVariable) symbolVariableTable.get(variable);
                        entry.setValue(valorO);
                    }else if(ctx.factor(i).ID()!=null){
                        llvmBody+=", %valorID_" + expI + ctx.factor(i).ID().getText()+"\n";
                        if(symbolVariableTable.containsKey(ctx.factor(i).ID().getText())){

                            EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(i).ID().getText());
                            valorO *= entry.getValue();

                            if(symbolVariableTable.containsKey(variable)){
                                EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }else{
                                EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }
                        }else{
                            EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(i).ID().getText());
                            valorO *= entry.getValue();
                            if(symbolVariableTable.containsKey(variable)){
                                EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);

                            }else{
                                EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }
                        }
                    }
                    llvmBody+="store i32 %multiplicacion_"+expI+ "_"+ i +", i32* %"+variable + "\n";
                    nameOperatorV="multiplicacion_"+expI+ "_"+i;
                }
                if(ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("/") || ctx.operaciones_simples(indexO).getText().equalsIgnoreCase("div")){
                    llvmBody+="%division_"+expI+ "_"+ i +" = sdiv i32 %"+nameOperatorV;
                    if(ctx.factor(i).NUMBER()!=null){
                        llvmBody+=", "+Integer.parseInt(ctx.factor(i).NUMBER().getText())+"\n";
                        valorO /= Integer.parseInt(ctx.factor(i).NUMBER().getText());
                        EntryVariable entry = (EntryVariable) symbolVariableTable.get(variable);
                        entry.setValue(valorO);
                    }else if(ctx.factor(i).ID()!=null){
                        llvmBody+=", %valorID_" + expI + ctx.factor(i).ID().getText()+"\n";
                        if(symbolVariableTable.containsKey(ctx.factor(i).ID().getText())){

                            EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.factor(i).ID().getText());
                            valorO /= entry.getValue();

                            if(symbolVariableTable.containsKey(variable)){
                                EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }else{
                                EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }
                        }else{
                            EntryConst entry = (EntryConst) symbolConstTable.get(ctx.factor(i).ID().getText());
                            valorO /= entry.getValue();
                            if(symbolVariableTable.containsKey(variable)){
                                EntryVariable entry2 = (EntryVariable) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);

                            }else{
                                EntryConst entry2 = (EntryConst) symbolVariableTable.get(variable);
                                entry2.setValue(valorO);
                            }
                        }
                    }
                    llvmBody+="store i32 %division_"+expI+ "_"+ i +", i32* %"+variable + "\n";
                    nameOperatorV="division_"+expI+ "_"+i;
                }
            }
        }
        variable = "";
        return null;
    }

    @Override
    public Object visitWriteln_stmt(InterpreterParser.Writeln_stmtContext ctx) {
        writeI++;
        if(!llvmDeclarations.contains("declare i32 @printf(i8*, ...)")){
            llvmDeclarations+="declare i32 @printf(i8*, ...)\n\n";
        }

        for(int ii = 0; ii<ctx.write_contain().size();ii++){
            if(ctx.write_contain(ii).ID()!=null){
                String idTerm = ctx.write_contain(ii).ID().getText();

                EntryVariable entry1;
                EntryConst entry2;
                String tipo;

                if(symbolVariableTable.containsKey(idTerm)){
                    entry1 = (EntryVariable) symbolVariableTable.get(idTerm);
                    tipo = entry1.getType();
                }else{

                    entry2 = (EntryConst) symbolConstTable.get(idTerm);
                    tipo = entry2.getType();
                }

                if(tipo.equalsIgnoreCase("integer")){
                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i32, i32* %" + idTerm + "\n";
                    llvmBody+="%formato_entero_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_entero_"+writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_entero_" +writeI+"_"+idTerm+ ", i32 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_entero_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\0a\\00\"\n";
                    }else{
                        llvmEND+="@formato_entero_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\00\\00\"\n";
                    }
                }
                if(tipo.equalsIgnoreCase("string")){
                    llvmBody+="%valorImp1_"+writeI+"_"+idTerm+ " = getelementptr [100 x i8], [100 x i8]* %" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="%valorImp2_"+writeI+"_"+idTerm+ " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_" +writeI+"_"+idTerm+ ", i32 0, i32 0), i8* %valorImp1_" +writeI+"_"+idTerm+ ") \n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_"+writeI+"_"+idTerm+ " = private unnamed_addr constant [4 x i8] c\"%s\\0a\\00\"\n";
                    }else{
                        llvmEND+="@formato_"+writeI+"_"+idTerm+ " = private unnamed_addr constant [4 x i8] c\"%s\\00\\00\"\n";
                    }
                }
                if(tipo.equalsIgnoreCase("char")){

                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i8, i8* %" + idTerm + "\n";
                    llvmBody+="%formato_caracter_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_caracter_" +writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_caracter_" +writeI+"_"+idTerm+ ", i8 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_caracter_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%c\\0a\\00\"\n";
                    }else{
                        llvmEND+="@formato_caracter_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%c\\00\\00\"\n";
                    }

                }
                if(tipo.equalsIgnoreCase("boolean")){
                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i1, i1* %" + idTerm + "\n";
                    llvmBody+="%formato_booleano_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_booleano_" +writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_booleano_" +writeI+"_"+idTerm+ ", i1 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_booleano_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\0a\\00\"\n";
                    }else{
                        llvmEND+="@formato_booleano_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\00\\00\"\n";
                    }

                }
            }

            if(ctx.write_contain(ii).array_access()!=null){
                String idTerm = "";

                if(ctx.write_contain(ii).array_access().index().NUMBER()!=null){
                    idTerm = "array_" + ctx.write_contain(ii).array_access().ID().getText() + "_" + Integer.parseInt(ctx.write_contain(ii).array_access().index().NUMBER().getText());
                }else{

                    if(symbolVariableTable.containsKey(ctx.write_contain(ii).array_access().index().ID().getText())){
                        EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(ctx.write_contain(ii).array_access().index().ID().getText());
                        System.out.println(entry1.getValue());
                        idTerm = "array_" + ctx.write_contain(ii).array_access().ID().getText() + "_" + entry1.getValue();
                    }else{
                        EntryConst entry1 = (EntryConst) symbolConstTable.get(ctx.write_contain(ii).array_access().index().ID().getText());
                        idTerm = "array_" + ctx.write_contain(ii).array_access().ID().getText() + "_" + entry1.getValue();
                    }
                }


                EntryArray entry1 = (EntryArray) symbolArrayTable.get(ctx.write_contain(ii).array_access().ID().getText());
                String tipo = entry1.getType();

                if(tipo.equalsIgnoreCase("integer")){
                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i32, i32* %" + idTerm + "\n";
                    llvmBody+="%formato_entero_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_entero_"+writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_entero_" +writeI+"_"+idTerm+ ", i32 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_entero_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\0a\\00\"\n";
                    }else{
                        llvmEND+="@formato_entero_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\00\\00\"\n";
                    }
                }
                if(tipo.equalsIgnoreCase("string")){
                    llvmBody+="%valorImp1_"+writeI+"_"+idTerm+ " = getelementptr [100 x i8], [100 x i8]* %" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="%valorImp2_"+writeI+"_"+idTerm+ " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_" +writeI+"_"+idTerm+ ", i32 0, i32 0), i8* %valorImp1_" +writeI+"_"+idTerm+ ") \n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_"+writeI+"_"+idTerm+ " = private unnamed_addr constant [4 x i8] c\"%s\\0a\\00\"\n";
                    }else{
                        llvmEND+="@formato_"+writeI+"_"+idTerm+ " = private unnamed_addr constant [4 x i8] c\"%s\\00\\00\"\n";
                    }
                }
                if(tipo.equalsIgnoreCase("char")){

                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i8, i8* %" + idTerm + "\n";
                    llvmBody+="%formato_caracter_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_caracter_" +writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_caracter_" +writeI+"_"+idTerm+ ", i8 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_caracter_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%c\\0a\\00\"\n";
                    }else{
                        llvmEND+="@formato_caracter_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%c\\00\\00\"\n";
                    }

                }
                if(tipo.equalsIgnoreCase("boolean")){
                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i1, i1* %" + idTerm + "\n";
                    llvmBody+="%formato_booleano_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_booleano_" +writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_booleano_" +writeI+"_"+idTerm+ ", i1 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_booleano_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\0a\\00\"\n";
                    }else{
                        llvmEND+="@formato_booleano_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\00\\00\"\n";
                    }

                }
            }

            if(ctx.write_contain(ii).TEXTWRITE()!=null){

                llvmBody+="%write" + writeI + " = alloca [100 x i8], align 1\n";
                llvmBody+="%valor_write" + writeI + " = getelementptr [100 x i8], [100 x i8]* %write"+writeI + ", i32 0, i32 0\n";
                llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write" + writeI + ", i8 0, i32 20, i1 false)\n";
                llvmBody+="call void @strcpy(i8* %valor_write" + writeI + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write" + writeI + ", i32 0, i32 0))\n";

                if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                    llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                }

                if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                    llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                }

                //@mensaje = private unnamed_addr constant [ 20 x i8] c"Hola,Mama que tal!\0A\00"
                String mensaje = ctx.write_contain(ii).TEXTWRITE().getText().replace("\'","");

                int mensajeSize = mensaje.length()+2;
                llvmEND+="@mensaje_write" + writeI +" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\00\\00\"\n\n";

                llvmBody+="%valorImp1_write" + writeI + " = getelementptr [100 x i8], [100 x i8]* %write" + writeI + ", i32 0, i32 0\n";
                llvmBody+="%valorImp2_write" + writeI + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write" + writeI + ", i32 0, i32 0), i8* %valorImp1_write" + writeI + ") \n";

                if(ii==ctx.write_contain().size()-1){
                    llvmEND+="@formato_write" + writeI + " = private unnamed_addr constant [4 x i8] c\"%s\\0a\\00\"\n";
                }else{
                    llvmEND+="@formato_write" + writeI + " = private unnamed_addr constant [4 x i8] c\"%s\\00\\00\"\n";
                }
            }

            if(ctx.write_contain(ii).CHAR()!=null){

                llvmBody+="%write" + writeI + " = alloca [100 x i8], align 1\n";
                llvmBody+="%valor_write" + writeI + " = getelementptr [100 x i8], [100 x i8]* %write"+writeI + ", i32 0, i32 0\n";
                llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write" + writeI + ", i8 0, i32 20, i1 false)\n";
                llvmBody+="call void @strcpy(i8* %valor_write" + writeI + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write" + writeI + ", i32 0, i32 0))\n";

                if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                    llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                }

                if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                    llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                }

                //@mensaje = private unnamed_addr constant [ 20 x i8] c"Hola,Mama que tal!\0A\00"
                String mensaje = ctx.write_contain(ii).CHAR().getText().replace("\'","");

                int mensajeSize = mensaje.length()+2;
                llvmEND+="@mensaje_write" + writeI +" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\00\\00\"\n\n";

                llvmBody+="%valorImp1_write" + writeI + " = getelementptr [100 x i8], [100 x i8]* %write" + writeI + ", i32 0, i32 0\n";
                llvmBody+="%valorImp2_write" + writeI + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write" + writeI + ", i32 0, i32 0), i8* %valorImp1_write" + writeI + ") \n";

                if(ii==ctx.write_contain().size()-1){
                    llvmEND+="@formato_write" + writeI + " = private unnamed_addr constant [4 x i8] c\"%s\\0a\\00\"\n";
                }else{
                    llvmEND+="@formato_write" + writeI + " = private unnamed_addr constant [4 x i8] c\"%s\\00\\00\"\n";
                }
            }
        }
        return null;
    }

    @Override
    public Object visitWrite(InterpreterParser.WriteContext ctx) {
        writeI++;
        if(!llvmDeclarations.contains("declare i32 @printf(i8*, ...)")){
            llvmDeclarations+="declare i32 @printf(i8*, ...)\n\n";
        }

        for(int ii = 0; ii<ctx.write_contain().size();ii++){
            if(ctx.write_contain(ii).ID()!=null){
                String idTerm = ctx.write_contain(ii).ID().getText();

                EntryVariable entry1;
                EntryConst entry2;
                String tipo;

                if(symbolVariableTable.containsKey(idTerm)){
                    entry1 = (EntryVariable) symbolVariableTable.get(idTerm);
                    tipo = entry1.getType();
                }else{
                    entry2 = (EntryConst) symbolConstTable.get(idTerm);
                    tipo = entry2.getType();
                }

                if(tipo.equalsIgnoreCase("integer")){
                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i32, i32* %" + idTerm + "\n";
                    llvmBody+="%formato_entero_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_entero_"+writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_entero_" +writeI+"_"+idTerm+ ", i32 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    llvmEND+="@formato_entero_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\00\\00\"\n";
                }
                if(tipo.equalsIgnoreCase("string")){
                    llvmBody+="%valorImp1_"+writeI+"_"+idTerm+ " = getelementptr [100 x i8], [100 x i8]* %" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="%valorImp2_"+writeI+"_"+idTerm+ " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_" +writeI+"_"+idTerm+ ", i32 0, i32 0), i8* %valorImp1_" +writeI+"_"+idTerm+ ") \n";

                    llvmEND+="@formato_"+writeI+"_"+idTerm+ " = private unnamed_addr constant [4 x i8] c\"%s\\00\\00\"\n";
                }
                if(tipo.equalsIgnoreCase("char")){

                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i8, i8* %" + idTerm + "\n";
                    llvmBody+="%formato_caracter_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_caracter_" +writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_caracter_" +writeI+"_"+idTerm+ ", i8 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    llvmEND+="@formato_caracter_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%c\\00\\00\"\n";

                }
                if(tipo.equalsIgnoreCase("boolean")){
                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i1, i1* %" + idTerm + "\n";
                    llvmBody+="%formato_booleano_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_booleano_" +writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_booleano_" +writeI+"_"+idTerm+ ", i1 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    llvmEND+="@formato_booleano_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\00\\00\"\n";

                }
            }

            if(ctx.write_contain(ii).array_access()!=null){
                String idTerm = "";

                if(ctx.write_contain(ii).array_access().index().NUMBER()!=null){
                    idTerm = "array_" + ctx.write_contain(ii).array_access().ID().getText() + "_" + Integer.parseInt(ctx.write_contain(ii).array_access().index().NUMBER().getText());
                }else{

                    if(symbolVariableTable.containsKey(ctx.write_contain(ii).array_access().index().ID().getText())){
                        EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(ctx.write_contain(ii).array_access().index().ID().getText());
                        idTerm = "array_" + ctx.write_contain(ii).array_access().ID().getText() + "_" + entry1.getValue();
                    }else{
                        EntryConst entry1 = (EntryConst) symbolConstTable.get(ctx.write_contain(ii).array_access().index().ID().getText());
                        idTerm = "array_" + ctx.write_contain(ii).array_access().ID().getText() + "_" + entry1.getValue();
                    }
                }

                EntryArray entry1 = (EntryArray) symbolArrayTable.get(ctx.write_contain(ii).array_access().ID().getText());
                String tipo = entry1.getType();

                if(tipo.equalsIgnoreCase("integer")){
                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i32, i32* %" + idTerm + "\n";
                    llvmBody+="%formato_entero_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_entero_"+writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_entero_" +writeI+"_"+idTerm+ ", i32 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_entero_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\00\\00\"\n";
                    }else{
                        llvmEND+="@formato_entero_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\00\\00\"\n";
                    }
                }
                if(tipo.equalsIgnoreCase("string")){
                    llvmBody+="%valorImp1_"+writeI+"_"+idTerm+ " = getelementptr [100 x i8], [100 x i8]* %" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="%valorImp2_"+writeI+"_"+idTerm+ " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_" +writeI+"_"+idTerm+ ", i32 0, i32 0), i8* %valorImp1_" +writeI+"_"+idTerm+ ") \n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_"+writeI+"_"+idTerm+ " = private unnamed_addr constant [4 x i8] c\"%s\\00\\00\"\n";
                    }else{
                        llvmEND+="@formato_"+writeI+"_"+idTerm+ " = private unnamed_addr constant [4 x i8] c\"%s\\00\\00\"\n";
                    }
                }
                if(tipo.equalsIgnoreCase("char")){

                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i8, i8* %" + idTerm + "\n";
                    llvmBody+="%formato_caracter_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_caracter_" +writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_caracter_" +writeI+"_"+idTerm+ ", i8 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_caracter_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%c\\00\\00\"\n";
                    }else{
                        llvmEND+="@formato_caracter_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%c\\00\\00\"\n";
                    }

                }
                if(tipo.equalsIgnoreCase("boolean")){
                    llvmBody+="%valorImp_"+writeI+"_"+idTerm+ " = load i1, i1* %" + idTerm + "\n";
                    llvmBody+="%formato_booleano_"+writeI+"_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_booleano_" +writeI+"_"+idTerm+ ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_booleano_" +writeI+"_"+idTerm+ ", i1 %valorImp_" +writeI+"_"+idTerm+ ")\n";

                    if(ii==ctx.write_contain().size()-1){
                        llvmEND+="@formato_booleano_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\00\\00\"\n";
                    }else{
                        llvmEND+="@formato_booleano_"+writeI+"_"+idTerm+ " = constant [4 x i8] c\"%d\\00\\00\"\n";
                    }

                }
            }

            if(ctx.write_contain(ii).TEXTWRITE()!=null){
                    llvmBody+="%write" + writeI + " = alloca [100 x i8], align 1\n";
                    llvmBody+="%valor_write" + writeI + " = getelementptr [100 x i8], [100 x i8]* %write"+writeI + ", i32 0, i32 0\n";
                    llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write" + writeI + ", i8 0, i32 20, i1 false)\n";
                    llvmBody+="call void @strcpy(i8* %valor_write" + writeI + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write" + writeI + ", i32 0, i32 0))\n";

                    if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                        llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                    }

                    if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                        llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                    }

                    //@mensaje = private unnamed_addr constant [ 20 x i8] c"Hola,Mama que tal!\0A\00"
                    String mensaje = ctx.write_contain(ii).TEXTWRITE().getText().replace("\'","");

                    int mensajeSize = mensaje.length()+2;
                    llvmEND+="@mensaje_write" + writeI +" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\00\\00\"\n\n";

                    llvmBody+="%valorImp1_write" + writeI + " = getelementptr [100 x i8], [100 x i8]* %write" + writeI + ", i32 0, i32 0\n";
                    llvmBody+="%valorImp2_write" + writeI + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write" + writeI + ", i32 0, i32 0), i8* %valorImp1_write" + writeI + ") \n";

                    llvmEND+="@formato_write" + writeI + " = private unnamed_addr constant [4 x i8] c\"%s\\00\\00\"\n";
            }

            if(ctx.write_contain(ii).CHAR()!=null){

                llvmBody+="%write" + writeI + " = alloca [100 x i8], align 1\n";
                llvmBody+="%valor_write" + writeI + " = getelementptr [100 x i8], [100 x i8]* %write"+writeI + ", i32 0, i32 0\n";
                llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write" + writeI + ", i8 0, i32 20, i1 false)\n";
                llvmBody+="call void @strcpy(i8* %valor_write" + writeI + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write" + writeI + ", i32 0, i32 0))\n";

                if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                    llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                }

                if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                    llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                }

                //@mensaje = private unnamed_addr constant [ 20 x i8] c"Hola,Mama que tal!\0A\00"
                String mensaje = ctx.write_contain(ii).CHAR().getText().replace("\'","");

                int mensajeSize = mensaje.length()+2;
                llvmEND+="@mensaje_write" + writeI +" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\00\\00\"\n\n";

                llvmBody+="%valorImp1_write" + writeI + " = getelementptr [100 x i8], [100 x i8]* %write" + writeI + ", i32 0, i32 0\n";
                llvmBody+="%valorImp2_write" + writeI + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write" + writeI + ", i32 0, i32 0), i8* %valorImp1_write" + writeI + ") \n";

                llvmEND+="@formato_write" + writeI + " = private unnamed_addr constant [4 x i8] c\"%s\\00\\00\"\n";
            }
        }
        return null;
    }

    @Override
    public Object visitIf_statement(InterpreterParser.If_statementContext ctx) {
        ifStatement++;
        String tipo = "";
        String llvm2 = "";
        String operacion = "";
        if(ctx.comparison()!=null){
            if(ctx.comparison().operaciones().EQUALS()!=null)
                operacion = "eq";
            if(ctx.comparison().operaciones().LESS_THAN()!=null)
                operacion = "slt";
            if(ctx.comparison().operaciones().GREATER_THAN()!=null)
                operacion = "sgt";
            if(ctx.comparison().operaciones().NOT_EQUALS()!=null)
                operacion = "ne";
            if(ctx.comparison().operaciones().LESS_THAN_OR_EQUALS()!=null)
                operacion = "sle";
            if(ctx.comparison().operaciones().GREATER_THAN_OR_EQUALS()!=null)
                operacion = "sge";

           for(int i=0; i<ctx.comparison().terms().size(); i++){
               if(ctx.comparison().terms(i).TEXT()!=null){
                   String firstId = "compTexto_"+ifStatement + "_" + i;

                   llvmBody+="%" + firstId + " = alloca [100 x i8], align 1\n";

                   llvmBody+="%valor_" + firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                   llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_" + firstId + ", i8 0, i32 20, i1 false)\n";
                   llvmBody+="call void @strcpy(i8* %valor_" + firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_" + firstId + ", i32 0, i32 0))\n";

                   if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                       llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                   }
                   if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                       llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                   }

                   String mensaje = ctx.comparison().terms(i).TEXT().getText().replace("\"","");

                   int mensajeSize = mensaje.length()+2;
                   llvmEND+="@mensaje_"+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\00\\00\"\n\n";

                   if(i==0){
                       llvm2+="%camp_result"+ ifStatement + " = call i32 @strcmp(i8* %valor_" + firstId;
                   }else{
                       llvm2+=", i8* %valor_" + firstId + ")"  + "\n";
                   }

                   if(!llvmDeclarations.contains("declare i32 @strcmp(i8*, i8*)")){
                       llvmDeclarations+="declare i32 @strcmp(i8*, i8*)\n\n";
                   }
                   //%condicion_1 = icmp eq i32 %comp_result, 0
                   if(i==1){
                       llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i32 %camp_result" + ifStatement + ", 0\n";
                   }

               }
               if(ctx.comparison().terms(i).NUMBER()!=null){

                   if(i==0){
                       llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i32 " + Integer.parseInt(ctx.comparison().terms(i).NUMBER().getText());
                   }else{
                       llvm2+= ", " + Integer.parseInt(ctx.comparison().terms(i).NUMBER().getText()) + "\n";
                   }

               }
               if(ctx.comparison().terms(i).ID()!=null){
                   String idname = ctx.comparison().terms(i).getText();
                   if(symbolVariableTable.containsKey(idname)){
                       EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(idname);
                       tipo = entry1.getType();
                   }else{
                       EntryConst entry1 = (EntryConst) symbolConstTable.get(idname);
                       tipo = entry1.getType();
                   }

                   if(tipo.equalsIgnoreCase("integer")){
                       llvmBody+="%if_comp_"+ ifStatement + "_" + idname + " = load i32, i32* %" + idname + "\n";
                   }
                   if(tipo.equalsIgnoreCase("string")){
                       llvmBody+="%stringcomp_" + ifStatement + idname + " = getelementptr [100 x i8], [100 x i8]* %" + idname + ", i32 0, i32 0\n";
                       if(i==0){
                           llvm2+="%camp_result"+ ifStatement + " = call i32 @strcmp(i8* %stringcomp_" + ifStatement + idname;
                       }else{
                           llvm2+=", i8* %stringcomp_" + ifStatement + idname+ ")"  + "\n";
                       }
                   }
                   if(tipo.equalsIgnoreCase("char")){
                       llvmBody+="%if_comp_"+ ifStatement + "_" + idname + " = load i8, i8* %" + idname + "\n";
                   }
                   if(tipo.equalsIgnoreCase("boolean")){
                       llvmBody+="%if_comp_"+ ifStatement + "_" + idname + " = load i1, i1* %" + idname + "\n";
                   }

                   if(tipo.equalsIgnoreCase("integer")){
                       if (i == 0) {
                           llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i32 %" + "if_comp_"+ ifStatement + "_" + idname;
                       }else{
                           llvm2+=", %" + "if_comp_"+ ifStatement + "_" + idname + "\n";
                       }
                   }
                   if(tipo.equalsIgnoreCase("string")){
                       if(!llvmDeclarations.contains("declare i32 @strcmp(i8*, i8*)")){
                           llvmDeclarations+="declare i32 @strcmp(i8*, i8*)\n\n";
                       }
                       //%condicion_1 = icmp eq i32 %comp_result, 0
                       if(i==1){
                           llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i32 %camp_result" + ifStatement + ", 0\n";
                       }
                   }
                   if(tipo.equalsIgnoreCase("boolean")){
                       if (i == 0) {
                           llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i1 %" + "if_comp_"+ ifStatement + "_" + idname;
                       }else{
                           llvm2+=", %" + "if_comp_"+ ifStatement + "_" + idname + "\n";
                       }
                   }
                   if(tipo.equalsIgnoreCase("char")){
                       if (i == 0) {
                           llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i8 %" + "if_comp_"+ ifStatement + "_" + idname;
                       }else{
                           llvm2+=", %" + "if_comp_"+ ifStatement + "_" + idname + "\n";
                       }
                   }
               }
               if(ctx.comparison().terms(i).CHAR()!=null){
                   char caracter = ctx.comparison().terms(i).CHAR().getText().charAt(1);
                   int ascii = (int) caracter;

                   if(i==0){
                       llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i32 " + ascii;
                   }else{
                       llvm2+= ", " + ascii + "\n";
                   }

               }
               if(ctx.comparison().terms(i).BOOLEANVALUE()!=null){

                   boolean valorB;

                   if(ctx.comparison().terms(i).BOOLEANVALUE().getText().equalsIgnoreCase("true"))
                       valorB = true;
                   else
                       valorB = false;

                   if(i==0){
                       llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i1 " + valorB;
                   }else{
                       llvm2+= ", " + valorB + "\n";
                   }

               }
               if(ctx.comparison().terms(i).array_access()!=null){

                   String idname = "";

                   if(ctx.comparison().terms(i).array_access().index().NUMBER()!=null){
                       idname = "array_" + ctx.comparison().terms(i).array_access().ID().getText() + "_" + Integer.parseInt(ctx.comparison().terms(i).array_access().index().NUMBER().getText());
                   }else{

                       if(symbolVariableTable.containsKey(ctx.comparison().terms(i).array_access().index().ID().getText())){
                           EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(ctx.comparison().terms(i).array_access().index().ID().getText());
                           idname = "array_" + ctx.comparison().terms(i).array_access().ID().getText() + "_" + entry1.getValue();
                       }else{
                           EntryConst entry1 = (EntryConst) symbolConstTable.get(ctx.comparison().terms(i).array_access().index().ID().getText());
                           idname = "array_" + ctx.comparison().terms(i).array_access().ID().getText() + "_" + entry1.getValue();
                       }
                   }

                   EntryArray entry1 = (EntryArray) symbolArrayTable.get(ctx.comparison().terms(i).array_access().ID().getText());
                   tipo = entry1.getType();

                   if(tipo.equalsIgnoreCase("integer")){
                       llvmBody+="%if_comp_"+ ifStatement + "_" + idname + " = load i32, i32* %" + idname + "\n";
                   }
                   if(tipo.equalsIgnoreCase("string")){
                       if(i==0){
                           llvm2+="%camp_result"+ ifStatement + " = call i32 @strcmp(i8* %valor_" + idname;
                       }else{
                           llvm2+=", i8* %valor_" + idname + ")"  + "\n";
                       }
                   }
                   if(tipo.equalsIgnoreCase("char")){
                       llvmBody+="%if_comp_"+ ifStatement + "_" + idname + " = load i8, i8* %" + idname + "\n";
                   }
                   if(tipo.equalsIgnoreCase("boolean")){
                       llvmBody+="%if_comp_"+ ifStatement + "_" + idname + " = load i1, i1* %" + idname + "\n";
                   }

                   if(tipo.equalsIgnoreCase("integer")){
                       if (i == 0) {
                           llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i32 %" + "if_comp_"+ ifStatement + "_" + idname;
                       }else{
                           llvm2+=", %" + "if_comp_"+ ifStatement + "_" + idname + "\n";
                       }
                   }
                   if(tipo.equalsIgnoreCase("string")){
                       if(!llvmDeclarations.contains("declare i32 @strcmp(i8*, i8*)")){
                           llvmDeclarations+="declare i32 @strcmp(i8*, i8*)\n\n";
                       }
                       //%condicion_1 = icmp eq i32 %comp_result, 0
                       if(i==1){
                           llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i32 %camp_result" + ifStatement + ", 0\n";
                       }
                   }
                   if(tipo.equalsIgnoreCase("boolean")){
                       if (i == 0) {
                           llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i1 %" + "if_comp_"+ ifStatement + "_" + idname;
                       }else{
                           llvm2+=", %" + "if_comp_"+ ifStatement + "_" + idname + "\n";
                       }
                   }
                   if(tipo.equalsIgnoreCase("char")){
                       if (i == 0) {
                           llvm2+="%condicion_" + ifStatement + " = icmp " + operacion + " i8 %" + "if_comp_"+ ifStatement + "_" + idname;
                       }else{
                           llvm2+=", %" + "if_comp_"+ ifStatement + "_" + idname + "\n";
                       }
                   }

               }

               if(i==1){
                   llvmBody+=llvm2;
               }
           }
        }
        int inElse = ifStatement;
        llvmBody+="br i1 %condicion_" + ifStatement + ", label %bloque_then_" + ifStatement + ", label %bloque_else_" + ifStatement + "\n";

        llvmBody+="bloque_then_" + ifStatement + ":\n";
        for(int ii = 0; ii<ctx.if_statement2().size(); ii++){
            visit(ctx.if_statement2(ii));
        }
        llvmBody+="br label %fin_if \n";

        llvmBody+="bloque_else_" + inElse + ":\n";
        for(int ii = 0; ii<ctx.else_statement().size(); ii++){
            visit(ctx.else_statement(ii));
        }
        llvmBody+="br label %fin_if \n";
        llvmBody+="fin_if: \n";

        return null;
    }

    @Override
    public Object visitFor_loop(InterpreterParser.For_loopContext ctx) {

        String operacion = "";
        forI++;

        if(ctx.TO()!=null)
            operacion = "sle";
        else
            operacion = "sge";

        String indexName = ctx.ID().getText();

        if(ctx.forIndexValue().NUMBER()!=null){
            llvmBody+="store i32 "+ Integer.parseInt(ctx.forIndexValue().NUMBER().getText()) + ", i32* %" + indexName + "\n";
        }else{
            String assignName = "for_valor_" + indexName + "_" + forI;
            llvmBody+="%"+assignName+ " = load i32, i32* %" + ctx.forIndexValue().ID().getText() + "\n" +
                    "store i32 %" + assignName + ", i32* %" + indexName + "\n";
        }

        llvmBody+="br label %loop"+forI+".cond\n";

        llvmBody+="loop"+forI+".cond:\n";
        llvmBody+="%current_count"+forI+ " = load i32, i32* %"+indexName+"\n";

        int num = 0;

        if(ctx.forIndexLimit().NUMBER()!=null){
            num = Integer.parseInt(ctx.forIndexLimit().NUMBER().getText());
            llvmBody+="%compare"+ forI+ " = icmp " + operacion + " i32 %current_count" + forI + ", " + num + "\n";
        }else{
            String assignName = "for_valor_lim" + indexName + "_" + forI;
            llvmBody+="%"+assignName+ " = load i32, i32* %" + ctx.forIndexLimit().ID().getText() + "\n";
            llvmBody+="%compare"+ forI+ "icmp " + operacion + " i32 %current_count" + forI + ", %" + assignName + "\n";
        }

        llvmBody+="br i1 %compare"+ forI+", label %loop"+forI+".body, label %loop"+forI+".end\n";

        llvmBody+="loop"+ forI +".body:\n";
        int inforS = forI;

        for(int i=0; i<ctx.statement_bucle().size();i++){
            visit(ctx.statement_bucle(i));
        }

        llvmBody+="%current_count_next"+inforS+ " = load i32, i32* %"+indexName+"\n";
        llvmBody+="%current_count_incr"+inforS+ " = add i32 %current_count_next"+inforS+", 1\n";
        llvmBody+="store i32 %current_count_incr"+inforS+ ", i32* %"+indexName+"\n";
        llvmBody+="br label %loop"+inforS+".cond\n";
        llvmBody+="loop"+inforS+".end:\n";


        return null;
    }

    @Override
    public Object visitWhile_loop(InterpreterParser.While_loopContext ctx) {
        String operacion = "";
        String llvm2 = "";
        String tipo = "";
        whileI++;

        if(ctx.comparison().operaciones().EQUALS()!=null)
            operacion = "eq";
        if(ctx.comparison().operaciones().LESS_THAN()!=null)
            operacion = "slt";
        if(ctx.comparison().operaciones().GREATER_THAN()!=null)
            operacion = "sgt";
        if(ctx.comparison().operaciones().NOT_EQUALS()!=null)
            operacion = "ne";
        if(ctx.comparison().operaciones().LESS_THAN_OR_EQUALS()!=null)
            operacion = "sle";
        if(ctx.comparison().operaciones().GREATER_THAN_OR_EQUALS()!=null)
            operacion = "sge";

        llvmBody+="br label %whileLoop"+whileI+".cond\n" + "whileLoop"+whileI+".cond:\n";

        for(int i=0; i<ctx.comparison().terms().size(); i++){
            if(ctx.comparison().terms(i).TEXT()!=null){
                String firstId = "compTextoWhile_"+whileI + "_" + i;

                llvmBody+="%" + firstId + " = alloca [100 x i8], align 1\n";

                llvmBody+="%valor_" + firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_" + firstId + ", i8 0, i32 20, i1 false)\n";
                llvmBody+="call void @strcpy(i8* %valor_" + firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_" + firstId + ", i32 0, i32 0))\n";

                if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                    llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
                }
                if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                    llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
                }

                String mensaje = ctx.comparison().terms(i).TEXT().getText().replace("\"","");

                int mensajeSize = mensaje.length()+2;
                llvmEND+="@mensaje_"+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\00\\00\"\n\n";

                if(i==0){
                    llvm2+="%camp_resultWhile"+ whileI + " = call i32 @strcmp(i8* %valor_" + firstId;
                }else{
                    llvm2+=", i8* %valor_" + firstId + ")"  + "\n";
                }

                if(!llvmDeclarations.contains("declare i32 @strcmp(i8*, i8*)")){
                    llvmDeclarations+="declare i32 @strcmp(i8*, i8*)\n\n";
                }
                //%condicion_1 = icmp eq i32 %comp_result, 0
                if(i==1){
                    llvm2+="%condicionWhile_" + whileI + " = icmp " + operacion + " i32 %camp_resultWhile"+ whileI + ", 0\n";
                }

            }
            if(ctx.comparison().terms(i).NUMBER()!=null){

                if(i==0){
                    llvm2+="%condicionWhile_" + whileI + " = icmp " + operacion + " i32 " + Integer.parseInt(ctx.comparison().terms(i).NUMBER().getText());
                }else{
                    llvm2+= ", " + Integer.parseInt(ctx.comparison().terms(i).NUMBER().getText()) + "\n";
                }

            }
            if(ctx.comparison().terms(i).ID()!=null){
                String idname = ctx.comparison().terms(i).getText();
                if(symbolVariableTable.containsKey(idname)){
                    EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(idname);
                    tipo = entry1.getType();
                }else{
                    EntryConst entry1 = (EntryConst) symbolConstTable.get(idname);
                    tipo = entry1.getType();
                }

                if(tipo.equalsIgnoreCase("integer")){
                    llvmBody+="%if_comp_while"+ whileI + "_" + idname + " = load i32, i32* %" + idname + "\n";
                }
                if(tipo.equalsIgnoreCase("string")){
                    llvmBody+="%stringcomp_" + ifStatement + idname + " = getelementptr [100 x i8], [100 x i8]* %" + idname + ", i32 0, i32 0\n";
                    if(i==0){
                        llvm2+="%camp_resultWhile"+ whileI + " = call i32 @strcmp(i8* %stringcomp_" + ifStatement + idname;
                    }else{
                        llvm2+=", i8* %stringcomp_" + ifStatement + idname + ")"  + "\n";
                    }
                }
                if(tipo.equalsIgnoreCase("char")){
                    llvmBody+="%if_comp_while"+ whileI + "_" + idname + " = load i8, i8* %" + idname + "\n";
                }
                if(tipo.equalsIgnoreCase("boolean")){
                    llvmBody+="%if_comp_while"+ whileI+ "_" + idname + " = load i1, i1* %" + idname + "\n";
                }

                if(tipo.equalsIgnoreCase("integer")){
                    if (i == 0) {
                        llvm2+="%condicionWhile_" + whileI + " = icmp " + operacion + " i32 %" + "if_comp_while"+ whileI + "_" + idname;
                    }else{
                        llvm2+=", %" + "if_comp_while"+ whileI + "_" + idname + "\n";
                    }
                }
                if(tipo.equalsIgnoreCase("string")){
                    if(!llvmDeclarations.contains("declare i32 @strcmp(i8*, i8*)")){
                        llvmDeclarations+="declare i32 @strcmp(i8*, i8*)\n\n";
                    }

                    if(i==1){
                        llvm2+="%condicionWhile_" + whileI+ " = icmp " + operacion + " i32 %camp_resultWhile"+ whileI + ", 0\n";
                    }
                }
                if(tipo.equalsIgnoreCase("boolean")){
                    if (i == 0) {
                        llvm2+="%condicionWhile_" + whileI + " = icmp " + operacion + " i1 %" + "if_comp_while"+ whileI + "_" + idname;
                    }else{
                        llvm2+=", %" + "if_comp_while"+ whileI + "_" + idname + "\n";
                    }
                }
                if(tipo.equalsIgnoreCase("char")){
                    if (i == 0) {
                        llvm2+="%condicionWhile_" + whileI + " = icmp " + operacion + " i8 %" + "if_comp_while"+ whileI + "_" + idname;
                    }else{
                        llvm2+=", %" + "if_comp_while"+ whileI + "_" + idname + "\n";
                    }
                }
            }
            if(ctx.comparison().terms(i).CHAR()!=null){
                char caracter = ctx.comparison().terms(i).CHAR().getText().charAt(1);
                int ascii = (int) caracter;

                if(i==0){
                    llvm2+="%condicionWhile_" + whileI+ " = icmp " + operacion + " i32 " + ascii;
                }else{
                    llvm2+= ", " + ascii + "\n";
                }

            }
            if(ctx.comparison().terms(i).BOOLEANVALUE()!=null){

                boolean valorB;

                if(ctx.comparison().terms(i).BOOLEANVALUE().getText().equalsIgnoreCase("true"))
                    valorB = true;
                else
                    valorB = false;

                if(i==0){
                    llvm2+="%condicionWhile_" + whileI + " = icmp " + operacion + " i1 " + valorB;
                }else{
                    llvm2+= ", " + valorB + "\n";
                }

            }
            if(ctx.comparison().terms(i).array_access()!=null){

                String idname = "";

                if(ctx.comparison().terms(i).array_access().index().NUMBER()!=null){
                    idname = "array_" + ctx.comparison().terms(i).array_access().ID().getText() + "_" + Integer.parseInt(ctx.comparison().terms(i).array_access().index().NUMBER().getText());
                }else{

                    if(symbolVariableTable.containsKey(ctx.comparison().terms(i).array_access().index().ID().getText())){
                        EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(ctx.comparison().terms(i).array_access().index().ID().getText());
                        idname = "array_" + ctx.comparison().terms(i).array_access().ID().getText() + "_" + entry1.getValue();
                    }else{
                        EntryConst entry1 = (EntryConst) symbolConstTable.get(ctx.comparison().terms(i).array_access().index().ID().getText());
                        idname = "array_" + ctx.comparison().terms(i).array_access().ID().getText() + "_" + entry1.getValue();
                    }
                }

                EntryArray entry1 = (EntryArray) symbolArrayTable.get(ctx.comparison().terms(i).array_access().ID().getText());
                tipo = entry1.getType();

                if(tipo.equalsIgnoreCase("integer")){
                    llvmBody+="%if_comp_while"+ whileI + "_" + idname + " = load i32, i32* %" + idname + "\n";
                }
                if(tipo.equalsIgnoreCase("string")){
                    if(i==0){
                        llvm2+="%camp_resultWhile"+ whileI + " = call i32 @strcmp(i8* %valor_" + idname;
                    }else{
                        llvm2+=", i8* %valor_" + idname + ")"  + "\n";
                    }
                }
                if(tipo.equalsIgnoreCase("char")){
                    llvmBody+="%if_comp_while"+ whileI + "_" + idname + " = load i8, i8* %" + idname + "\n";
                }
                if(tipo.equalsIgnoreCase("boolean")){
                    llvmBody+="%if_comp_while"+ whileI + "_" + idname + " = load i1, i1* %" + idname + "\n";
                }

                if(tipo.equalsIgnoreCase("integer")){
                    if (i == 0) {
                        llvm2+="%condicionWhile_" + whileI + " = icmp " + operacion + " i32 %" + "if_comp_while"+ whileI + "_" + idname;
                    }else{
                        llvm2+=", %" + "if_comp_while"+ whileI + "_" + idname + "\n";
                    }
                }
                if(tipo.equalsIgnoreCase("string")){
                    if(!llvmDeclarations.contains("declare i32 @strcmp(i8*, i8*)")){
                        llvmDeclarations+="declare i32 @strcmp(i8*, i8*)\n\n";
                    }

                    if(i==1){
                        llvm2+="%condicionWhile_" + whileI + " = icmp " + operacion + " i32 %camp_resultWhile"+ whileI + ", 0\n";
                    }
                }
                if(tipo.equalsIgnoreCase("boolean")){
                    if (i == 0) {
                        llvm2+="%condicionWhile_" + whileI + " = icmp " + operacion + " i1 %" + "if_comp_while"+ whileI + "_" + idname;
                    }else{
                        llvm2+=", %" + "if_comp_while"+ whileI+ "_" + idname + "\n";
                    }
                }
                if(tipo.equalsIgnoreCase("char")){
                    if (i == 0) {
                        llvm2+="%condicionWhile_" + whileI + " = icmp " + operacion + " i8 %" + "if_comp_while"+ whileI + "_" + idname;
                    }else{
                        llvm2+=", %" + "if_comp_while"+ whileI + "_" + idname + "\n";
                    }
                }

            }

            if(i==1){
                llvmBody+=llvm2;
            }
        }

        llvmBody+="br i1 %condicionWhile_" + whileI + ", label %whileLoop"+whileI+".body, label %whileLoop"+whileI+".end\n";
        llvmBody+="whileLoop"+whileI+".body:";

        int actualI = whileI;

        for(int i=0;i<ctx.statement_bucle().size();i++){
            visit(ctx.statement_bucle(i));
        }

        llvmBody+="br label %whileLoop"+actualI+".cond\nwhileLoop"+whileI+".end:\n";
        return null;
    }

    @Override
    public Object visitEndprogram(InterpreterParser.EndprogramContext ctx) {
        llvmBody += "\nret i32 0\n}\n\n";
        return null;
    }
    public String getllvm(){
        return llvmDeclarations + llvmHeader + llvmBody + llvmEND;
    }

    public void clearllvm(){
        llvmDeclarations="";
        llvmHeader="";
        llvmBody="";
        llvmEND="";

        symbolConstTable.clear();
        symbolVariableTable.clear();
        symbolArrayTable.clear();

        writeI = 0;
        expI = 0;
        ifStatement = 0;
        variable = "";
        forI = 0;
        whileI = 0;
        initString = 0;
    }
}