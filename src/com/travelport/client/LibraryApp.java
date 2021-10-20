package com.travelport.client;

import com.java.Book;

public class LibraryApp {

    public static void main(String[] args) {
        
        Book b1 = new Book("Jungle Book","Rudyard Kip", "1958-09-02");
        Book b2 = new Book("Treasure Island",null, "1976-09-03");
        
        System.out.println(b1.getBookDetails());
        System.out.println(b2.getBookDetails());
        
    }

}
