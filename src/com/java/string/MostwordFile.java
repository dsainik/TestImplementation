package com.java.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostwordFile {
    
    public static void main(String s[]) throws FileNotFoundException{
        
        File file = new File("input1.txt");
        Map<String,Integer> wordmap = new HashMap<>();
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
        String line = scanner.nextLine();
        
        
         
        String[] words = line.split("\\s");
        for(String word:words){
            if(wordmap.containsKey(word)){
                wordmap.put(word, wordmap.get(word)+1);
            }else{
                wordmap.put(word, 1);
            }            
        }
        
        
        }
        
        wordmap.forEach((k,v) -> {System.out.println("Count of "+ k+ "= "+ v);});
        
    }
    

}
