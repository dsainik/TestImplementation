package com.java.testapps;

public class PrimeNumbers {
 
    public static void main(String[] args){
        
        int n = 10;
        
        for(int m = 2; m <= n ; m++){
            
           if(checkIfPrime(m)){
               System.out.println(m);
           };
            
        }   
    }

    private static boolean checkIfPrime(int m) {
        int cnt = 0;
        for(int i = 1 ; i <= m ; i++){
            if(m%i == 0){
                cnt++;
            }
        }
        
        if(cnt == 2){
            return true;
        }else{
            return false;
        }
        
    }
}
