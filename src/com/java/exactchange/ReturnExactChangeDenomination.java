package com.java.exactchange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnExactChangeDenomination {

    public static void main(String[] args) {


        int customerAmt = 50;
        int price = 12;
        
        List<Integer> returnAmt = new ArrayList<>();
        
        Map<Integer,Integer> cashbox = new HashMap<>();
        cashbox.put(1, 10);
        cashbox.put(2, 10);
        cashbox.put(5, 10);
        cashbox.put(10, 10);
        cashbox.put(20, 10);
        
        int change = customerAmt - price;
        
        while(change > 0){
            if(change>= 20){
                returnAmt.add(20);
                change = change - 20;
                cashbox.put(20, cashbox.get(20) - 1);
                continue;
            }
              if(change>= 10){
                returnAmt.add(10);
                change = change - 10;
                cashbox.put(10, cashbox.get(10) - 1);
                continue;
            }
              if(change>= 5){
                returnAmt.add(5);
                change = change - 5;
                cashbox.put(5, cashbox.get(5) - 1);
                continue;
            }
              if(change>= 2){
                returnAmt.add(2);
                change = change - 2;
                cashbox.put(2, cashbox.get(2) - 1);
                continue;
            }
              if(change>= 1){
                returnAmt.add(1);
                change = change - 1;
                cashbox.put(1, cashbox.get(1) - 1);
                continue;
            }
            
            
        }
        
        System.out.println("change" + returnAmt);

    }

}
