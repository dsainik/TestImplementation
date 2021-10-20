package com.java.testapps;

public class FiboExp {
  
    public static void main(String[] s){
        
        int n = 20;
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        System.out.println(n1+" "+n2);
        for(int cnt = 2; cnt<n; cnt ++){
            n3 = n1+n2;
            System.out.println(" "+ n3);
            n1 = n2;
            n2 = n3;
        }
        
    }
    
}
