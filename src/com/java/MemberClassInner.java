package com.java;

public class MemberClassInner {

    private String s;
    
    public void print(){
        System.out.println(s);
    }
    
    class SInner{
        
        private String p ;
        
        public void print(){
            System.out.println(p);
        }
    }
    
}
