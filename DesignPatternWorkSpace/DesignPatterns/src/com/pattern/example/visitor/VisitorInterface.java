package com.pattern.example.visitor;

public interface VisitorInterface 
{
  public void visit(NonCaliforniaOrder nco);
  public void visit(CaliforniaOrder co);
  public void visit(OverseasOrder oo);
}
