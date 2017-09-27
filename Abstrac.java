/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.hackers;

/**
 *
 *Sample Input

A tale of two cities
Sample Output

The title is: A tale of two cities
 */
abstract class  A{
abstract   void  titile();
}
 class Abstrac extends A{
    @Override
    void titile() {
        System.out.println("The title is: A tale of two cities");

    }
    public static void main(String[] args){
        new Abstrac().titile();
    }
}
