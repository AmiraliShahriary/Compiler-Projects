package visitor.codeGenerator;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.expression.*;
import main.ast.node.statement.*;
import main.ast.type.Type;
import main.ast.node.expression.UnaryExpression;
import main.ast.node.expression.Expression;
import main.ast.type.complexType.TradeType;
import main.ast.type.primitiveType.BoolType;
import main.compileError.CompileError;
import main.compileError.type.ConditionTypeNotBool;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemNotFoundException;
import main.symbolTable.symbolTableItems.*;
import main.visitor.Visitor;
import main.ast.node.expression.BinaryExpression;
import main.ast.node.expression.FunctionCall;
import main.ast.node.expression.Identifier;
import main.ast.node.expression.operators.BinaryOperator;
import main.ast.node.expression.values.BoolValue;
import main.ast.node.expression.values.FloatValue;
import main.ast.node.expression.values.IntValue;
import main.ast.node.expression.values.StringValue;
import main.ast.type.*;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.FloatType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.compileError.*;
import main.compileError.type.UnsupportedOperandType;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemNotFoundException;
import main.symbolTable.symbolTableItems.FunctionItem;
import main.symbolTable.symbolTableItems.SymbolTableItem;
import main.symbolTable.symbolTableItems.VariableItem;
import main.visitor.*;
import main.ast.node.declaration.*;
import main.ast.node.statement.ForStmt;
import main.ast.node.statement.Statement;
import main.ast.type.complexType.TradeType;
import main.compileError.CompileError;
import main.compileError.name.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemAlreadyExistsException;
import main.symbolTable.itemException.ItemNotFoundException;
import main.symbolTable.symbolTableItems.*;
import main.visitor.Visitor;
import main.visitor.typeAnalyzer.*;
import main.ast.node.declaration.FunctionDeclaration;

//*****************
import main.ast.node.Program;
import java.util.HashMap;
import main.ast.node.declaration.*;
import main.ast.node.expression.*;
import main.ast.node.expression.values.NullValue;
import main.ast.node.statement.*;
import main.ast.type.Type;
import main.ast.node.expression.Expression;
import main.ast.type.primitiveType.VoidType;
import main.ast.node.statement.AssignStmt;
import main.symbolTable.symbolTableItems.OnInitItem;
import main.ast.node.declaration.OnStartDeclaration;
import main.ast.node.declaration.OnInitDeclaration;
import main.ast.node.declaration.VarDeclaration;
import main.ast.type.complexType.TradeType;
import main.ast.node.expression.operators.UnaryOperator;
import main.ast.type.primitiveType.BoolType;
import main.compileError.CompileError;
import main.compileError.type.ConditionTypeNotBool;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemNotFoundException;
import main.symbolTable.symbolTableItems.OnStartItem;
import main.symbolTable.symbolTableItems.*;
import main.visitor.Visitor;
import main.ast.node.expression.BinaryExpression;
import main.ast.node.expression.FunctionCall;
import main.ast.node.expression.Identifier;
import main.ast.node.expression.operators.BinaryOperator;
import main.ast.node.expression.values.BoolValue;
import main.ast.node.expression.values.FloatValue;
import main.ast.node.expression.values.IntValue;
import main.ast.node.declaration.*;
import main.ast.node.expression.values.StringValue;
import main.ast.type.*;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.FloatType;
import main.ast.type.primitiveType.IntType;
import main.visitor.typeAnalyzer.TypeChecker;
import main.ast.type.primitiveType.StringType;
import main.compileError.*;
import main.compileError.type.UnsupportedOperandType;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemNotFoundException;
import main.symbolTable.symbolTableItems.FunctionItem;
import main.symbolTable.symbolTableItems.SymbolTableItem;
import main.symbolTable.symbolTableItems.VariableItem;
import main.ast.type.primitiveType.NullType;
import main.visitor.*;
import main.ast.node.declaration.*;
import main.ast.node.statement.ForStmt;
import main.ast.node.statement.Statement;
import main.ast.type.complexType.TradeType;
import main.compileError.CompileError;
import main.compileError.name.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemAlreadyExistsException;
import main.symbolTable.itemException.ItemNotFoundException;
import main.symbolTable.symbolTableItems.*;
import main.visitor.Visitor;
import main.visitor.typeAnalyzer.*;

//import org.antlr.v4.misc.Graph;


import java.util.ArrayList;


import java.io.*;
import java.util.Objects;

