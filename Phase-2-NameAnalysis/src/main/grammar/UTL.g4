grammar UTL;

@header{
    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.complexType.*;
    import main.ast.type.*;
}
// Parser rules
// do not change first rule (program) name

program returns [Program pro] : {$pro = new Program(); $pro.setLine(0);}
    ( varDeclaration { $pro.addVar($varDeclaration.varDecRet); }
    | functionDeclaration { $pro.addFunction($functionDeclaration.funcDecRet); }
    | initDeclaration { $pro.addInit($initDeclaration.initDecRet); }
    | startDeclaration { $pro.addStart($startDeclaration.startDecRet); }
    )* mainDeclaration { $pro.setMain($mainDeclaration.mainDecRet); }
    ;


statement returns [Statement statementRet] :
          ( varDeclaration { $statementRet = $varDeclaration.varDecRet; }
          | functionDeclaration { $statementRet = $functionDeclaration.funcDecRet; }
          | assignStatement { $statementRet = $assignStatement.assignStmtRet; }
          | continueBreakStatement { $statementRet = $continueBreakStatement.continueBreakStmtRet; }
          | returnStatement { $statementRet = $returnStatement.returnStmtRet; }
          | ifStatement { $statementRet = $ifStatement.ifStmtRet; }
          | whileStatement { $statementRet = $whileStatement.whileStmtRet; }
          | forStatement { $statementRet = $forStatement.forStmtRet; }
          | tryCatchStatement { $statementRet = $tryCatchStatement.tryCatchStmtRet; }
          | throwStatement { $statementRet = $throwStatement.throwStmtRet; }
          | expression SEMICOLON { ExpressionStmt temp = new ExpressionStmt($expression.expressionRet);$statementRet = temp; } //********************
          );

varDeclaration returns [VarDeclaration varDecRet] : { $varDecRet = new VarDeclaration(); }
    allType { $varDecRet.setType($allType.allTypeRet); }
    (LBRACK INT_LITERAL RBRACK { $varDecRet.setLength($INT_LITERAL.int); })?
    ID{varDecRer.setLine($ID.line);} (ASSIGN expression)? SEMICOLON { Identifier temp = new Identifier($ID.text); $varDecRet.setIdentifier(temp); $varDecRet.setLine($ID.line); };


functionDeclaration returns [FunctionDeclaration funcDecRet] : { $funcDecRet = new FunctionDeclaration(); }
    primitiveType { $funcDecRet.setReturnType($primitiveType.primitiveTypeRet); }
    ID {funcDecRet.setLine($ID.line()); Identifier temp = new Identifier($ID.text); $funcDecRet.setName(temp); $funcDecRet.setLine($ID.line); }
    LPAREN (a1 = allType (LBRACK int1 = INT_LITERAL RBRACK)? id1= ID {Identifier temp2 = new Identifier($id1.text);VarDeclaration temp1 = new VarDeclaration(); temp1.setType($a1.allTypeRet); temp1.setIdentifier(temp2); $funcDecRet.addArg(temp1); }
    (COMMA a2 = allType (LBRACK int2 = INT_LITERAL RBRACK)? id2 = ID { Identifier temp4 = new Identifier($id2.text);VarDeclaration temp3 = new VarDeclaration(); temp1.setType($a2.allTypeRet); temp1.setIdentifier(temp4); $funcDecRet.addArg(temp3);})*)?
    RPAREN (THROW EXCEPTION)? (LBRACE (st1 = statement { $funcDecRet.addStatement($st1.statementRet); })* RBRACE | st2 = statement { $funcDecRet.addStatement($st2.statementRet); });



assignStatement returns [AssignStmt assignStmtRet] :
    ID {assignStmtRet.setLine($ID.line())}(LBRACK expression RBRACK)? assign
    lValue = expression { $assignStmtRet = new AssignStmt(); $assignStmtRet.setLValue($lValue.expressionRet); }
    ASSIGN  rValue = expression
    SEMICOLON { $assignStmtRet.setRValue($rValue.expressionRet);  $assignStmtRet.setLine($SEMICOLON.line); };

///////////////////////////////////////////////////////////////////////
mainDeclaration returns [MainDeclaration mainDecRet] : { $mainDecRet = new MainDeclaration(); }
    VOID MAIN LPAREN RPAREN (LBRACE (s1=statement { $mainDecRet.addStatement($s1.statementRet); })* RBRACE
    | s2=statement { $mainDecRet.addStatement($s2.statementRet); });

