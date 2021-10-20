package com.java.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class MessageBoard {
  
    List<Observer> listOfObservers = new ArrayList<>();
    
    //update
    String message;
    
    public void attach(Observer observer){        
        this.listOfObservers.add(observer);
        System.out.println("Added + "+ observer.getClass().getName());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObserver(message);
    }

    private void notifyAllObserver(String message) {
        for (Observer observer : listOfObservers) {
            observer.update();
        }
        
    }
    
    
    
}
