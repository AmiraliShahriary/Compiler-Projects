package main.compileError.name;

import  main.compileError.CompileError;

public class NotBool extends CompileError {
    int line;
    public NotBool(int line){
        this.line = line;
    }
    public String getMessage(){
        return "Line " + line + ": condition type must be Boolean";
    }

}
