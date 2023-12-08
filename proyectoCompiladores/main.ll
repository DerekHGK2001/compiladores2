declare i32 @printf(i8*, ...)

declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0

declare i8* @strcpy(i8*, i8*) #1

define i32 @main() {
%a = alloca i32
%b = alloca i32
store i32 0, i32* %a
store i32 0, i32* %b
%if_comp_1_a = load i32, i32* %a
%if_comp_1_b = load i32, i32* %b
%condicion_1 = icmp sle i32 %if_comp_1_a, %if_comp_1_b
br i1 %condicion_1, label %bloque_then_1, label %bloque_else_1
bloque_then_1:
%write1 = alloca [100 x i8], align 1
%valor_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write1, i32 0, i32 0))
%valorImp1_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
%valorImp2_write1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write1, i32 0, i32 0), i8* %valorImp1_write1) 
br label %fin_if 
bloque_else_1:
%write2 = alloca [100 x i8], align 1
%valor_write2 = getelementptr [100 x i8], [100 x i8]* %write2, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write2, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write2, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write2, i32 0, i32 0))
%valorImp1_write2 = getelementptr [100 x i8], [100 x i8]* %write2, i32 0, i32 0
%valorImp2_write2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write2, i32 0, i32 0), i8* %valorImp1_write2) 
br label %fin_if 
fin_if: 

ret i32 0
}

@mensaje_write1 = private unnamed_addr constant [10 x i8] c"es igual\00\00"

@formato_write1 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
@mensaje_write2 = private unnamed_addr constant [13 x i8] c"no es igual\00\00"

@formato_write2 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
