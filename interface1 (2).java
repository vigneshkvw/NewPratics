/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.pratics;

/**
 *
 * @author viki
 */

interface A{
    void B();
}
public class interface1 implements A{

    public void B() {
       System.out.println("class B :");
    }
public static void main(String[] args){
    new interface1().B();
}
}
