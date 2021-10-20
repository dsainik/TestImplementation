package com.java.decoratorpattern;

public class HumanDecorator implements Human {

    Human human;
    
    @Override
    public void doPrint() {
        // TODO Auto-generated method stub
        human.doPrint();
    } 
     
}

