package com.java.factorypattern.abstractexample;

public class ServiceBFactory implements ServiceAbstractFactory{
      
    

    @Override
    public Service getInstance() {
        // TODO Auto-generated method stub
        return new ServiceB();
    }
    
}
