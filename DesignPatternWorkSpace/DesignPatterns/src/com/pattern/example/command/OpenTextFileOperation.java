package com.pattern.example.command

public class OpenTextFileOperation implements TextFileOperation {
 
    private TextFile textFile;
     
    // constructors
     
    @Override
    public String execute() {
        return textFile.open();
    }
}
