package com.pattern.example.command

public class SaveTextFileOperation implements TextFileOperation {
     
    // same field and constructor as above
         
    @Override
    public String execute() {
        return textFile.save();
    }
}
