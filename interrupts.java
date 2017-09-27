/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *
 * wherver thread is sleep intrrupted is provide
 */
class interrupts extends Thread{
@Override
    public void run(){
    for(int i=0;i<4;i++){
        System.out.println(Thread.currentThread().getName()+"child interrupt");
    }try{
        Thread.sleep(1);
       }catch(InterruptedException ie){
        System.out.println("thread intrepput");
    }
}
}


