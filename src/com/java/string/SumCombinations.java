package com.java.string;

public class SumCombinations {

    public static void main(String[] args) {
        
        int sum = 13;
        int[] input = {2, 4, 4, 6, 3, 9, 11};
        
        for (int i = 0; i < input.length ; i++){
            
            int first = input[i];
            
            for(int j = 0 ; j < input.length ; j++){
                
                if(first != input[j]){
                    
                    if(first + input[j] == sum){
                        
                        System.out.println("***"+ first + "," + input[j]);
                    }
                }
                
            }
            
        }
        
        

    }

}
