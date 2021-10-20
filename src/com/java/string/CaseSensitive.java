package com.java.string;

public class CaseSensitive {

    public static void main(String[] args) {
        String input = "Mary";
        
        char[] c = input.toCharArray();
        int lower = 0, upper = 0;
        for(char letter : c){
            
            if(letter >= 'a' && letter <= 'z'){
                
                lower ++ ;
                
            }else if(letter >= 'A' && letter <= 'Z'){
                upper++;
            }
            
        }

        System.out.println("Upper" + upper);
        System.out.println("Lower" + lower);
    }

}
