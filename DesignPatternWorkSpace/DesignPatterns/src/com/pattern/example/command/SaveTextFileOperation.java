package com.pattern.example.command;

// implementation of the save command
public class SaveTextFileOperation implements TextFileOperation {
     
    // same field and constructor as above
         
    @Override
    public String execute() {
        return textFile.save();
    }
}
