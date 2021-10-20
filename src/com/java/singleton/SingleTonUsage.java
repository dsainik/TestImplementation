package com.java.singleton;

public class SingleTonUsage {
 
    public static void main(String[] str){
        
        SingletonHelper.INSTANCE.print();
        
        Service _sService = SingletonTraditional.getInstance();
        _sService.print();
        
    }
    
    
}
