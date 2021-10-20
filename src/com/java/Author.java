package com.java;

public interface Author {

    public static String DEF_NAME = "Mr. John Doe";
    
    public String getDetails();
    
    public default String getDefault(){
        return DEF_NAME;
    }
    
}
