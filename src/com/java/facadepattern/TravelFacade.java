package com.java.facadepattern;

import java.util.ArrayList;
import java.util.Date;

public class TravelFacade {

    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    public void getFlightsAndHotels(Date from, Date to) {
        ArrayList<Flight> flights = flightBooker.getFlightsFor(from, to);
        ArrayList<Hotel> hotels = hotelBooker.getHotelNamesFor(from, to);
        // process and return
    }
}
