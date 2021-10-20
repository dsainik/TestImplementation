package com.java.facadepattern;

import java.util.Date;

public class Client{  
    public static void main(String[] args)   { 
        TravelFacade facade = new TravelFacade();  
        Date from = null;
        Date to = null;
        facade.getFlightsAndHotels(from, to);
        }
    }
