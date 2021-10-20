package com.java.visitorpattern;

public interface ComputerPart {
    
    public void accept(ComputerPartVisitor computerPartVisitor);

}