///////////////////////////////////////////////////////////////////////
continueBreakStatement returns [ContinueBreakStmt continueBreakStmtRet] :
    (BREAK { $continueBreakStmtRet = new ContinueBreakStmt("BREAK"); }
    | CONTINUE { $continueBreakStmtRet = new ContinueBreakStmt("CONTINUE"); }) SEMICOLON
    { $continueBreakStmtRet.setLine($BREAK.line); };


returnStatement returns [ReturnStmt returnStmtRet] :
    RETURN expr=expression SEMICOLON { returnStmtRet.setLine($RETURN.line()); $returnStmtRet = new ReturnStmt($expr.expressionRet); $returnStmtRet.setLine($RETURN.line); };


tryCatchStatement returns [TryCatchStmt tryCatchStmtRet] :
    TRY  (LBRACE (s1=statement { tryCatchStmtRet.setLine(TRY.line()); $tryCatchStmtRet = new TryCatchStmt(null); $tryCatchStmtRet.addThenStatement($s1.statementRet); })* RBRACE | statement)
    (CATCH EXCEPTION ID (LBRACE (s2=statement { $tryCatchStmtRet.addElseStatement($s2.statementRet); })* RBRACE | statement))?;

//forStatement returns [ForStmt forStmtRet] : { $forStmtRet = new ForStmt(); }
//    FOR LPAREN statement expression SEMICOLON expression? RPAREN
//    (LBRACE (statement { $forStmtRet.addStatement($statement.statementRet); })* RBRACE
//    | statement { $forStmtRet.addStatement($statement.statementRet); });

forStatement returns [ForStmt forStmtRet] :
    { $forStmtRet = new ForStmt(); }
    FOR LPAREN s1=statement {$forStmtRet.setLine($FOR.line) ; $forStmtRet.addInit($s1.statementRet); }
    e1 = expression { $forStmtRet.setCondition($e1.expressionRet); } SEMICOLON ////////////////////Changed
    (e2 = expression { $forStmtRet.setUpdate($e2.expressionRet); } )? RPAREN ////////////////// like above!
    (
        LBRACE (s2=statement { $forStmtRet.addBody($s2.statementRet); })* RBRACE
        | s3=statement { $forStmtRet.addBody($s3.statementRet); }
    );


initDeclaration returns [OnInitDeclaration initDecRet] : { $initDecRet = new OnInitDeclaration(); }
    VOID ONINIT LPAREN TRADE ID  {Identifier id = new Identifier($ID.text);id.setLine($ID.line);}
    RPAREN (THROW EXCEPTION)? (LBRACE (s1=statement { $initDecRet.addStatement($s1.statementRet); })* RBRACE
    | s2=statement { $initDecRet.addStatement($s2.statementRet);$initDecRet.setTradeName(id); }); // ye identifier besaz


startDeclaration returns [OnStartDeclaration startDecRet] : { $startDecRet = new OnStartDeclaration(null); }
    VOID{startDecRet.setLine($VOID.line);} ONSTART LPAREN TRADE ID RPAREN (THROW EXCEPTION)? (LBRACE (statement { $startDecRet.addStatement($statement.statementRet); })* RBRACE
    | statement { $startDecRet.addStatement($statement.statementRet); });


//ifStatement returns [IfElseStmt ifStmtRet] : { $ifStmtRet = new IfElseStmt(); }
//    IF LPAREN expression RPAREN (LBRACE (statement { $ifStmtRet.addIfBody($statement.statementRet); })* RBRACE
//    | statement { $ifStmtRet.addIfBody($statement.statementRet); })
//    (ELSE (LBRACE (statement { $ifStmtRet.addElseBody($statement.statementRet); })* RBRACE
//    | statement { $ifStmtRet.addElseBody($statement.statementRet); }))?;



ifStatement returns [IfElseStmt ifStmtRet] :
     // nullllllllllllllllllllllllllllllllllllllllllllllllll
     { $ifStmtRet = new IfElseStmt(); }
    IF {ifStmtRet.setLine($IF.line);} LPAREN e1=expression RPAREN{$ifStmtRet.setCondition($e1.expressionRet);}
    (
        LBRACE (s1=statement { $ifStmtRet.addThenStatement($s1.statementRet); })* RBRACE
        | s2=statement { $ifStmtRet.addThenStatement($s2.statementRet); }
    )
    (ELSE
        (
            LBRACE (s3=statement { $ifStmtRet.addElseStatement($s3.statementRet); })* RBRACE
            | s4=statement { $ifStmtRet.addElseStatement($s4.statementRet); }
        )
    )?;


