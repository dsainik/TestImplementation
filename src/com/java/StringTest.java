package com.java;

public class StringTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String a = "abc";
        String b = "abc";
        
        String c = new String("abc");
        String d = new String("abc");
        
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println(c == d);
        System.out.println(c.equals(d));
        
    }

}
