package com.java.bdpattern;

import java.util.HashMap;
import java.util.UUID;

public class CarServiceImpl implements CarService{

    private HashMap<String, Car> localMap = new HashMap<>(); 
    
    @Override
    public boolean addCar(Car c) {
        localMap.put(UUID.randomUUID().toString(), c);
        return true;
    }

    @Override
    public void updateCar(Car c) {
        
        localMap.put(UUID.randomUUID().toString(), c);
    }

    @Override
    public void delCar(int c) {
        localMap.remove(c);
        System.out.println("car deleted");
    }

    
    
}
