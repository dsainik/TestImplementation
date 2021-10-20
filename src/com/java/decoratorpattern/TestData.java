package com.java.decoratorpattern;

public class TestData {
  
     public static void main(String[] str){
         
         Person p = new Person("John");
         p.doPrint();
         
         //need to add new func get Location
         
         Human p1 = new PersonNew(new Person("Casey"),"Denver");
         p1.doPrint();
     }
}
