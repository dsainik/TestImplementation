package com.java.visitorpattern;

public class VisitorPatternDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ComputerPart computer = new Monitor();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
