package com.java.string;

import java.util.Arrays;

public class Anagram {

    public static void main(String st[]){
        
        System.out.println(isAnagram("Army", "Mary"));
        
    }
    
    private static boolean isAnagram(String str1, String str2){
        str1 = str1.toLowerCase(); str2 = str2.toLowerCase();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        return Arrays.equals(c1, c2);
        
        
        
    }
}
