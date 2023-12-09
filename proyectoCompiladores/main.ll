declare i32 @printf(i8*, ...)

define i32 @main() {
%i = alloca i32
%b = alloca i32
%algo = alloca i1
store i1 true, i1* %algo
store i32 0, i32* %i
br label %whileLoop1.cond
whileLoop1.cond:
%if_comp_while1_algo = load i1, i1* %algo
%condicionWhile_1 = icmp eq i1 %if_comp_while1_algo, true
br i1 %condicionWhile_1, label %whileLoop1.body, label %whileLoop1.end
whileLoop1.body:%valorID_1i = load i32, i32* %i
%suma_1 = add i32 %valorID_1i, 1
store i32 %suma_1, i32* %i
%if_comp_1_i = load i32, i32* %i
%condicion_1 = icmp eq i32 %if_comp_1_i, 10
br i1 %condicion_1, label %bloque_then_1, label %bloque_else_1
bloque_then_1:
store i1 false, i1* %algo
br label %fin_if 
bloque_else_1:
br label %fin_if 
fin_if: 
%valorImp_1_i = load i32, i32* %i
%formato_entero_1_i = getelementptr [4 x i8], [4 x i8]* @formato_entero_1_i, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_1_i, i32 %valorImp_1_i)
br label %whileLoop1.cond
whileLoop1.end:

ret i32 0
}

@formato_entero_1_i = constant [4 x i8] c"%d\0a\00"
