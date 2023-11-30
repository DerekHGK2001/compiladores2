package Interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class visitorsLLVM extends InterpreterBaseVisitor {
    private static Map<String, Object> symbolVariableTable = new HashMap<>();
    private static Map<String, Object> symbolConstTable = new HashMap<>();
    private static String llvmDeclarations = "";
    private static String llvmHeader = "";
    private static String llvmBody = "";
    private static String llvmEND = "";

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
            symbolVariableTable.put(name, entry);

        }

        return null;
    }

    @Override
    public Object visitVariable_init(InterpreterParser.Variable_initContext ctx) {
        List<TerminalNode> idNodes = ctx.getTokens(InterpreterLexer.ID);

        String firstId = idNodes.get(0).getText();
        EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(firstId);
        String firstTypeId = entry1.getType();

        if (idNodes.size() == 2) {
            String secondId = idNodes.get(1).getText();

            if(symbolVariableTable.containsKey(secondId)){
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(secondId);
                String secondTypeId = entry.getType();

                if(secondTypeId.equalsIgnoreCase("integer")){

                    llvmBody+="%valor_" + firstId + " = load i32, i32* %"+secondId + "\n";
                    llvmBody+="store i32 %valor_" + firstId + ", i32* %"+firstId + "\n";

                }
                if(secondTypeId.equalsIgnoreCase("string")){

                    llvmBody+="%valor_" + firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
                    llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_" + firstId + ", i8 0, i32 20, i1 false)\n";
                    if(llvmBody.contains("valor_" + secondId + " = getelementptr")){

                        llvmBody+="call void @strcpy(i8* %valor_" + firstId + ", i8* %valor_" + secondId + ")\n";
                    }else{
                        llvmBody+="call void @strcpy(i8* %valor_" + firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_" + firstId + ", i32 0, i32 0))\n";

                        String mensaje = " ";

                        int mensajeSize = mensaje.length()+2;
                        llvmEND+="@mensaje_"+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\0A\\00\"\n\n";
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

                }
                if(secondTypeId.equalsIgnoreCase("string")){

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

        if(ctx.NUMBER()!=null){
            llvmBody+="store i32 " + Integer.parseInt(ctx.NUMBER().getText()) + ", i32* %"+firstId + "\n";
        }

        if(ctx.CHAR()!=null){
            char caracter = ctx.CHAR().getText().charAt(1);
            int ascii = (int) caracter;
            llvmBody+="store i8 " + ascii + ", i8* %"+firstId + "\n";
        }

        if(ctx.TEXT()!=null){
            llvmBody+="%valor_" + firstId + " = getelementptr [100 x i8], [100 x i8]* %"+firstId + ", i32 0, i32 0\n";
            llvmBody+="call void @llvm.memset.p0i8.i32([100 x i8]* %valor_" + firstId + ", i8 0, i32 20, i1 false)\n";
            llvmBody+="call void @strcpy(i8* %valor_" + firstId + ", i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_" + firstId + ", i32 0, i32 0))\n";

            if(!llvmDeclarations.contains("declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0")){
                llvmDeclarations+="declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0\n\n";
            }

            if(!llvmDeclarations.contains("declare i8* @strcpy(i8*, i8*) #1")){
                llvmDeclarations+="declare i8* @strcpy(i8*, i8*) #1\n\n";
            }

            //@mensaje = private unnamed_addr constant [ 20 x i8] c"Hola,Mama que tal!\0A\00"
            String mensaje = ctx.TEXT().getText().replace("\"","");

            int mensajeSize = mensaje.length()+2;
            llvmEND+="@mensaje_"+firstId+" = private unnamed_addr constant [" +mensajeSize + " x i8] c\""+ mensaje +"\\0A\\00\"\n\n";
        }

        if(ctx.BOOLEANVALUE()!=null){
            boolean valorB = false;

            if(ctx.BOOLEANVALUE().getText().equalsIgnoreCase("true"))
                valorB = true;
            else
                valorB = false;

            llvmBody+="store i1 " + valorB + ", i1* %"+firstId + "\n";
        }

        if(ctx.simple_expression()!=null){

        }

        return null;
    }

    @Override
    public Object visitWriteln_stmt(InterpreterParser.Writeln_stmtContext ctx) {

        if(!llvmDeclarations.contains("declare i32 @printf(i8*, ...)")){
            llvmDeclarations+="declare i32 @printf(i8*, ...)\n\n";
        }

        if(ctx.ID()!=null){
            for(int i =0; i<ctx.ID().size();i++){

                String idTerm = ctx.ID(i).getText();

                EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(idTerm);
                String tipo = entry1.getType();

                if(tipo.equalsIgnoreCase("integer")){
                    llvmBody+="%valorImp_"+idTerm+ " = load i32, i32* %" + idTerm + "\n";
                    llvmBody+="%formato_entero_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_entero_" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_entero_" + idTerm + ", i32 %valorImp_" + idTerm + ")\n";

                    llvmEND+="@formato_entero_"+idTerm + " = constant [4 x i8] c\"%d\\0a\\00\"\n";
                }
                if(tipo.equalsIgnoreCase("string")){
                    llvmBody+="%valorImp1_"+idTerm+ " = getelementptr [100 x i8], [100 x i8]* %" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="%valorImp2_"+idTerm+ " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_" + idTerm + ", i32 0, i32 0), i8* %valorImp1_" + idTerm + ") \n";

                    llvmEND+="@formato_"+ idTerm + " = private unnamed_addr constant [4 x i8] c\"%s\\0A\\00\"\n";
                }
                if(tipo.equalsIgnoreCase("char")){

                    llvmBody+="%valorImp_"+idTerm+ " = load i8, i8* %" + idTerm + "\n";
                    llvmBody+="%formato_caracter_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_caracter_" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_caracter_" + idTerm + ", i8 %valorImp_" + idTerm + ")\n";

                    llvmEND+="@formato_caracter_"+idTerm + " = constant [4 x i8] c\"%c\\0a\\00\"\n";

                }
                if(tipo.equalsIgnoreCase("boolean")){
                    llvmBody+="%valorImp_"+idTerm+ " = load i1, i1* %" + idTerm + "\n";
                    llvmBody+="%formato_booleano_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_booleano_" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_booleano_" + idTerm + ", i1 %valorImp_" + idTerm + ")\n";

                    llvmEND+="@formato_booleano_"+idTerm + " = constant [4 x i8] c\"%d\\0a\\00\"\n";

                }

            }
        }
        return null;
    }

    @Override
    public Object visitWrite(InterpreterParser.WriteContext ctx) {
        if(!llvmDeclarations.contains("declare i32 @printf(i8*, ...)")){
            llvmDeclarations+="declare i32 @printf(i8*, ...)\n\n";
        }

        if(ctx.ID()!=null){
            for(int i =0; i<ctx.ID().size();i++){

                String idTerm = ctx.ID(i).getText();

                EntryVariable entry1 = (EntryVariable) symbolVariableTable.get(idTerm);
                String tipo = entry1.getType();

                if(tipo.equalsIgnoreCase("integer")){
                    llvmBody+="%valorImp_"+idTerm+ " = load i32, i32* %" + idTerm + "\n";
                    llvmBody+="%formato_entero_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_entero_" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_entero_" + idTerm + ", i32 %valorImp_" + idTerm + ")\n";

                    llvmEND+="@formato_entero_"+idTerm + " = constant [4 x i8] c\"%d\\00\\00\"\n";
                }
                if(tipo.equalsIgnoreCase("string")){
                    llvmBody+="%valorImp1_"+idTerm+ " = getelementptr [100 x i8], [100 x i8]* %" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="%valorImp2_"+idTerm+ " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_" + idTerm + ", i32 0, i32 0), i8* %valorImp1_" + idTerm + ") \n";

                    llvmEND+="@formato_"+ idTerm + " = private unnamed_addr constant [4 x i8] c\"%s\\00\\00\"\n";
                }
                if(tipo.equalsIgnoreCase("char")){

                    llvmBody+="%valorImp_"+idTerm+ " = load i8, i8* %" + idTerm + "\n";
                    llvmBody+="%formato_caracter_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_caracter_" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_caracter_" + idTerm + ", i8 %valorImp_" + idTerm + ")\n";

                    llvmEND+="@formato_caracter_"+idTerm + " = constant [4 x i8] c\"%c\\00\\00\"\n";

                }
                if(tipo.equalsIgnoreCase("boolean")){
                    llvmBody+="%valorImp_"+idTerm+ " = load i1, i1* %" + idTerm + "\n";
                    llvmBody+="%formato_booleano_"+idTerm+ " = getelementptr [4 x i8], [4 x i8]* @formato_booleano_" + idTerm + ", i32 0, i32 0\n";
                    llvmBody+="call i32 (i8*, ...) @printf(i8* %formato_booleano_" + idTerm + ", i1 %valorImp_" + idTerm + ")\n";

                    llvmEND+="@formato_booleano_"+idTerm + " = constant [4 x i8] c\"%d\\00\\00\"\n";

                }

            }
        }
        return null;
    }

    @Override
    public Object visitEndprogram(InterpreterParser.EndprogramContext ctx) {

        llvmBody += "\nret i32 0\n}\n\n";

        System.out.println(llvmDeclarations + llvmHeader + llvmBody + llvmEND);
        return null;
    }
    public String getllvm(){
        return llvmDeclarations + llvmHeader + llvmBody + llvmEND;
    }
}