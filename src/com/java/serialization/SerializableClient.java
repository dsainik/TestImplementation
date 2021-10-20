package com.java.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableClient {
 
    public static void main(String[] str){
        
        
        Person p = new Person();
        p.setCountry("USA");
        p.setName("Sainik");
        p.setSsn(21212);
        
        Address add = new Address();
        add.setPincode("ww232");
        p.setAdd(add);
        
        try {
            FileOutputStream fio = new FileOutputStream(new File("person.ser"));
            ObjectOutputStream ios = new ObjectOutputStream(fio);
            ios.writeObject(p);
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        try {
            FileInputStream fis = new FileInputStream(new File("person.ser"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p1 = (Person)ois.readObject();
            
            System.out.println(p1.getName()+" FROM "+ p1.getCountry()+"ssn:"+p1.getSsn());
            ois.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
            
    
     
}
