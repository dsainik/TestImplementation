package com.java.factorypattern;

public class ServiceB implements Service{
 
    String type;
    
    ServiceB(String type){
        this.type = type;
    }
    
    public void doPrint(){
        System.out.println("Service B implementation");
    }
}
