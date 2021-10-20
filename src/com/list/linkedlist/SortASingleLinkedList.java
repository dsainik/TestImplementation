package com.list.linkedlist;

public class SortASingleLinkedList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

       IntegerLinkedList linkedList = new IntegerLinkedList();
       linkedList.insertSorted(3);
       linkedList.insertSorted(5);
       linkedList.insertSorted(1);
       linkedList.insertSorted(2);
       
       linkedList.insertNthnode(2,4);
       
       
       IntegerNode integerNode = linkedList.head;
       while(integerNode != null){           
           System.out.println(integerNode.getNumber());
           integerNode = integerNode.next;
       }
        
    }

}
