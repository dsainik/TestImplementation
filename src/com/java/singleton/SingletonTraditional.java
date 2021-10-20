 package com.java.singleton;

public class SingletonTraditional implements Service{
   
     private static SingletonTraditional _instance;
     
     private SingletonTraditional(){
         
     }
     
     public static SingletonTraditional getInstance(){
         
         synchronized (SingletonTraditional.class) {     
        
         if(_instance == null){
             _instance = new SingletonTraditional();             
         }
         }  
         return _instance;
     }

    @Override
    public void print() {
        System.out.println("task1 done");
        
    }
     
     
}
