package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistExample {

    public static void main(String[] args) {
        
        
        LinkedList<String> linkedList = addobjects();
        
        
        printList(linkedList);
        
        
      //peek
        linkedList.peek();
        
        printList(linkedList);
        
       String s = linkedList.poll();
       System.out.println(s + "is taken out");
       
       printList(linkedList);       
       
       System.out.println(linkedList.pop() + "popped");
       printList(linkedList);
        
       
        
        

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator it = linkedList.iterator();
        StringBuffer sbf = new StringBuffer();
        
        while(it.hasNext()){
            sbf.append(it.next()+"  ");
        
        }
        
        System.out.println(sbf.toString());
    }

    private static LinkedList<String> addobjects() {

        LinkedList<String> linkedList = new LinkedList<>();
        int a = 1 ;
        while(a <= 10){            
            linkedList.add("item"+String.valueOf( a ) );
            a++;
        }  
        
        return linkedList;
    }

}
