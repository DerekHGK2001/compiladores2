declare i32 @printf(i8*, ...)

define i32 @main() {
%resultado_sumar = alloca i32
%resultado_mult = alloca i32
%suma_1 = add i32 5, 10
store i32 %suma_1, i32* %resultado_sumar
%valorID_2resultado_sumar = load i32, i32* %resultado_sumar
%multiplicacion_2 = mul i32 %valorID_2resultado_sumar, 2
store i32 %multiplicacion_2, i32* %resultado_mult
%suma_2_2 = add i32 %multiplicacion_2, %valorID_2resultado_sumar
store i32 %suma_2_2, i32* %resultado_mult
%valorImp_1_resultado_sumar = load i32, i32* %resultado_sumar
%formato_entero_1_resultado_sumar = getelementptr [4 x i8], [4 x i8]* @formato_entero_1_resultado_sumar, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_1_resultado_sumar, i32 %valorImp_1_resultado_sumar)
%valorImp_2_resultado_mult = load i32, i32* %resultado_mult
%formato_entero_2_resultado_mult = getelementptr [4 x i8], [4 x i8]* @formato_entero_2_resultado_mult, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_2_resultado_mult, i32 %valorImp_2_resultado_mult)

ret i32 0
}

@formato_entero_1_resultado_sumar = constant [4 x i8] c"%d\0a\00"
@formato_entero_2_resultado_mult = constant [4 x i8] c"%d\0a\00"
