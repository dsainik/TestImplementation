package com.java.string;

import java.util.StringTokenizer;

public class WordwithSpecificCount {
    
   public static void main(String str[]){
       
       String sentence = "I am a bad cat @ who does mew-mew";
       int limit = 3;
       
       int count = findwords2(sentence , limit);
               //findwords(sentence , limit);
                    
       System.out.println("words count is >>"+ count);
       
   }

    private static int findwords(String sentence, int limit) {
    
        int count = 0;
        String[] words = sentence.split("\\s");
        for(String word : words){
            if(word.length() == limit){
                count++;                
            }
        }
        
    return count;
    } 
    
    private static int findwords2(String sentence, int limit) {
        
        int count = 0;
        if(sentence == null || sentence.isEmpty()){
            return 0;
        }
        
        int endOFLine = sentence.length() -1 ;
        char[] character = sentence.toCharArray();
        
        boolean isWord = false;
        int counter = 0;
        
        for (int i = 0 ; i <= endOFLine ; i++){
            
            if(Character.isLetter(character[i]) && i != endOFLine){
                isWord = true;
                counter++;
                
            }else if(isWord && !Character.isLetter(character[i])){
                if(counter == limit){
                    count++;                    
                }
                counter = 0;
                isWord = false;
                
            }else if(Character.isLetter(character[i]) && i == endOFLine){
                if(counter == limit){
                    count++;
                    counter = 0;
                }
                
            }
            
        }
        
    return count;
    } 
    
   

}
