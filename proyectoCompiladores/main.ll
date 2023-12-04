declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0

declare i8* @strcpy(i8*, i8*) #1

declare i32 @printf(i8*, ...)

define i32 @main() {
%numero = alloca i32
%array_arreglo_1 = alloca [100 x i8], align 1
%array_arreglo_2 = alloca [100 x i8], align 1
%array_arreglo_3 = alloca [100 x i8], align 1
%array_arreglo_4 = alloca [100 x i8], align 1
%array_arreglo_5 = alloca [100 x i8], align 1
%array_arreglo2_1 = alloca i32
%array_arreglo2_2 = alloca i32
%array_arreglo2_3 = alloca i32
%array_arreglo2_4 = alloca i32
%array_arreglo2_5 = alloca i32
store i32 1, i32* %numero
%valor_array_arreglo_1 = getelementptr [100 x i8], [100 x i8]* %array_arreglo_1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_array_arreglo_1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_array_arreglo_1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_array_arreglo_1, i32 0, i32 0))
%valor_array_arreglo_2 = getelementptr [100 x i8], [100 x i8]* %array_arreglo_2, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_array_arreglo_2, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_array_arreglo_2, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_array_arreglo_2, i32 0, i32 0))
%valorImp1_1_array_arreglo_1 = getelementptr [100 x i8], [100 x i8]* %array_arreglo_1, i32 0, i32 0
%valorImp2_1_array_arreglo_1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_1_array_arreglo_1, i32 0, i32 0), i8* %valorImp1_1_array_arreglo_1) 
%valorID_1numero = load i32, i32* %numero
%suma_1 = add i32 1, %valorID_1numero
store i32 %suma_1, i32* %numero
%valorImp1_2_array_arreglo_2 = getelementptr [100 x i8], [100 x i8]* %array_arreglo_2, i32 0, i32 0
%valorImp2_2_array_arreglo_2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_2_array_arreglo_2, i32 0, i32 0), i8* %valorImp1_2_array_arreglo_2) 

ret i32 0
}

@mensaje_array_arreglo_1 = private unnamed_addr constant [12 x i8] c"no se maje\00\00"

@mensaje_array_arreglo_2 = private unnamed_addr constant [6 x i8] c"no s\00\00"

@formato_1_array_arreglo_1 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
@formato_2_array_arreglo_2 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
