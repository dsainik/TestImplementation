package com.java.factorypattern;

public class TestFactory {
 
   public static void main(String[] str){
       Service ser = ServiceFactory.getService("A");
       ser.doPrint();
       
       Service ser1 = ServiceFactory.getService("B");
       ser1.doPrint();
       
   } 
    
   public static class ServiceFactory{
       
       public static Service getService(String type){
           if(type.equals("A")){
               return new ServiceA(type);
           }else if("B".equals(type)){
               return new ServiceB(type);
           }else{
               return null;
           }
       }
       
   } 
    
}
