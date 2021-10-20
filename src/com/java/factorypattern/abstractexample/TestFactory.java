package com.java.factorypattern.abstractexample;

public class TestFactory {
 
    public static void main(String[] arg){
        
       Service a =  ServiceFactory.getInstance(new ServiceAFactory());
       a.doPrint();
       
       Service b = ServiceFactory.getInstance(new ServiceBFactory());
       b.doPrint();
       
       System.out.println("factory of factories");
       
    }
    
}