whileStatement returns [WhileStmt whileStmtRet] : { $whileStmtRet = new WhileStmt(null); }
    WHILE{whileStmtRet.setLine($WHILE.line);} LPAREN e1 = expression {setCondition($e1.expressionRet)} RPAREN (LBRACE (s1 =statement { $whileStmtRet.addBody($s1.statementRet); })* RBRACE
    |
    s2=statement {$whileStmtRet.addBody($s2.statementRet); });

throwStatement returns [ThrowStmt throwStmtRet] :
    THROW {throwStmtRet.setLine($THROW.line);} expression SEMICOLON { $throwStmtRet = new ThrowStmt($expression.expressionRet); $throwStmtRet.setLine($THROW.line); };


functionCall returns [FunctionCall functionCallRet] : { $functionCallRet = new FunctionCall(null); }
    (espetialFunction | complexType | ID) LPAREN{functionCallRet.setLine($LPAREN.line);} (expression (COMMA expression)*)? RPAREN;



//methodCall returns [MethodCall methodCallRet] : { $methodCallRet = new MethodCall(); }
//    ID (LBRACK expression RBRACK)? DOT espetialMethod LPAREN (expression (COMMA expression)*)? RPAREN;


methodCall returns [MethodCall methCallRet] locals [boolean temp, Identifier id]:
    ID {methCallRet.setLine($ID.line); $temp = false;}(LBRACK expression RBRACK {$temp = true;})? DOT
    espetialMethod LPAREN {
        if($temp){
            $id = new ArrayIdentifier($ID.text , $expression.expressionRet);
            $id.setLine($ID.line);
            $methCallRet = new MethodCall($id, $espetialMethod.espetialMethodRet);
        }
        else {
            $id = new Identifier($ID.text);
            $id.setLine($ID.line);
            $methCallRet = new MethodCall($id, $espetialMethod.espetialMethodRet);
        }
        $methCallRet.setLine($ID.line);
    }
    (expression { $methCallRet.addArg($expression.expressionRet); }
    (COMMA expression { $methCallRet.addArg($expression.expressionRet); })*)?
    RPAREN;



//initDeclaration : VOID ONINIT LPAREN TRADE ID RPAREN (THROW EXCEPTION)? (LBRACE statement* RBRACE | statement);

//startDeclaration : VOID ONSTART LPAREN TRADE ID RPAREN (THROW EXCEPTION)? (LBRACE statement* RBRACE | statement);

//assignStatement : ID (LBRACK expression RBRACK)? assign expression SEMICOLON;

//ifStatement : IF LPAREN expression RPAREN (LBRACE statement* RBRACE | statement) (ELSE (LBRACE statement* RBRACE | statement))?;

//whileStatement : WHILE LPAREN expression RPAREN (LBRACE statement* RBRACE | statement);

//forStatement: FOR LPAREN statement expression SEMICOLON expression? RPAREN (LBRACE statement* RBRACE | statement);

//tryCatchStatement : TRY (LBRACE statement* RBRACE | statement) (CATCH EXCEPTION ID (LBRACE statement* RBRACE | statement))?;

//continueBreakStatement : (BREAK | CONTINUE) SEMICOLON;

//returnStatement : RETURN expression SEMICOLON;

//throwStatement : THROW expression SEMICOLON;

//functionCall : (espetialFunction | complexType | ID) LPAREN (expression (COMMA expression)*)? RPAREN;

//methodCall : ID (LBRACK expression RBRACK)? DOT espetialMethod LPAREN (expression (COMMA expression)*)? RPAREN;

