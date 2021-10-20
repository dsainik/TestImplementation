package com.java.string;

public class PermutationString {

    public static void main(String[] args) {
        String abc = "123";
        permutation("", abc);
    }
    
    private static void permutation(String perm, String word){
        
        if(word.isEmpty()){
            
            System.err.print(perm + "\n");
        }
        
        for(int i = 0 ; i < word.length(); i ++){
            
             permutation(perm + word.charAt(i) 
                                 , word.substring(0,i)
                                       + word.substring(i+1,word.length()));
        }
        
        
    }

}
