declare i32 @printf(i8*, ...)

declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0

declare i8* @strcpy(i8*, i8*) #1

define i32 @main() {
%i = alloca i32
%b = alloca i32
store i32 0, i32* %i
br label %loop1.cond
loop1.cond:
%current_count1 = load i32, i32* %i
%compare1 = icmp sle i32 %current_count1, 5
br i1 %compare1, label %loop1.body, label %loop1.end
loop1.body:
%write1 = alloca [100 x i8], align 1
%valor_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write1, i32 0, i32 0))
%valorImp1_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
%valorImp2_write1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write1, i32 0, i32 0), i8* %valorImp1_write1) 
%valorImp_1_i = load i32, i32* %i
%formato_entero_1_i = getelementptr [4 x i8], [4 x i8]* @formato_entero_1_i, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_1_i, i32 %valorImp_1_i)
%current_count_next1 = load i32, i32* %i
%current_count_incr1 = add i32 %current_count_next1, 1
store i32 %current_count_incr1, i32* %i
br label %loop1.cond
loop1.end:

ret i32 0
}

%i = alloca i32
%b = alloca i32
store i32 0, i32* %i
br label %loop2.cond
loop2.cond:
%current_count2 = load i32, i32* %i
%compare2 = icmp sle i32 %current_count2, 5
br i1 %compare2, label %loop2.body, label %loop2.end
loop2.body:
%write2 = alloca [100 x i8], align 1
%valor_write2 = getelementptr [100 x i8], [100 x i8]* %write2, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write2, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write2, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write2, i32 0, i32 0))
%valorImp1_write2 = getelementptr [100 x i8], [100 x i8]* %write2, i32 0, i32 0
%valorImp2_write2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write2, i32 0, i32 0), i8* %valorImp1_write2) 
%valorImp_2_i = load i32, i32* %i
%formato_entero_2_i = getelementptr [4 x i8], [4 x i8]* @formato_entero_2_i, i32 0, i32 0
call i32 (i8*, ...) @printf(i8* %formato_entero_2_i, i32 %valorImp_2_i)
%current_count_next2 = load i32, i32* %i
%current_count_incr2 = add i32 %current_count_next2, 1
store i32 %current_count_incr2, i32* %i
br label %loop2.cond
loop2.end:

ret i32 0
}

@mensaje_write1 = private unnamed_addr constant [10 x i8] c"numero: \00\00"

@formato_write1 = private unnamed_addr constant [4 x i8] c"%s\00\00"
@formato_entero_1_i = constant [4 x i8] c"%d\0a\00"
@mensaje_write2 = private unnamed_addr constant [10 x i8] c"numero: \00\00"

@formato_write2 = private unnamed_addr constant [4 x i8] c"%s\00\00"
@formato_entero_2_i = constant [4 x i8] c"%d\0a\00"
