package com.java.bdpattern;

public class ClassBD {
   
    CarService service ;
    
    public ClassBD(CarService cs){
        service = cs;
    }
    
    public boolean addCar(Car c){
     
        return service.addCar(c);
        
    }
    
    public boolean update(Car c){
        
        service.updateCar(c);
        
        return true;
    }
    
    public void delete(int key){
        service.delCar(key);
    }
    
}
