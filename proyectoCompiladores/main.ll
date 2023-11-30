declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0

declare i8* @strcpy(i8*, i8*) #1

declare i32 @printf(i8*, ...)

define i32 @main() {
%i = alloca i32
%i2 = alloca i32
%i3 = alloca i32
%texto = alloca [100 x i8], align 1
%texto2 = alloca [100 x i8], align 1
%letra = alloca i8
%entro = alloca i1
store i32 14, i32* %i2
store i8 65, i8* %letra
store i1 true, i1* %entro
%valor_texto = getelementptr [100 x i8], [100 x i8]* %texto, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_texto, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_texto, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_texto, i32 0, i32 0))
%valor_texto2 = getelementptr [100 x i8], [100 x i8]* %texto2, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_texto2, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_texto2, i8* %valor_texto)
%valor_i3 = load i32, i32* %i2
store i32 %valor_i3, i32* %i3
%valorImp1_texto = getelementptr [100 x i8], [100 x i8]* %texto, i32 0, i32 0
%valorImp2_texto = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_texto, i32 0, i32 0), i8* %valorImp1_texto) 
%valorImp1_texto2 = getelementptr [100 x i8], [100 x i8]* %texto2, i32 0, i32 0
%valorImp2_texto2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_texto2, i32 0, i32 0), i8* %valorImp1_texto2) 
%valorImp_i3 = load i32, i32* %i3
%formato_entero_i3 = getelementptr [4 x i8], [4 x i8]* @formato_entero_i3, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_i3, i32 %valorImp_i3)
%valorImp_i2 = load i32, i32* %i2
%formato_entero_i2 = getelementptr [4 x i8], [4 x i8]* @formato_entero_i2, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_i2, i32 %valorImp_i2)
%valorImp_letra = load i8, i8* %letra
%formato_caracter_letra = getelementptr [4 x i8], [4 x i8]* @formato_caracter_letra, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_caracter_letra, i8 %valorImp_letra)
%valorImp_entro = load i1, i1* %entro
%formato_booleano_entro = getelementptr [4 x i8], [4 x i8]* @formato_booleano_entro, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_booleano_entro, i1 %valorImp_entro)

ret i32 0
}

@mensaje_texto = private unnamed_addr constant [12 x i8] c"hola mundo\0A\00"

@formato_texto = private unnamed_addr constant [4 x i8] c"%s\00\00"
@formato_texto2 = private unnamed_addr constant [4 x i8] c"%s\00\00"
@formato_entero_i3 = constant [4 x i8] c"%d\0a\00"
@formato_entero_i2 = constant [4 x i8] c"%d\0a\00"
@formato_caracter_letra = constant [4 x i8] c"%c\0a\00"
@formato_booleano_entro = constant [4 x i8] c"%d\00\00"
