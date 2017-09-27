/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viki
 */
class mythread extends Thread{
@Override
public void run(){
    		try {
    try {
            System.out.println("red light");
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(mythread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("orange light");
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(mythread.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("green light");
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(mythread.class.getName()).log(Level.SEVERE, null, ex);
        }
    } catch (Exception e) {
                System.out.println("SELF THROWN EXCEPTION IS--->" + e);
            } finally {
            }
}}
