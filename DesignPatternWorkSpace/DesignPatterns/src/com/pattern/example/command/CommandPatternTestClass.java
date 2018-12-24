package com.pattern.example.command;

public class CommandPatternTestClass
{
    public static void main(String[] args) 
    {
        // invoker object
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        // execute open command (i.e OpenTextFileOperation) on the receiver object (i.e. Text File) using the invoker 
        // (i.e. TextFileOperationExecutor class)
        textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt"))));
        
        // execute save command on the receiver object (e.g. Text File) using the invoker (i.e. TextFileOperationExecutor class)
        textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt"))));
    }
}
