package com.java.testapps;

public class PalindromeEx {

    public static void main(String[] args) {
        
        String s = "nursesrun";
        
        String temp = new StringBuilder(s).reverse().toString();
        
        if(s.equals(temp)){
            System.out.println("is palindrome");
        }

    }

}
