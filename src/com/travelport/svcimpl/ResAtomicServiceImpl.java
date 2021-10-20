package com.travelport.svcimpl;

import com.travelport.service.AtomicService;

public class ResAtomicServiceImpl extends AtomicService {

    public void reserve(){        
        System.out.println("reserved");
    }
    
    public void execute(){
        System.out.println("Reservation executed");
        
    }
}
