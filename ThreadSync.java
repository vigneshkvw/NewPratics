/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *
 * @author viki
 */
public class ThreadSync {
public static void main(String[] args){
    new MyThread1().start();
      new Mythread2().start();
        new Mythread3().start();
}
}
