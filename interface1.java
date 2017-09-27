/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.hackers;

import java.util.Scanner;

/**
 *
 * Sample Input
6
Sample Output
I implemented: AdvancedArithmetic
12
Explanation

Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.
 */



interface A{
    void div();
}
public class interface1 implements A{

    public void div() {
       Scanner M=new Scanner(System.in);
       int q=M.nextInt();
       for(int i=0;i<q;i++){
           if(i%q==0){
               System.out.println(i);
           }

       }
    }
public static void main(String[] args){
    new interface1().div();
}
}
