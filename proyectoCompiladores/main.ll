declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0

declare i8* @strcpy(i8*, i8*) #1

declare i32 @strcmp(i8*, i8*)

declare i32 @printf(i8*, ...)

define i32 @main() {
%a = alloca [100 x i8], align 1
%b = alloca [100 x i8], align 1
%c = alloca i32
%array_arreglo_1 = alloca [100 x i8], align 1
%array_arreglo_2 = alloca [100 x i8], align 1
%array_arreglo_3 = alloca [100 x i8], align 1
%array_arreglo_4 = alloca [100 x i8], align 1
%array_arreglo_5 = alloca [100 x i8], align 1
%valor_array_arreglo_1 = getelementptr [100 x i8], [100 x i8]* %array_arreglo_1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_array_arreglo_1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_array_arreglo_1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_array_arreglo_1, i32 0, i32 0))
%valor_a = getelementptr [100 x i8], [100 x i8]* %a, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_a, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_a, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_a, i32 0, i32 0))
%valor_b = getelementptr [100 x i8], [100 x i8]* %b, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_b, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_b, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_b, i32 0, i32 0))
store i32 0, i32* %c
%camp_result1 = call i32 @strcmp(i8* %valor_array_arreglo_1, i8* %valor_a)
%condicion_1 = icmp eq i32 %camp_result1, 0
br i1 %condicion_1, label %bloque_then_1, label %bloque_else_1
bloque_then_1:
%write1 = alloca [100 x i8], align 1
%valor_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write1, i32 0, i32 0))
%valorImp1_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
%valorImp2_write1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write1, i32 0, i32 0), i8* %valorImp1_write1) 
%if_comp_2_c = load i32, i32* %c
%condicion_2 = icmp eq i32 %if_comp_2_c, 1
br i1 %condicion_2, label %bloque_then_2, label %bloque_else_2
bloque_then_2:
%write2 = alloca [100 x i8], align 1
%valor_write2 = getelementptr [100 x i8], [100 x i8]* %write2, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write2, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write2, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write2, i32 0, i32 0))
%valorImp1_write2 = getelementptr [100 x i8], [100 x i8]* %write2, i32 0, i32 0
%valorImp2_write2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write2, i32 0, i32 0), i8* %valorImp1_write2) 
br label %fin_if 
bloque_else_2:
br label %fin_if 
fin_if: 
br label %fin_if 
bloque_else_1:
%write3 = alloca [100 x i8], align 1
%valor_write3 = getelementptr [100 x i8], [100 x i8]* %write3, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write3, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write3, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write3, i32 0, i32 0))
%valorImp1_write3 = getelementptr [100 x i8], [100 x i8]* %write3, i32 0, i32 0
%valorImp2_write3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write3, i32 0, i32 0), i8* %valorImp1_write3) 
br label %fin_if 
fin_if: 

ret i32 0
}

@mensaje_array_arreglo_1 = private unnamed_addr constant [3 x i8] c"a\00\00"

@mensaje_a = private unnamed_addr constant [3 x i8] c"a\00\00"

@mensaje_b = private unnamed_addr constant [3 x i8] c"a\00\00"

@mensaje_write1 = private unnamed_addr constant [10 x i8] c"es igual\00\00"

@formato_write1 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
@mensaje_write2 = private unnamed_addr constant [12 x i8] c"lo que sea\00\00"

@formato_write2 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
@mensaje_write3 = private unnamed_addr constant [13 x i8] c"no es igual\00\00"

@formato_write3 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
