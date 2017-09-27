/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.thread;

/**
 *
 * @author viki
 */
class RunnableThread implements Runnable {

    public void run() {
        for(int i=0;i<4;i++){
        System.out.println("user Thread");
    }
    }

}
