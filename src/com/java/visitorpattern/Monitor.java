package com.java.visitorpattern;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
    }
   }

