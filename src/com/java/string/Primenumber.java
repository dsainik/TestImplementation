package com.java.string;

public class Primenumber {

    public static void main(String[] args) {

       int input = 131;
       
       System.out.println( input + "is prime" + isPrime(input));

    }
    
    
    private static boolean isPrime(int n){
        
           
      int i = n,cnt = 0;
      
      while(i > 0){
          
          if(n % i == 0){
              cnt++;
          }
        i--;  
      }
        
      if( cnt == 2){
          return true;
      }else{
          return false;
      }  
    }

}