public class CodeGenerator extends Visitor<String> { // need action
    //    You may use following items or add your own for handling typechecker
    TypeChecker expressionTypeChecker;
    //Graph<String> classHierarchy;
    private String outputPath;
    private FileWriter currentFile;
    //private MethodDeclaration currentMethod; //dont have class
    private int lastSlot;
    private int lastLabel;
    private int numberOfLabels;

    private HashMap<String, Integer> slots;
    private Integer s_num;
    private OnStartDeclaration currentOnStart;

    private OnInitDeclaration currentOnInit;

    private FunctionDeclaration currentMethod;
    private boolean global_flag;
    private int numberOfTemps;

    private ArrayList<VarDeclaration> globalVariables;
    FunctionDeclaration currentMethodCallDeclaration;


    //Graph<String> classHierarchy
    public CodeGenerator() {
        this.globalVariables = new ArrayList<>();
        //     this.classHierarchy = classHierarchy;
//        Uncomment below line to initialize your typechecker
        this.expressionTypeChecker = new TypeChecker(new ArrayList());
        this.slots = new HashMap<String,Integer>();
        this.s_num = 1;
//        Call your type checker here!
//        ----------------------------
        this.prepareOutputFolder();

    }
    private Integer AddToHash(String varName){
        if (slots.containsKey(varName)){
            return slots.get(varName);
        }
        else{

            slots.put(varName,s_num);
            Integer temp = s_num;
            s_num += 1;
            return temp;
        }
    }

    private void prepareOutputFolder() { // bood
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) { }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void copyFile(String toBeCopied, String toBePasted) { //bood
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) { }
    }

    private void createFile(String name) { //bood
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            this.currentFile = fileWriter;
        } catch (IOException e) {}
    }

    private void addCommand(String command) { //bood
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {}
    }
    //**********************************************************************************************************************
    @Override
    public String visit(OnStartDeclaration onStartDeclaration){
        try{
            String onStartKey = OnStartItem.START_KEY + onStartDeclaration.getTradeName().getName();
            OnStartItem onStartSymbolTableItem = (OnStartItem) SymbolTable.root.get(onStartKey);
            SymbolTable.push(onStartSymbolTableItem.getOnStartSymbolTable());
        }
        catch (ItemNotFoundException e){
        }
        lastSlot = 0;
        lastLabel = 0;
        currentOnStart = onStartDeclaration;
        String commands = ".method public ";
        commands += OnStartItem.START_KEY + onStartDeclaration.getTradeName().getName() + "(";
        commands += "Ljava/lang/Object;";
        commands += ")V";
        addCommand(commands);
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        for (Statement stmt : onStartDeclaration.getBody()){
            stmt.accept(this);
        }
        addCommand(".end method");
        return null;
    }
