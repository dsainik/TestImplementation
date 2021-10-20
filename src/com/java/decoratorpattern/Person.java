package com.java.decoratorpattern;

public class Person implements Human {
  
    String name;
    
    public Person(String nm){
        this.name = nm;
    }
    
    public void doPrint(){
        System.out.println("Name = "+ name);
    }
    
    public String toString(){
        return this.name;
    }
}
