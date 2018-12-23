package com.pattern.example.bridge;


public class BridgePatternTestClass
{
  public static void main(String[] args) 
  {
    //Create an appropriate implementer object based on the need
    MessageLogger logger = new FileLogger();
    
    //Choose required interface object and configure it with the above implementer object
    Message msg = new EncryptedMessage(logger);
    
    msg.log("Test Message");
  }
}
