package com.java.multithreading;

public class Counter implements Runnable{

    @Override
    public void run() {
        int i = 0;
        for(i=1; i<=100;i++){
            if(i%10 == 0){
                System.out.println("Count is : "+ Integer.toString(i));                
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                     System.out.println("Thread interrupted:"+Thread.currentThread().getName());
            }
        }        
    }

    public static void main(String[] str){
        
        Thread t = new Thread(new Counter());
        t.start();
        
    }
    
}
