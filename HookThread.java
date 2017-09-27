/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
package com.smhack.thread;
public class HookThread {
public static void main(String[] args){
    HookChild A=new HookChild();
    Runtime R=Runtime.getRuntime();
    R.addShutdownHook(A);
    for(int i=0;i<5;i++){
           System.out.println("hook thread");
           try{Thread.sleep(1000);
    }catch(InterruptedException ie){
        ie.printStackTrace();
    }
}
}
}
