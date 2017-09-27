/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *daemon thread
 */
package com.smhack.thread;
public class daemon_thread  {
public static void main(String[] args){
    Daemonchild A=new Daemonchild();
    A.setDaemon(true);
    A.start();
    for(int i=0;i<4;i++){
        System.out.println(i);
try{Thread.sleep(1000);
    }catch(InterruptedException ie){
        ie.printStackTrace();
    }
    
    }}}
