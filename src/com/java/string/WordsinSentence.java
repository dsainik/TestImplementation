package com.java.string;

import java.util.StringTokenizer;

public class WordsinSentence {
    
   public static void main(String str[]){
       
       String sentence = "I am a bad cat @ who does mew-mew";
       
       int count = countBasic(sentence);
               //countthewordsUsingTokenizer(sentence);
               //countthewords(sentence);      
       System.out.println("words count is >>"+ count);
       
   } 
    
   public static int countthewords(String sentence){
       
             
       if(sentence == null || sentence.isEmpty()){
           return 0;
       }
       
       String[] words = sentence.split("\\s+");
       
       System.out.println("words are");
       for(String word:words){           
           System.out.println(word + "\n");
       }
       
       return words.length;
   }
   
   public static int countBasic(String sentence){
       
       if(sentence == null || sentence.isEmpty()){
           return 0;
       }
       
       int endOFLine = sentence.length() -1 ;
       char[] character = sentence.toCharArray();
       int wordcount = 0;
       boolean isWord = false;
       for (int i = 0 ; i <= endOFLine ; i ++){
           
           if(Character.isLetter(character[i]) && i != endOFLine){
               isWord = true;
               
               
           }else if(isWord && !Character.isLetter(character[i])){
               wordcount ++;
               isWord = false;
               
           }else if(Character.isLetter(character[i]) && i == endOFLine){
               
               wordcount ++;
           }
           
       }
       
       return wordcount;
       
   }
   
   public static int countthewordsUsingTokenizer(String sentence){
       
       
       if(sentence == null || sentence.isEmpty()){
           return 0;
       }
       
       StringTokenizer tokens = new StringTokenizer(sentence);
       
       int count = tokens.countTokens();
       System.out.println("words are");
       while(tokens.hasMoreElements()){
           System.out.println(tokens.nextToken());
           System.out.println("\n");
       }
       return count;
   }

}
