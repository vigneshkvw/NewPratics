/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *
 * @author viki
 */
class Daemonchild extends Thread {
@Override
    public void run(){
for(int i=0;i<10;i++){
        System.out.println("daemon thread");
try{Thread.sleep(1000);
    }catch(InterruptedException ie){
        ie.printStackTrace();
    }}


}}
