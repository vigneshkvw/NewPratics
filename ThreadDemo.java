/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *
 * @author viki
 */
public class ThreadDemo {
public static void main(String[] args) throws InterruptedException{
    Demo A=new Demo();

   A.start();
    Demo b=new Demo();
b.start();
    Demo c=new Demo();
    c.start();
for(int i=0;i<2;i++){
        System.out.println("waran");
  try{Thread.sleep(1000);}
    catch(InterruptedException ie)
    {
        ie.printStackTrace();
    }
    }

}

}
