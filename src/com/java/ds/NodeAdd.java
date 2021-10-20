package com.java.ds;

public class NodeAdd {


    
    public static void main(String[] str){
        
      Node node1;
      Node node2;
      
      
      
        
    }
    
      
    public static Node addNodes(Node node1, Node node2) {
        
        Node node3 = null;
        Node temp = null;
        
        
      if(node1 != null || node2 != null){
          
          int sum = 0;
          int temp = 0;
          int carry = 0;
          while(node1 != null || node2 != null){
              
              sum = node1.val + node2.val;
              if(sum > 10){
                  carry = 1;
                  temp = sum%10;
              }else{
                  temp = sum;
              }
              
              node3 = new Node(temp);
              
          }
          
          
          
          
      }  
        
        
        
        
        
        return node3;
    }
    
       
    static class Node{
        
        private int val;
        
        private Node next;
        
        public Node(int val){
            
            this.val = val;
        }
    }
    
}


 