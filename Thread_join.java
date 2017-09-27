/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *
 *using join() the tread will excuted 1st...i.e main will wait
 */
public class Thread_join {
public static void main(String[] args){
    join A=new join();
    join B=new join();
 A.start();
 
        try {
            A.join(2000);                                                       //we can pass time limit
        } catch (InterruptedException ex) {
ex.printStackTrace();
        }
 B.start();
 for(int i=0;i<4;i++){
       System.out.println(Thread.currentThread().getName()+"main child");
       try{
           Thread.sleep(1000);
       }catch(InterruptedException ie){
           ie.printStackTrace();
       }
   }
}
}
