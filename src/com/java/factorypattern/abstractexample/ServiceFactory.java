package com.java.factorypattern.abstractexample;

public class ServiceFactory {

    public  static Service getInstance(ServiceAbstractFactory factory){
        return factory.getInstance();
    }
    
}
