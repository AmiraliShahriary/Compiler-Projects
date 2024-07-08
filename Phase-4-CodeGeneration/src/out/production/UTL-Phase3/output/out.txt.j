.class public UTL 
.super java/lang/Object
.field
		ldc 0
.field
.method public <init>()V
		aload_0
		invokespecial java/lang/Object/<init>()V
.end method
.method public OnStart_t1(Ljava/lang/Object;)V
.limit stack 128
.limit locals 128
		ldc "SELL"
		ldc 100
		ldc 100
		ldc 10
		invokestatic Order(nullnullnullnull)V
		astore 3
.end method
.method public OnStart_t3(Ljava/lang/Object;)V
.limit stack 128
.limit locals 128
		ldc "BUY"
		ldc 200
		ldc 50
		ldc 5
		invokestatic Order(nullnullnullnull)V
		astore 4
		ldc "SELL"
		ldc 100
		ldc 100
		ldc 10
		invokestatic Order(nullnullnullnull)V
		astore 5
.end method
.method public OnStart_t1(Ljava/lang/Object;)V
.limit stack 128
.limit locals 128
		astore 6
		astore 7
		ldc 100
		astore 8
		ldc 250
		astore 9
		ldc 20
		astore 10
		ldc "BUY"
		invokestatic Order(nullnullnullnull)V
		astore 4
		astore 11
.end method
.method public OnStart_t3(Ljava/lang/Object;)V
.limit stack 128
.limit locals 128
.end method
.method public main()V
.limit stack 128
.limit locals 128
		ldc "admin"
		astore 12
		ldc "USDETH"
		invokestatic Observe(null)V
		astore 13
		ldc "IRRETH"
		invokestatic Observe(null)V
		astore 14
.end method
		 