//*+******************************************************************************************************
@Override
public String visit(OnInitDeclaration  onInitDeclaration){
    try{
        String onInitKey = OnInitItem.START_KEY + onInitDeclaration.getTradeName().getName();
        OnInitItem onInitSymbolTableItem = (OnInitItem) SymbolTable.root.get(onInitKey);
        SymbolTable.push(onInitSymbolTableItem.getOnInitSymbolTable());
    }
    catch (ItemNotFoundException e){
    }
    lastSlot = 0;
    lastLabel = 0;
    currentOnInit = onInitDeclaration;
    String commands = ".method public ";
    commands += OnStartItem.START_KEY + onInitDeclaration.getTradeName().getName() + "(";
    commands += "Ljava/lang/Object;";
    commands += ")V";
    addCommand(commands);
    addCommand(".limit stack 128");
    addCommand(".limit locals 128");
    for (Statement stmt : onInitDeclaration.getBody()){
        stmt.accept(this);
    }
    addCommand(".end method");
    return null;
}
//************************************************************************************************
    private String makeTypeSignature(Type t) { //ok
        if (t instanceof IntType)
            return  "Ljava/lang/Integer;";
        else if (t instanceof BoolType)
            return "Ljava/lang/Boolean;";
        else if (t instanceof VoidType)
            return "V";
        else if (t instanceof TradeType)
            return "LTrade;";
        return null;
    }

    @Override
    public String visit(Program program) {
        createFile("out.txt");
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);
        addCommand(".class public UTL \n");
        addCommand(".super java/lang/Object\n");
        global_flag=true;
        for (var dec : program.getVars()){
            dec.accept(this);
        }
        global_flag=false;
        addCommand(".method public <init>()V\n");
        addCommand("aload_0\n");
        addCommand("invokespecial java/lang/Object/<init>()V\n");
        addCommand(".end method\n");
        for (var dec : program.getFunctions()){
            dec.accept(this);
        }
        for (var dec : program.getInits()){
            dec.accept(this);
        }
        for (var dec : program.getStarts()){
            dec.accept(this);
        }
        program.getMain().accept(this);
        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        String signatures = "";
        addCommand(".method public " +"main" + "(" + signatures + ")" + "V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        for(Statement statement : mainDeclaration.getBody())
            statement.accept(this);
        addCommand(".end method\n ");
        this.numberOfTemps = 0;
        return null;
    }

    @Override
    public String visit(FunctionDeclaration methodDeclaration) {
        s_num = 1;
        this.currentMethod = methodDeclaration; // Set currentMethod
        String signatures = "";
        for(VarDeclaration argPair : methodDeclaration.getArgs()) {
            signatures = signatures.concat(makeTypeSignature(argPair.getType()));
            Integer slot = AddToHash(argPair.getIdentifier().getName());

        }
//        if(methodDeclaration instanceof FunctionDeclaration)
//            addCommand(".method public <init>(" + signatures + ")V");
//        else {
        addCommand(".method public " + methodDeclaration.getName().getName() + "(" + signatures + ")" + makeTypeSignature(methodDeclaration.getReturnType()));
//        }
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");

        for(VarDeclaration localVar : methodDeclaration.getArgs())
            localVar.accept(this);
        for(Statement statement : methodDeclaration.getBody())
            statement.accept(this);
        addCommand(".end method\n ");
        this.numberOfTemps = 0;
        return null;
    }

    private void initializeField(VarDeclaration varDeclaration, boolean isField, Expression defaultValue){
        Type fieldType = varDeclaration.getType();
        String commands = "";
        String fieldName = varDeclaration.getIdentifier().getName();
        if (global_flag) {
            commands += ".field public " + varDeclaration.getIdentifier().getName() + " " + makeTypeSignature(varDeclaration.getType()) + "\n";
        }
        else
        if(isField)
            addCommand("aload 0");
        if(fieldType instanceof IntType){
            if(defaultValue == null)
                addCommand(this.visit(new IntValue(0)));
            else
                addCommand(this.visit((IntValue) defaultValue));
            addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
        }
        else if(fieldType instanceof BoolType) {
            if(defaultValue == null)
                addCommand(this.visit(new BoolValue(false)));
            else
                addCommand(this.visit((BoolValue) defaultValue));
            addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        }

        else if(fieldType instanceof NullType)
            addCommand(this.visit(new NullValue()));
  }
    private int slotOf(String identifier){
        int count = 1;


        if (currentMethod != null && currentMethod.getArgs() != null) {
            for(VarDeclaration argPair : currentMethod.getArgs()){
                if(argPair != null && argPair.getIdentifier() != null && argPair.getIdentifier().getName() != null && argPair.getIdentifier().getName().equals(identifier))
                    return count;
                count++;
            }
        }
//        for(VarDeclaration variableDeclaration : currentMethod.getLocalVars ()) { ??
//            if(variableDeclaration.getVarName().getName().equals(identifier))
//                return count;
//            count++;
//        }
        if (identifier.equals("")){
            return count + numberOfTemps++;
        }
        return 0;
    }
    @Override
    public String visit(VarDeclaration varDeclaration) {
        // **=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=*=*=*
        //todo
        Integer slot = AddToHash(varDeclaration.getIdentifier().getName());
        if (varDeclaration.getRValue()!=null)
            varDeclaration.getRValue().accept(this);
//        VarDeclaration globalVar = getGlobalVariable(varDeclaration.getIdentifier().getName()); ??
       if(global_flag == true) {
            addCommand(".field");
        }
        else {
            addCommand("astore " + slot.toString());
        }
        return null;

    }

    @Override
    public String visit(AssignStmt assignmentStmt) {
        Identifier lval = (Identifier) assignmentStmt.getLValue();
        Integer slot = AddToHash(lval.getName());

        addCommand(assignmentStmt.getRValue().accept(this));
//        VarDeclaration globalVar = getGlobalVariable(varDeclaration.getIdentifier().getName()); ??
        addCommand("astore " + slot.toString());

        return null;
    }

    @Override
    public String visit(main.ast.node.statement.IfElseStmt ifElseStmt) {
        ArrayList<String> elsifLabels = new ArrayList<>();

        String elseLabel = getFreshLabel();
        String exitLabel = getFreshLabel();
        addCommand(ifElseStmt.getCondition().accept(this));
        addCommand("ifeq " + elseLabel);
        for (var stmt : ifElseStmt.getThenBody()) {
            stmt.accept(this);
        }
        addCommand("goto " + exitLabel);
        if (! ifElseStmt.getElseBody().isEmpty()){
            addCommand(elseLabel + ":");
            for (var stmt : ifElseStmt.getElseBody()) {
                stmt.accept(this);
            }
        }
        addCommand(exitLabel + ":");
        return null;
    }


    @Override
    public String visit(main.ast.node.statement.WhileStmt whileStmt) {
        String startLabel = getFreshLabel();
        String endLabel = getFreshLabel();


        addCommand("goto " + startLabel);


        addCommand(startLabel + ":");
        addCommand(whileStmt.getCondition().accept(this));
        addCommand("ifeq " + endLabel);
        for (Statement stmt : whileStmt.getBody()) {
            stmt.accept(this);
        }


        addCommand("goto " + startLabel);

        // Generate bytecode for the end label
        addCommand(endLabel + ":");

        return null;
    }

