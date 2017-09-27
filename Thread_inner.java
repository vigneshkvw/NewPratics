/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class Thread_inner {
public static void main(String[] args){
    Thread t1=new Thread(){
      @Override
        public void run(){
            System.out.println("inner class");
        }
    };
    Thread t2=new Thread(){
      @Override
        public void run(){
            System.out.println("second inner class");
        }
    };
    t1.start();
    t2.start();
}
}
