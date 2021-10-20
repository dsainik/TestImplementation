package com.java;

public class Book {
    
    private Writer w;
    
    private String name;
    
    
    private String pub_dat;
    
    final String lib_nm = "Sri Ganesh";
    
    public Book(String name,String auth_name, String date){
        this.name = name;        
        this.pub_dat = date;
        this.w = new Writer(auth_name);
    }
    
    public String getBookDetails(){
        
        return "Book: " + name +" written by " + w.getDetails() + "pub on " + pub_dat + "found in library" + lib_nm;
    }

}
