package com.travelport.client;

import com.travelport.service.AtomicService;
import com.travelport.svcimpl.ResAtomicServiceImpl;

public class TestApp {

    public static void main(String[] args) {
        
        System.out.println("Test 1");
        ResAtomicServiceImpl service = new ResAtomicServiceImpl();
        service.reserve();
       

        System.out.println("Test 2");
        AtomicService ser1 = new ResAtomicServiceImpl();
        ser1.execute();
        
    }

}
