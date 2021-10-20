package com.java.observerpattern;

public abstract class Observer {
   
    //things to observe
    public MessageBoard messageBoard;
    
    public abstract void  update();
    
}
