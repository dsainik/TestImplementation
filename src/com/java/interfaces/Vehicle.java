package com.java.interfaces;

public interface Vehicle {

    
    
    default boolean hasWheels(){
        return true;
    }
    
    public int wheelCount();
    
}
