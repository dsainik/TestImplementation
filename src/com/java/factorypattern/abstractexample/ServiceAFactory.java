package com.java.factorypattern.abstractexample;

public class ServiceAFactory implements ServiceAbstractFactory{

    @Override
    public Service getInstance() {
        // TODO Auto-generated method stub
        return new ServiceA();
    }
      
    
    
}
