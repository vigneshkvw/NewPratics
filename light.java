/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.w3resources;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viki
 */
class light extends Thread{

@Override
public void run(){
    System.out.println("red");
        try {
            int B=10;
            for(int a:B)
                System.out.println(a);
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
}

}
