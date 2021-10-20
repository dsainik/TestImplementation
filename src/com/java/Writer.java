package com.java;

public class Writer implements Author{

    String auth_name ;
    
    public Writer(String auth_name){
        this.auth_name = auth_name;
    }
    
    public String getDetails(){
        
        
        if(auth_name == null){
            auth_name = getDefault();
        }
        
        return auth_name;        
        
    }
    
    
    
    
}
