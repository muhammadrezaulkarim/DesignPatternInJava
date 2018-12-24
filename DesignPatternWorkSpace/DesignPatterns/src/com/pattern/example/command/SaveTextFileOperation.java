package com.pattern.example.command;

// implementation of the save command
public class SaveTextFileOperation implements TextFileOperation {
    
    private TextFile textFile;
    
    // constructors
    public SaveTextFileOperation(TextFile textFile)
    {
      this.textFile =  textFile;
    }
         
    @Override
    public String execute() {
        return textFile.save();
    }
}
