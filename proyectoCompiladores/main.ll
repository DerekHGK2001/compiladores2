declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0

declare i8* @strcpy(i8*, i8*) #1

declare i32 @printf(i8*, ...)

define i32 @main() {
%i = alloca i32
%b = alloca i32
%algo = alloca [100 x i8], align 1
%hola = alloca [100 x i8], align 1
%array_arreglo_1 = alloca [100 x i8], align 1
%array_arreglo_2 = alloca [100 x i8], align 1
%array_arreglo_3 = alloca [100 x i8], align 1
%array_arreglo_4 = alloca [100 x i8], align 1
%array_arreglo_5 = alloca [100 x i8], align 1
%array_arreglo2_1 = alloca [100 x i8], align 1
%array_arreglo2_2 = alloca [100 x i8], align 1
%array_arreglo2_3 = alloca [100 x i8], align 1
%array_arreglo2_4 = alloca [100 x i8], align 1
%array_arreglo2_5 = alloca [100 x i8], align 1
%valor_1array_arreglo_1 = getelementptr [100 x i8], [100 x i8]* %array_arreglo_1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_1array_arreglo_1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_1array_arreglo_1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_1array_arreglo_1, i32 0, i32 0))
%valor_2array_arreglo2_1 = getelementptr [100 x i8], [100 x i8]* %array_arreglo2_1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_2array_arreglo2_1, i8 0, i32 20, i1 false)
%valor_2array_arreglo_1 = getelementptr [100 x i8], [100 x i8]* %array_arreglo_1, i32 0, i32 0
call void @strcpy(i8* %valor_2array_arreglo2_1, i8* %valor_2array_arreglo_1)
store i32 0, i32* %i
%valorImp1_1_array_arreglo2_1 = getelementptr [100 x i8], [100 x i8]* %array_arreglo2_1, i32 0, i32 0
%valorImp2_1_array_arreglo2_1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_1_array_arreglo2_1, i32 0, i32 0), i8* %valorImp1_1_array_arreglo2_1) 

ret i32 0
}

@mensaje_1array_arreglo_1 = private unnamed_addr constant [5 x i8] c"100\00\00"

@formato_1_array_arreglo2_1 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
