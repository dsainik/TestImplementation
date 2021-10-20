package com.java.string;

public class ReverseString {

    public static void main(String[] args) {
        
        String input = "four";
        
       // String reversed = new StringBuilder(input).reverse().toString();
        
        char[] c = input.toCharArray();
        int j = c.length -1;
        for(int i = 0;i < j; i++){
            
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            j--;
        }

        System.out.println(new String(c));
    }

}
