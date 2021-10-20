package com.java.singleton;

public enum SingletonHelper implements Service{
  
    INSTANCE;
    
    public void print(){
        System.out.println("i am public method of singleton");
    }
    
}
