package com.java.factorypattern;

public class ServiceA implements Service{
 
    String type;
    
    ServiceA(String type){
        this.type = type;
    }
    
    public void doPrint(){
        System.out.println("Service A implementation");
    }
}
