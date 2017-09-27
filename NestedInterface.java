/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.w3resources;



/**
 *
 * @author viki
 */
interface it1{
    void m2();
    interface  it2{
        void m1();
    }
}
public class NestedInterface implements it1 {

    public void m1() {
        System.out.println("nested interface");
    }

    public void m2() {
          System.out.println("main interface");
    }
public static void main(String[] args){
    NestedInterface Ne=new NestedInterface();
  Ne.m2();
Ne.m1();
}
}
