package com.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

    public static void main(String[] str){
        FileWriter fiout =null;
        try{
            FileReader fr = new FileReader("C:/abc.txt");
             fiout = new FileWriter(new File("output1.txt"));
            BufferedReader br = new BufferedReader(fr);
            String text = br.readLine();
            
            
            
            while(text != null){                
                System.out.println(text+"\n");
                fiout.write(text+"\n"); 
                text = br.readLine();
            }           
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try {
                fiout.flush();
                fiout.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        
        
    }
    
}
