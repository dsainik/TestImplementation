package com.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamExample {

    public static void main(String[] args){
        
        File fin = new File("C:/abc.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(fin);
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        if(is != null){
            File f = new File("output.txt");
            byte[] buffer = new byte[1024];
            OutputStream os = null;
            try {
                os = new FileOutputStream(f);
                while(is.read(buffer) != -1){                    
                    os.write(buffer);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    os.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
            
        }
        
    }
    
}
