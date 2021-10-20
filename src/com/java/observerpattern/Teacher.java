package com.java.observerpattern;

public class Teacher extends Observer{

    
    public Teacher(MessageBoard msgbd){
        this.messageBoard = msgbd;
        this.messageBoard.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Teacher gets:"+this.messageBoard.getMessage());
        
    }

    
    
}