expression returns [Expression expressionRet] locals [UnaryOperator op1, BinaryOperator op2, int Line] :
             value { $expressionRet = $value.valueRet; expressionRet.setLine($value.valueRet.getLine());  }/////////////////////
           | lexpr=expression DOT espetialVariable { expressionRet.setLine($DOT.getLine()); $expressionRet = new MethodCall($lexpr.expressionRet, $espetialVariable.espetialVariableRet); }
           | lexpr=expression (INC{ expressionRet.setLine($INC.getLine()); $op1 = UnaryOperator.INC; $Line = $INC.line;} | DEC{$op1 = UnaryOperator.DEC; $Line = $DEC.line;}) { $expressionRet = new UnaryExpression($op1, $lexpr.expressionRet); $expressionRet.setLine($Line); }
           | (NOT { expressionRet.setLine($NOT.getLine()); $op1 = UnaryOperator.NOT; $Line = $NOT.line;} | MINUS {$op1 = UnaryOperator.MINUS; $Line = $MINUS.line;} | BIT_NOT {$op1 = UnaryOperator.BIT_NOT; $Line = $BIT_NOT.line;} | INC {$op1 = UnaryOperator.INC; $Line = $INC.line;} | DEC{$op1 = UnaryOperator.DEC; $Line = $DEC.line;}) lexpr=expression { $expressionRet = new UnaryExpression($op1, $lexpr.expressionRet); $expressionRet.setLine($Line); }
           | lexpr=expression (MULT { expressionRet.setLine($MULT.getLine()); $op2 = BinaryOperator.MULT; $Line = $MULT.line;} | DIV {$op2 = BinaryOperator.DIV; $Line = $DIV.line;} | MOD {$op2 = BinaryOperator.MOD; $Line = $MOD.line;}) rexpr=expression { $expressionRet = new BinaryExpression($lexpr.expressionRet, $rexpr.expressionRet, $op2); $expressionRet.setLine($Line); }
           | lexpr=expression (PLUS { expressionRet.setLine($PLUS.getLine()); $op2 = BinaryOperator.PLUS; $Line = $PLUS.line;} | MINUS {$op2 = BinaryOperator.MINUS; $Line = $MINUS.line;}) rexpr=expression { $expressionRet = new BinaryExpression($lexpr.expressionRet, $rexpr.expressionRet, $op2); $expressionRet.setLine($Line); }
           | lexpr=expression (L_SHIFT { expressionRet.setLine($L_SHIFT.getLine()); op2 = BinaryOperator.L_SHIFT; $Line = $L_SHIFT.line;} | R_SHIFT {$op2 = BinaryOperator.R_SHIFT; $Line = $R_SHIFT.line;}) rexpr=expression { $expressionRet = new BinaryExpression($lexpr.expressionRet, $rexpr.expressionRet, $op2); $expressionRet.setLine($Line); }
           | lexpr=expression (LT { expressionRet.setLine($LT.getLine()); $op2 = BinaryOperator.LT; $Line = $LT.line;} | GT {$op2 = BinaryOperator.GT; $Line = $GT.line;}) rexpr=expression { $expressionRet = new BinaryExpression($lexpr.expressionRet, $rexpr.expressionRet, $op2); $expressionRet.setLine($Line); }
           | lexpr=expression (EQ { expressionRet.setLine($EQ.getLine()); $op2 = BinaryOperator.EQ; $Line = $EQ.line;} | NEQ {$op2 = BinaryOperator.NEQ; $Line = $NEQ.line;}) rexpr=expression { $expressionRet = new BinaryExpression($lexpr.expressionRet, $rexpr.expressionRet, $op2); $expressionRet.setLine($Line); }
           | lexpr=expression (BIT_AND { expressionRet.setLine($BIT_AND.getLine()); $op2 = BinaryOperator.BIT_AND; $Line = $BIT_AND.line;} | BIT_OR {$op2 = BinaryOperator.BIT_OR; $Line = $BIT_OR.line;} | BIT_XOR {$op2 = BinaryOperator.BIT_XOR; $Line = $BIT_XOR.line;}) rexpr=expression { $expressionRet = new BinaryExpression($lexpr.expressionRet, $rexpr.expressionRet, $op2); $expressionRet.setLine($Line); }
           | lexpr=expression AND { expressionRet.setLine($AND.getLine()); $op2 = BinaryOperator.AND; $Line = $AND.line;} rexpr=expression { $expressionRet = new BinaryExpression($lexpr.expressionRet, $rexpr.expressionRet, $op2); $expressionRet.setLine($Line); }
           | lexpr=expression OR { expressionRet.setLine($OR.getLine()); $op2 = BinaryOperator.OR; $Line = $OR.line;} rexpr=expression { $expressionRet = new BinaryExpression($lexpr.expressionRet, $rexpr.expressionRet, $op2); $expressionRet.setLine($Line); }
           | ID { expressionRet.setLine($ID.getLine()); boolean temp = false;}(LBRACK lexpr=expression RBRACK {temp = true;})? { if(temp) $expressionRet = new ArrayIdentifier($ID.text, $lexpr.expressionRet); else $expressionRet = new Identifier($ID.text); $expressionRet.setLine($ID.line); }
           | LPAREN lexpr=expression RPAREN { expressionRet.setLine($LPAREN.getLine()); $expressionRet = $lexpr.expressionRet; }
           | functionCall { $expressionRet =  $functionCall.functionCallRet; expressionRet.setLine($functionCall.functionCallRet.getLine()); }
           | methodCall { $expressionRet = $methodCall.methCallRet; expressionRet.setLine($methodCall.methCallRet.getLine()); }; ///////////////////////////////

