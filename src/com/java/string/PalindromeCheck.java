package com.java.string;

public class PalindromeCheck {

    public static void main(String[] args) {

     String input = "four";
     
     System.out.println(input + " is Palindrome" + check(input));
        
        

    }

    private static boolean check(String input) {
        char[] c = input.toCharArray();
         boolean isPalindrome = true;
         for(int i = 0 ; i <= (c.length -1) /2 ; i ++ ){
             
             if( c[i] != c[c.length -1 - i]){
                 isPalindrome = false;
                 break;             
             }         
         }
         
         return isPalindrome;
    }

}
