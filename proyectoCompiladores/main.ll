declare i32 @printf(i8*, ...)

define i32 @main() {
%resultado_sumar = alloca i32
%resultado_restar = alloca i32
%resultado_multiplicacion = alloca i32
%resultado_division = alloca i32
store i32 0, i32* %resultado_division
store i32 0, i32* %resultado_multiplicacion
store i32 0, i32* %resultado_restar
store i32 0, i32* %resultado_sumar
%valorImp_1_resultado_sumar = load i32, i32* %resultado_sumar
%formato_entero_1_resultado_sumar = getelementptr [4 x i8], [4 x i8]* @formato_entero_1_resultado_sumar, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_1_resultado_sumar, i32 %valorImp_1_resultado_sumar)
%valorImp_2_resultado_restar = load i32, i32* %resultado_restar
%formato_entero_2_resultado_restar = getelementptr [4 x i8], [4 x i8]* @formato_entero_2_resultado_restar, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_2_resultado_restar, i32 %valorImp_2_resultado_restar)
%valorImp_3_resultado_multiplicacion = load i32, i32* %resultado_multiplicacion
%formato_entero_3_resultado_multiplicacion = getelementptr [4 x i8], [4 x i8]* @formato_entero_3_resultado_multiplicacion, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_3_resultado_multiplicacion, i32 %valorImp_3_resultado_multiplicacion)
%valorImp_4_resultado_division = load i32, i32* %resultado_division
%formato_entero_4_resultado_division = getelementptr [4 x i8], [4 x i8]* @formato_entero_4_resultado_division, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_4_resultado_division, i32 %valorImp_4_resultado_division)
store i32 40, i32* %resultado_division
store i32 3, i32* %resultado_multiplicacion
store i32 5, i32* %resultado_restar
store i32 80, i32* %resultado_sumar
%valorImp_5_resultado_sumar = load i32, i32* %resultado_sumar
%formato_entero_5_resultado_sumar = getelementptr [4 x i8], [4 x i8]* @formato_entero_5_resultado_sumar, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_5_resultado_sumar, i32 %valorImp_5_resultado_sumar)
%valorImp_6_resultado_restar = load i32, i32* %resultado_restar
%formato_entero_6_resultado_restar = getelementptr [4 x i8], [4 x i8]* @formato_entero_6_resultado_restar, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_6_resultado_restar, i32 %valorImp_6_resultado_restar)
%valorImp_7_resultado_multiplicacion = load i32, i32* %resultado_multiplicacion
%formato_entero_7_resultado_multiplicacion = getelementptr [4 x i8], [4 x i8]* @formato_entero_7_resultado_multiplicacion, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_7_resultado_multiplicacion, i32 %valorImp_7_resultado_multiplicacion)
%valorImp_8_resultado_division = load i32, i32* %resultado_division
%formato_entero_8_resultado_division = getelementptr [4 x i8], [4 x i8]* @formato_entero_8_resultado_division, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_8_resultado_division, i32 %valorImp_8_resultado_division)

ret i32 0
}

@formato_entero_1_resultado_sumar = constant [4 x i8] c"%d\0a\00"
@formato_entero_2_resultado_restar = constant [4 x i8] c"%d\0a\00"
@formato_entero_3_resultado_multiplicacion = constant [4 x i8] c"%d\0a\00"
@formato_entero_4_resultado_division = constant [4 x i8] c"%d\0a\00"
@formato_entero_5_resultado_sumar = constant [4 x i8] c"%d\0a\00"
@formato_entero_6_resultado_restar = constant [4 x i8] c"%d\0a\00"
@formato_entero_7_resultado_multiplicacion = constant [4 x i8] c"%d\0a\00"
@formato_entero_8_resultado_division = constant [4 x i8] c"%d\0a\00"