//    @Override
////    public String visit(FunctionCall methodCallStmt) {
////
////        addCommand("pop");
////        return null;
////    }

    @Override
    public String visit(FunctionCall methodCallStmt) {
        // Generate bytecode to push arguments onto the stack
        for (Expression arg : methodCallStmt.getArgs()) {
            arg.accept(this);
        }

        addCommand("invokestatic " + methodCallStmt.getFunctionName().getName() +
                makeArgumentTypes(methodCallStmt.getArgs()) +
                makeReturnType(methodCallStmt));

        return null;
    }

    private String makeArgumentTypes(ArrayList<Expression> args) {
        StringBuilder argumentTypes = new StringBuilder("(");
        for (Expression arg : args) {

            argumentTypes.append(makeTypeSignature(arg.getType()));
        }
        argumentTypes.append(")");
        return argumentTypes.toString();
    }

    private String makeReturnType(FunctionCall methodCallStmt) {

        return "V";
    }



    @Override
    public String visit(ReturnStmt returnStmt) {
        Type type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if(type instanceof NullType || type instanceof VoidType) {
            addCommand("return");
        }
        else {
            addCommand( returnStmt.getReturnedExpr().accept(this) );
            if(type instanceof IntType)
                addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            if(type instanceof BoolType)
                addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            addCommand("areturn");
        }
        return null;
    }
    private String getFreshLabel() {
        return "Label_" + this.numberOfLabels++;
    }
    //*******************************************************************************************************************
    @Override
    public String visit(BinaryExpression binaryExpression) {
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        String commands = "";
        if(!((operator == BinaryOperator.ASSIGN) || (operator == BinaryOperator.AND) || (operator == BinaryOperator.OR))) {
            commands += binaryExpression.getLeft().accept(this) + "\n";
            commands += binaryExpression.getRight().accept(this) + "\n";
        }
        if (operator == BinaryOperator.PLUS)
            commands += "iadd\n";
        else if (operator == BinaryOperator.MINUS)
            commands += "isub\n";
        else if (operator == BinaryOperator.MULT)
            commands += "imul\n";
        else if (operator == BinaryOperator.DIV)
            commands += "idiv\n";
        else if((operator == BinaryOperator.GT) || (operator == BinaryOperator.LT)) {
            String nTrue = getFreshLabel();
            String nAfter = getFreshLabel();
            String command = (operator == BinaryOperator.LT) ? "if_icmplt " : "if_icmpgt ";
            commands += command + nTrue + "\n";
            commands += "ldc 0" + "\n";
            commands += "goto " + nAfter + "\n";
            commands += nTrue + ":\n";
            commands += "ldc 1\n";
            commands += nAfter + ":";
        }
        else if((operator == BinaryOperator.EQ)) {
            Type type = binaryExpression.getLeft().accept(expressionTypeChecker);
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
            String compareCommand = "";
            if((type instanceof IntType) || (type instanceof BoolType))
                compareCommand += "if_icmpne ";
            else
                compareCommand +="if_acmpne ";
            commands += compareCommand + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";
        }
        else if(operator == BinaryOperator.OR) {
            String trueLabel = getFreshLabel();
            String endLabel = getFreshLabel();
            commands += binaryExpression.getLeft().accept(this) + "\n";
            commands += "ifne " + trueLabel + "\n";
            commands += binaryExpression.getRight().accept(this) + "\n";
            commands += "ifne " + trueLabel + "\n";
            commands += "ldc 0\n";
            commands += "goto " + endLabel + "\n";
            commands += trueLabel + ":\n";
            commands += "ldc 1\n";
            commands += endLabel + ":";
        }
        else if(operator == BinaryOperator.AND) {
            String nElseLabel = getFreshLabel();
            String nAfterLabel = getFreshLabel();
            commands += binaryExpression.getLeft().accept(this) + "\n";
            commands += "ifeq " + nElseLabel + "\n";
            commands += binaryExpression.getRight().accept(this) + "\n";
            commands += "ifeq " + nElseLabel + "\n";
            commands += "ldc 1\n";
            commands += "goto " + nAfterLabel + "\n";
            commands += nElseLabel + ":\n";
            commands += "ldc 0\n";
            commands += nAfterLabel + ":";
        }
        else if(operator == BinaryOperator.ASSIGN) {
            Type firstType = binaryExpression.getLeft().accept(expressionTypeChecker);
            String secondCommands = binaryExpression.getRight().accept(this);
            if(binaryExpression.getLeft() instanceof Identifier) {
                commands += secondCommands + "\n";
                commands += "dup\n";
                if(firstType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if(firstType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                int varSlot = slotOf(((Identifier) binaryExpression.getLeft()).getName());
            }

        }
        return commands;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        UnaryOperator operator = unaryExpression.getUnaryOperator();
        String commands = "";
        if(operator == UnaryOperator.MINUS) {
            commands += unaryExpression.getOperand().accept(this) + "\n";
            commands += "ineg";
        }
        else if(operator == UnaryOperator.NOT) {
            String falseLabel = getFreshLabel();
            String afterLabel = getFreshLabel();
            commands += unaryExpression.getOperand().accept(this) + "\n";
            commands += "ifne " + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + afterLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += afterLabel + ":";
        }
        else if((operator == UnaryOperator.INC) || (operator == UnaryOperator.DEC)) {
            try {
                Identifier identifier = (Identifier) unaryExpression.getOperand();
//                varDeclaration globalVar = getGlobalVariable(identifier);
                int slot = slotOf(identifier.getName());

                 commands += "invokevirtual java/lang/Integer/intValue()I\n";
                commands += "dup\n";
                commands += "ldc 1\n";
                if (operator == UnaryOperator.INC)
                    commands += "iadd\n";
                else
                    commands += "isub\n";
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";

//                if(globalVar == null) {
////                    System.out.println("ASTORE");
//                    commands += "astore " + slot + "\n";
//                }
//                else {
//                    commands += "putstatic Global/" + globalVar.getVarName().getName() + " " + makeTypeSignature(globalVar.getType()) + "\n";
////                    System.out.println("PUTSTATIC");
//                }
//                commands += "astore " + slot + "\n";
            }
            catch (Exception e){
//            try{
//                Expression instance = ((ObjectMemberAccess) unaryExpression.getOperand()).getInstance();
//                Type memberType = unaryExpression.getOperand().accept(expressionTypeChecker);
//                String memberName = ((ObjectMemberAccess) unaryExpression.getOperand()).getMemberName().getName();
//                Type instanceType = instance.accept(expressionTypeChecker);
//            }
//            catch (Exception except){ try{
//                commands += ((ArrayAccessByIndex) unaryExpression.getOperand()).getInstance().accept(this) + "\n";
//                commands +=  ((ArrayAccessByIndex) unaryExpression.getOperand()).getIndex().accept(this) + "\n";
//                commands += "dup2\n";
//                commands += "invokevirtual Array/getElement(I)Ljava/lang/Object;\n";
//                commands += "checkcast java/lang/Integer\n";
//                commands += "invokevirtual java/lang/Integer/intValue()I\n";
//                commands += "dup_x2\n";
//                commands += "ldc 1\n";
//                if(operator == UnaryOperator.DEC)
//                    commands += "isub\n";
//                else
//                    commands += "iadd\n";
//                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
//                commands += "invokevirtual Array/setElement(ILjava/lang/Object;)V\n";
//            }
//            catch (Exception except2) {}
//            }
        }}
        return commands;
    }
    //*********************************************************************************************************************

    @Override
    public String visit(NullValue nullValue) {
        String commands = "";
        addCommand("aconst_null");
        //todo
        return commands;
    }

    @Override
    public String visit(IntValue intValue) {
        String commands = "";
        addCommand("ldc " + intValue.getConstant()+"\n");
        //todo
        return commands;
    }
    @Override
    public String visit(main.ast.node.expression.values.TradeValue tradeValue){
        if(tradeValue.getConstant().equals("SELL")){
            addCommand("ldc \"SELL\"");
        }
        else{
            addCommand("ldc \"BUY\"");
        }
        return  null;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String commands = "";
        if(boolValue.getConstant())
            commands += "ldc 1\n";
        else
            commands += "ldc 0\n";
        return commands;
    }

    @Override
    public String visit(StringValue stringValue) {
        String commands = "";
        addCommand("ldc " + stringValue.getConstant());
        //todo
        return commands;
    }

}