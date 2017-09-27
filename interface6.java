/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *nested interface
 */
class  A{                                  //interface A can also be declace
    interface B{
        void m1();
    }
}
public class interface6 implements A.B{

    public void m1() {
    System.out.println("hi");
    }
public static void main(String[] args){
    new interface6().m1();
}
}
