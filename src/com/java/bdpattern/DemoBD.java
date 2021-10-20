package com.java.bdpattern;

public class DemoBD {
   
    public static void main(String[] str){
        
        Car c = new Car();
        c.setType("camry");
        c.setYear(1998);
        
        Car c1 = new Car();
        c1.setType("civic");
        c1.setYear(1998);
        CarService cs = new CarServiceImpl();
        ClassBD businessDelegate = new ClassBD(cs);
        
        businessDelegate.addCar(c);
        businessDelegate.addCar(c1);
        
        businessDelegate.update(new Car());
        
        
    }
} 
