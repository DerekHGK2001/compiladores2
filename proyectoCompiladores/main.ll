declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0

declare i8* @strcpy(i8*, i8*) #1

declare i32 @printf(i8*, ...)

define i32 @main() {
%letra = alloca i8
%car = alloca i8
store i8 97, i8* %car
%hola = alloca [100 x i8], align 1
%valor_hola = getelementptr [100 x i8], [100 x i8]* %hola, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_hola, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_hola, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_hola, i32 0, i32 0))
store i8 98, i8* %letra
%valorImp_1_car = load i8, i8* %car
%formato_caracter_1_car = getelementptr [4 x i8], [4 x i8]* @formato_caracter_1_car, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_caracter_1_car, i8 %valorImp_1_car)
%valorImp_2_letra = load i8, i8* %letra
%formato_caracter_2_letra = getelementptr [4 x i8], [4 x i8]* @formato_caracter_2_letra, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_caracter_2_letra, i8 %valorImp_2_letra)
%valorImp1_3_hola = getelementptr [100 x i8], [100 x i8]* %hola, i32 0, i32 0
%valorImp2_3_hola = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_3_hola, i32 0, i32 0), i8* %valorImp1_3_hola) 

ret i32 0
}

@mensaje_hola = private unnamed_addr constant [6 x i8] c"hola\00\00"

@formato_caracter_1_car = constant [4 x i8] c"%c\0a\00"
@formato_caracter_2_letra = constant [4 x i8] c"%c\0a\00"
@formato_3_hola = private unnamed_addr constant [4 x i8] c"%s\00\00"
