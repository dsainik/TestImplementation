package com.java.decoratorpattern;

public class PersonNew extends HumanDecorator{
   
   Person person;
    
   private String location;
   
   public PersonNew(Person p,String loc) {
     this.person = p;  
     this.location = loc; 
   }
   
   public String getLocation(){       
       return location;
   }
   
   public void doPrint(){
       
       System.out.println(person+"from"+this.location);
   }
    
}
