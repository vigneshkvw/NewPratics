/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *Runnable methods
 *
 * contain only run methods
 *
 * overwritten run methods write the logics
 *
 * create obj
 *
 *
 **/
public class Thread_Runnable {
public static void main(String[] args){
    RunnableThread R=new RunnableThread();
    Thread t=new Thread(R);
    t.start();
    for(int i=0;i<4;i++){
        System.out.println(i);
    }
}
}
