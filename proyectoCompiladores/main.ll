declare void @llvm.memset.p0i8.i32(i8* nocapture, i8, i32, i1) #0

declare i8* @strcpy(i8*, i8*) #1

declare i32 @printf(i8*, ...)

define i32 @main() {
%array_lista_1 = alloca [100 x i8], align 1
%array_lista_2 = alloca [100 x i8], align 1
%array_lista_3 = alloca [100 x i8], align 1
%array_lista_4 = alloca [100 x i8], align 1
%array_lista_5 = alloca [100 x i8], align 1
%i = alloca i32
%valor_1array_lista_1 = getelementptr [100 x i8], [100 x i8]* %array_lista_1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_1array_lista_1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_1array_lista_1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_1array_lista_1, i32 0, i32 0))
%valor_2array_lista_2 = getelementptr [100 x i8], [100 x i8]* %array_lista_2, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_2array_lista_2, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_2array_lista_2, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_2array_lista_2, i32 0, i32 0))
%valor_3array_lista_3 = getelementptr [100 x i8], [100 x i8]* %array_lista_3, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_3array_lista_3, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_3array_lista_3, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_3array_lista_3, i32 0, i32 0))
%valor_4array_lista_4 = getelementptr [100 x i8], [100 x i8]* %array_lista_4, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_4array_lista_4, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_4array_lista_4, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_4array_lista_4, i32 0, i32 0))
%valor_5array_lista_5 = getelementptr [100 x i8], [100 x i8]* %array_lista_5, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_5array_lista_5, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_5array_lista_5, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_5array_lista_5, i32 0, i32 0))
store i32 1, i32* %i
%write1 = alloca [100 x i8], align 1
%valor_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write1, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write1, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write1, i32 0, i32 0))
%valorImp1_write1 = getelementptr [100 x i8], [100 x i8]* %write1, i32 0, i32 0
%valorImp2_write1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write1, i32 0, i32 0), i8* %valorImp1_write1) 
store i32 1, i32* %i
br label %loop1.cond
loop1.cond:
%current_count1 = load i32, i32* %i
%compare1 = icmp sle i32 %current_count1, 5
br i1 %compare1, label %loop1.body, label %loop1.end
loop1.body:
%write2 = alloca [100 x i8], align 1
%valor_write2 = getelementptr [100 x i8], [100 x i8]* %write2, i32 0, i32 0
call void @llvm.memset.p0i8.i32([100 x i8]* %valor_write2, i8 0, i32 20, i1 false)
call void @strcpy(i8* %valor_write2, i8* getelementptr inbounds ([12 x i8], [12 x i8]* @mensaje_write2, i32 0, i32 0))
%valorImp1_write2 = getelementptr [100 x i8], [100 x i8]* %write2, i32 0, i32 0
%valorImp2_write2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_write2, i32 0, i32 0), i8* %valorImp1_write2) 
%valorImp1_2_array_lista_1 = getelementptr [100 x i8], [100 x i8]* %array_lista_1, i32 0, i32 0
%valorImp2_2_array_lista_1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @formato_2_array_lista_1, i32 0, i32 0), i8* %valorImp1_2_array_lista_1) 
%current_count_next1 = load i32, i32* %i
%current_count_incr1 = add i32 %current_count_next1, 1
store i32 %current_count_incr1, i32* %i
br label %loop1.cond
loop1.end:

ret i32 0
}

@mensaje_1array_lista_1 = private unnamed_addr constant [6 x i8] c"Nick\00\00"

@mensaje_2array_lista_2 = private unnamed_addr constant [6 x i8] c"Jack\00\00"

@mensaje_3array_lista_3 = private unnamed_addr constant [8 x i8] c"Monica\00\00"

@mensaje_4array_lista_4 = private unnamed_addr constant [7 x i8] c"Tulio\00\00"

@mensaje_5array_lista_5 = private unnamed_addr constant [9 x i8] c"Bardock\00\00"

@mensaje_write1 = private unnamed_addr constant [24 x i8] c"Nombres en el arreglo:\00\00"

@formato_write1 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
@mensaje_write2 = private unnamed_addr constant [12 x i8] c"Nombre :  \00\00"

@formato_write2 = private unnamed_addr constant [4 x i8] c"%s\00\00"
@formato_2_array_lista_1 = private unnamed_addr constant [4 x i8] c"%s\0a\00"