value returns [Value valueRet] :
    (
        v1 = INT_LITERAL {IntValue intval = new IntValue(0); intval.setConstant($INT_LITERAL.int);$valueRet = intval; }
        {valueRet.setLine($v1.line);}
        |
        v1= FLOAT_LITERAL {FloatValue floatval = new FloatValue(Float.parseFloat($FLOAT_LITERAL.text)); floatval.setConstant(Float.parseFloat($FLOAT_LITERAL.text));$valueRet = floatval; } // float or text
        {valueRet.setLine($v1.line);}
        |
        v1= STRING_LITERAL {StringValue stringval = new StringValue(null); stringval.setConstant($STRING_LITERAL.text); $valueRet = stringval;}
        {valueRet.setLine($v1.line);}
        |
        v1= SELL {TradeValue sellVal = new TradeValue(null); sellVal.setConstant($SELL.text);$valueRet = sellVal;}
        {valueRet.setLine($v1.line);}
        |
        v1 =BUY {TradeValue buyVal = new TradeValue(null); buyVal.setConstant($BUY.text);$valueRet = buyVal; }
        {valueRet.setLine($v1.line);}
    );


primitiveType returns [Type primitiveTypeRet] :
    (FLOAT { $primitiveTypeRet = new FloatType(); }
    {primitiveTypeRet.setLine(FLOAT.line();}
    |
     DOUBLE { $primitiveTypeRet = new DoubleType(); }
     {primitiveTypeRet.setLine(DOUBLE.line();}
    |
     INT { $primitiveTypeRet = new IntType(); }
     {primitiveTypeRet.setLine(INT.line();}
    |
     BOOL { $primitiveTypeRet = new BoolType(); }
     {primitiveTypeRet.setLine(BOOL.line();}
    |
    STRING { $primitiveTypeRet = new StringType(); }
    {primitiveTypeRet.setLine(STRING.line();}
    |
    VOID { $primitiveTypeRet = new VoidType(); }
    {primitiveTypeRet.setLine(VOID.line();}
    );


complexType returns [Type complexTypeRet] : /// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    (ORDER { $complexTypeRet = new OrderType(); }
    {complexTypeRet.setLine($ORDER.line);}
    |
    TRADE { $complexTypeRet = new TradeType(); }
    {complexTypeRet.setLine($TRADE.line);}
    |
    CANDLE { $complexTypeRet = new CandleType(); }
    {complexTypeRet.setLine($CANDLE.line);}
    |
    EXCEPTION { $complexTypeRet = new ExceptionType(); }
    {complexTypeRet.setLine($EXCEPTION.line);}
    );

allType returns [Type allTypeRet]:
    primitiveType { $allTypeRet = $primitiveType.primitiveTypeRet; }
    |
    complexType { $allTypeRet = $complexType.complexTypeRet; };
//////////////////////////////

espetialFunction returns [Identifier espetialFunctionRet] :
    (REFRESH_RATE {espetialFunctionRet.setLine($REFRESH_RATE.line); $espetialFunctionRet = new Identifier($REFRESH_RATE.text); $espetialFunctionRet.setLine($REFRESH_RATE.line);} | CONNECT {$espetialFunctionRet = new Identifier($CONNECT.text); $espetialFunctionRet.setLine($CONNECT.line);} | OBSERVE {$espetialFunctionRet = new Identifier($OBSERVE.text); $espetialFunctionRet.setLine($OBSERVE.line);}| GET_CANDLE {$espetialFunctionRet = new Identifier($GET_CANDLE.text); $espetialFunctionRet.setLine($GET_CANDLE.line);} | TERMINATE {$espetialFunctionRet = new Identifier($TERMINATE.text); $espetialFunctionRet.setLine($TERMINATE.line);} | PRINT {$espetialFunctionRet = new Identifier($PRINT.text); $espetialFunctionRet.setLine($PRINT.line);}) ;


espetialVariable returns [Identifier espetialVariableRet] :
    (ASK {espetialVariableRet.setLine($ASK.line); $espetialVariableRet = new Identifier($ASK.text); $espetialVariableRet.setLine($ASK.line);} | BID {$espetialVariableRet = new Identifier($BID.text); $espetialVariableRet.setLine($BID.line);}| TIME {$espetialVariableRet = new Identifier($TIME.text); $espetialVariableRet.setLine($TIME.line);} | HIGH {$espetialVariableRet = new Identifier($HIGH.text); $espetialVariableRet.setLine($HIGH.line);} | LOW {$espetialVariableRet = new Identifier($LOW.text); $espetialVariableRet.setLine($LOW.line);} | DIGITS {$espetialVariableRet = new Identifier($DIGITS.text); $espetialVariableRet.setLine($DIGITS.line);} | VOLUME {$espetialVariableRet = new Identifier($VOLUME.text); $espetialVariableRet.setLine($VOLUME.line);}| TYPE {$espetialVariableRet = new Identifier($TYPE.text); $espetialVariableRet.setLine($TYPE.line);}| TEXT {$espetialVariableRet = new Identifier($TEXT.text); $espetialVariableRet.setLine($TEXT.line);} | OPEN  {$espetialVariableRet = new Identifier($OPEN.text); $espetialVariableRet.setLine($OPEN.line);}| CLOSE {$espetialVariableRet = new Identifier($CLOSE.text); $espetialVariableRet.setLine($CLOSE.line);});

espetialMethod returns [Identifier espetialMethodRet] :
    (OPEN  {espetialMethodRet.setLine($OPEN.line); $espetialMethodRet = new Identifier($OPEN.text); $espetialMethodRet.setLine($OPEN.line);} | CLOSE {$espetialMethodRet = new Identifier($CLOSE.text); $espetialMethodRet.setLine($CLOSE.line);});

assign :
    (ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN);



//value : INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL | SELL | BUY;

//primitiveType : FLOAT | DOUBLE | INT | BOOL | STRING | VOID;

//complexType: ORDER | TRADE | CANDLE | EXCEPTION;

//allType: primitiveType | complexType;

//espetialFunction: REFRESH_RATE | CONNECT | OBSERVE | GET_CANDLE | TERMINATE | PRINT;

//espetialVariable: ASK | BID | TIME | HIGH | LOW | DIGITS | VOLUME | TYPE | TEXT | OPEN | CLOSE;
//
//espetialMethod: OPEN | CLOSE;
//
//assign: ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN;

// Lexer rules
SPACES : [ \t\r\n]+ -> skip;
SEMICOLON : ';';
COMMA : ',';
COLON : ':';
DOT: '.';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';

AND : '&&';
OR: '||';
NOT: '!';

BIT_AND : '&';
BIT_OR : '|';
BIT_XOR : '^';
L_SHIFT : '<<';
R_SHIFT : '>>';
BIT_NOT : '~';

LT : '<';
GT : '>';
EQ : '==';
NEQ : '!=';

INC : '++';
DEC : '--';

ASSIGN : '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';

TRY : 'try';
THROW : 'throw';
CATCH : 'catch';
IF : 'if';
ELSE : 'else';
FOR: 'for';
WHILE : 'while';
BREAK : 'break';
CONTINUE : 'continue';
RETURN : 'return';

MAIN : 'Main';
ONINIT : 'OnInit';
ONSTART : 'OnStart';

FLOAT : 'float';
DOUBLE : 'double';
STRING: 'string';
BOOL: 'bool';
VOID: 'void';
INT : 'int';

BUY : 'BUY';
SELL : 'SELL';

ASK : 'Ask';
BID : 'Bid';
TIME : 'Time';
HIGH : 'High';
LOW : 'Low';
DIGITS : 'Digits';
VOLUME : 'Volume';
TYPE: 'Type';
TEXT: 'Text';
OPEN : 'Open';
CLOSE : 'Close';

TRADE: 'Trade';
ORDER: 'Order';
CANDLE: 'Candle';
EXCEPTION: 'Exception';

REFRESH_RATE : 'RefreshRate';
GET_CANDLE : 'GetCandle';
TERMINATE : 'Terminate';
CONNECT : 'Connect';
OBSERVE : 'Observe';
PRINT : 'Print';

ID : [a-zA-Z_][a-zA-Z_0-9]*;

INT_LITERAL : [1-9][0-9]* | '0';
FLOAT_LITERAL : [0-9]* '.' [0-9]+;
STRING_LITERAL : '"' (~["])* '"';

COMMENT: (('//' ~('\r'|'\n')*) | ('/*' .*? '*/')) -> skip;
