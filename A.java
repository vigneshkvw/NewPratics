/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *
 * @author viki
 */
public class A {
synchronized static void msg(String str){
    for(int i=0;i<4;i++){
    System.out.println("hi----->"+str);
    
    try {
Thread.sleep(1000);

    } catch (InterruptedException ie) {
    ie.printStackTrace();}
    }
}
}
