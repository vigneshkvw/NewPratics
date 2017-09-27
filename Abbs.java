/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.pratics;

/**
 *
 * @author viki
 */
abstract class A {
    abstract void  A();     

}

class Abbs extends A{

    @Override
    void A() {
      System.out.println("class A");
    }
    void W(){

    }
public static  void main(String [] main){
    new Abbs().A();
}
}
