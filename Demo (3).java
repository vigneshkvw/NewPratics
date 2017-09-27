/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread;

/**
 *
 * @author viki
 */
public class Demo {
public static void main(String [] args) throws InterruptedException{
    mythread t=new mythread();
t.run();
mythread t1=new mythread();
t1.start();

}
}
