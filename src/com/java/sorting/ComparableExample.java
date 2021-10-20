package com.java.sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;

class Person implements Comparable{
    int id;
    String nm;
    
    public Person(int id, String nm){
        this.id = id;
        this.nm = nm;
    }
    
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        
        Person other = (Person) obj;
        if (id - other.id == 0)
            return true;
        return false;
    }



    public int compareTo(Object o) {
        Person p = (Person)o;
        return this.id - p.id;
        
    }
}


public class ComparableExample {

    public static void main(String[] args){
        
        Person a = new Person(3,"Sainik");
        Person b = new Person(1,"Rahul");
        Person c = new Person(1,"Rahulcopy");
        
        List<Person> men = new ArrayList<Person>();
        men.add(a);
        men.add(b);
        //men.add(c);
        
        Collections.sort(men);
        
        for (Person person : men) {
            System.out.println(person.nm);
        }
        
        
        
    }
    
}
