package com.java.observerpattern;

public class Student extends Observer{

    
    public Student(MessageBoard msgbd){
        this.messageBoard = msgbd;
        this.messageBoard.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Student gets :"+this.messageBoard.getMessage());
        
    }

    
    
}
