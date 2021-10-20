package com.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemDupFromList {
    public static void main(String[] args) {
        List<String> li = new ArrayList<String>();
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("one");// Duplicate
        li.add("one");// Duplicate
        // We have facility to pass a List into Set constructor and vice verse to cast
        Set<String> uniqueSet = new HashSet<>(li);
        
        
        List<String> li2 = new ArrayList<String>(uniqueSet); // no order
        
        for (String string : li2) {
            System.out.println(string);
        }
        
    }
}
