package com.java.interfaces;

public interface Engine {

    
    
    default boolean hasWheels(int x){
        return true;
    }
    
    public int valveCount();
    
}
