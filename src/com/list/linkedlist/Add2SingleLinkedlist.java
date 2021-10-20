package com.list.linkedlist;

import java.util.List;

public class Add2SingleLinkedlist {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        

    }

    
    public static ListNode addTwoNodes(ListNode firstNum , ListNode secNum){
        
        
     // Head of the new linked list - this is the head of the resultant list
        ListNode head = null;
        // Reference of head which is null at this point
        ListNode temp = null;
        int carry = 0;
        int sum = 0;
        
        while(firstNum != null || secNum != null){
            
            sum =  carry;
            if(firstNum != null){
                
               sum+= firstNum.val; 
            }
            
            if(secNum != null){
                
                sum+= secNum.val;
            }
            
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            
            if(temp == null){
            temp = head = newNode;
            }else{
               temp.next = newNode;
               temp = temp.next;
                
            }
            
        }
        
        if(carry > 0 ){
            
            temp = new ListNode(carry);
        }
        
        return head;
            
        }
    
}
