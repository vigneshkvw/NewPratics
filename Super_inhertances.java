/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.w3resources;

/**
 *
 * @author viki
 */

class ne {
    int a=5;
}
public class Super_inhertances  extends ne{

    public int geta() {

        System.out.println(a);
        return a;
    }
public static void main(String[] args){
    new Super_inhertances().geta();
}

}
