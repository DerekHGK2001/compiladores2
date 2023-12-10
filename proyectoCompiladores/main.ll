declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0

declare i8* @strcpy(i8*, i8*) #1

declare i32 @strcmp(i8*, i8*)

declare i32 @printf(i8*, ...)

define i32 @main() {
%i = alloca i32
%b = alloca i32
%algo = alloca [100 x i8], align 1
%valor_algo = getelementptr [100 x i8], [100 x i8]* %algo, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_algo, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_algo, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_algo, i32 0, i32 0))
store i32 0, i32* %i
%compTexto_1_1 = alloca [100 x i8], align 1
%valor_compTexto_1_1 = getelementptr [100 x i8], [100 x i8]* %compTexto_1_1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_compTexto_1_1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_compTexto_1_1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_compTexto_1_1, i32 0, i32 0))
%camp_result1 = call i32 @strcmp(i8* %valor_algo, i8* %valor_compTexto_1_1)
%condicion_1 = icmp eq i32 %camp_result1, 0
br i1 %condicion_1, label %bloque_then_1, label %bloque_else_1
bloque_then_1:
%write1 = alloca [100 x i8], align 1
%valor_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write1, i32 0, i32 0))
%valorImp1_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
%valorImp2_write1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write1, i32 0, i32 0), i8* %valorImp1_write1) 
br label %fin_if 
bloque_else_1:
br label %fin_if 
fin_if: 

ret i32 0
}

@mensaje_algo = private unnamed_addr constant [6 x i8] c"hola\00\00"

@mensaje_compTexto_1_1 = private unnamed_addr constant [6 x i8] c"hola\00\00"

@mensaje_write1 = private unnamed_addr constant [8 x i8] c"algooo\00\00"

@formato_write1 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
