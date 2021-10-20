package com.java.interfaces;

public class Camry implements Vehicle, Engine{

    @Override
    public int valveCount() {
        // TODO Auto-generated method stub
        return 6;
    }

    @Override
    public int wheelCount() {
        // TODO Auto-generated method stub
        return 4;
    }
    
    public static void main(String[] str){
        
        Camry c = new Camry();
        
        System.out.println("Wheel count = " + c.wheelCount());
        
    }
    
}
