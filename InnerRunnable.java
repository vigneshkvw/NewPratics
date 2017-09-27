/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *
 * @author viki
 */
public class InnerRunnable {
public static void main(String[] args){

    final Runnable R=new Runnable() {

            public void run() {
          System.out.println("hii Runnable");
            }
        };
Thread t1=new Thread(R);
t1.start();
}

}
