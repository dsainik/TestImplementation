package com.java.mvcpattern;

public class Demo {
   
     public static void main(String[] str){
         
         Person p = new Person();
         p.setName("John");
         
         Controller config = new Controller(p, new PersonView());
         config.updateView();
         System.out.println("******************updating.......");
         p.setName("Val");
         config.updateView();
     }
}
