declare i32 @printf(i8*, ...)

define i32 @main() {
%resultado_sumar = alloca i32
%resultado_mult = alloca i32
%total = alloca i32
%suma_1 = add i32 5, 10
store i32 %suma_1, i32* %resultado_sumar
%valorID_2resultado_sumar = load i32, i32* %resultado_sumar
%multiplicacion_2 = mul i32 %valorID_2resultado_sumar, 2
store i32 %multiplicacion_2, i32* %resultado_mult
%valorID_3resultado_mult = load i32, i32* %resultado_mult
%division_3 = sdiv i32 %valorID_3resultado_mult, 10
store i32 %division_3, i32* %total
%valorImp_1_resultado_sumar = load i32, i32* %resultado_sumar
%formato_entero_1_resultado_sumar = getelementptr [4 x i8], [4 x i8]* @formato_entero_1_resultado_sumar, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_1_resultado_sumar, i32 %valorImp_1_resultado_sumar)
%valorImp_2_resultado_mult = load i32, i32* %resultado_mult
%formato_entero_2_resultado_mult = getelementptr [4 x i8], [4 x i8]* @formato_entero_2_resultado_mult, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_2_resultado_mult, i32 %valorImp_2_resultado_mult)
%valorImp_3_total = load i32, i32* %total
%formato_entero_3_total = getelementptr [4 x i8], [4 x i8]* @formato_entero_3_total, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_3_total, i32 %valorImp_3_total)

ret i32 0
}

@formato_entero_1_resultado_sumar = constant [4 x i8] c"%d\0a\00"
@formato_entero_2_resultado_mult = constant [4 x i8] c"%d\0a\00"
@formato_entero_3_total = constant [4 x i8] c"%d\0a\00"
