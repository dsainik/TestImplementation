package com.list.linkedlist;

public class IntegerLinkedList {
    
    IntegerNode head;    
    
    public void insertSorted(Integer value){
        
      if(head == null || head.getNumber() > value){
          IntegerNode newNode = new IntegerNode(value);
          newNode.setNext(head);
          head = newNode;
          return;
      } 
        
      IntegerNode current = head.next;
      IntegerNode previous = head;
      while( current != null && current.getNumber() <= value){
          previous = current;
          current = current.getNext();          
      }
      IntegerNode newdata = new IntegerNode(value);
      previous.setNext(newdata);
      newdata.setNext(current);       
        
    }
    
    
   public void insertNthnode(int n ,int val){
        
       
   if(head == null){
       IntegerNode node = new IntegerNode(val);
       head.setNext(null);
       head = node;       
   }   
   
   
   IntegerNode current = head.next;
   IntegerNode previous = head;
   while(n > 1 && current != null){
      previous = current;
      current = current.next;
       n--;
   }
       
   IntegerNode node = new IntegerNode(val);
   previous.setNext(node);
   node.setNext(current);
   
   
   }
    
    
    
    
    

}
