package com.pattern.example.command;

// invoker class
public class TextFileOperationExecutor {
     
    private final List<TextFileOperation> textFileOperations
     = new ArrayList<>();
     
    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}
