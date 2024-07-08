package main.compileError.name;

import  main.compileError.CompileError;

public class UnsupportedOperand extends CompileError {
    int line;
    String name;
    public UnsupportedOperand(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getMessage(){
        return "Line " + line + ": Unsupported operand type for operator " + name;
    }


}
