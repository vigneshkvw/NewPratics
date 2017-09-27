/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *
 * @author viki
 */
class join extends Thread {
@Override
    public void run(){
   for(int i=0;i<4;i++){
       System.out.println(Thread.currentThread().getName()+"join child");
       try{
           Thread.sleep(1000);
       }catch(InterruptedException ie){
           ie.printStackTrace();
       }
   }
}
}
