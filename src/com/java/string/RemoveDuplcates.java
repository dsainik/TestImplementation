package com.java.string;

import java.util.Arrays;

public class RemoveDuplcates {
    
    public static void main(String str[]){
        
        String input = "aalabama";

        char[] in = input.toCharArray();
        Arrays.sort(in);
        char[] result = new char[in.length];
        char previous = in[0];
        result[0] = previous;

        for (int i = 1; i < in.length; i++) {
            char ch = in[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }

       
         System.out.println("===>" + new String(result));   
        }
        
      

}
