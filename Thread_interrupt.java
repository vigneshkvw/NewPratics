/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *
 *we a frnd is sleep we can wake him up using interrupt()
 */
public class Thread_interrupt {
public static void main(String[] args){
interrupts A=new interrupts();
A.start();
A.interrupt();
}
}
