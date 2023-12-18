declare i32 @printf(i8*, ...)

declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0

declare i8* @strcpy(i8*, i8*) #1

define i32 @main() {
%i = alloca i32
%j = alloca i32
%Lado = alloca i32
store i32 5, i32* %Lado
store i32 1, i32* %i
br label %whileLoop1.cond
whileLoop1.cond:
%if_comp_while1_i = load i32, i32* %i
%if_comp_while1_Lado = load i32, i32* %Lado
%condicionWhile_1 = icmp sle i32 %if_comp_while1_i, %if_comp_while1_Lado
br i1 %condicionWhile_1, label %whileLoop1.body, label %whileLoop1.end
whileLoop1.body:store i32 1, i32* %j
br label %whileLoop2.cond
whileLoop2.cond:
%if_comp_while2_j = load i32, i32* %j
%if_comp_while2_Lado = load i32, i32* %Lado
%condicionWhile_2 = icmp sle i32 %if_comp_while2_j, %if_comp_while2_Lado
br i1 %condicionWhile_2, label %whileLoop2.body, label %whileLoop2.end
whileLoop2.body:%write1 = alloca [100 x i8], align 1
%valor_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write1, i32 0, i32 0))
%valorImp1_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
%valorImp2_write1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write1, i32 0, i32 0), i8* %valorImp1_write1) 
%valorID_1j = load i32, i32* %j
%suma_1 = add i32 %valorID_1j, 1
store i32 %suma_1, i32* %j
br label %whileLoop2.cond
whileLoop2.end:
%write2 = alloca [100 x i8], align 1
%valor_write2 = getelementptr [100 x i8], [100 x i8]* %write2, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write2, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write2, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write2, i32 0, i32 0))
%valorImp1_write2 = getelementptr [100 x i8], [100 x i8]* %write2, i32 0, i32 0
%valorImp2_write2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write2, i32 0, i32 0), i8* %valorImp1_write2) 
%valorID_2i = load i32, i32* %i
%suma_2 = add i32 %valorID_2i, 1
store i32 %suma_2, i32* %i
br label %whileLoop1.cond
whileLoop1.end:

ret i32 0
}

@mensaje_write1 = private unnamed_addr constant [4 x i8] c"* \00\00"

@formato_write1 = private unnamed_addr constant [4 x i8] c"%s\00\00"
@mensaje_write2 = private unnamed_addr constant [3 x i8] c" \00\00"

@formato_write2 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
