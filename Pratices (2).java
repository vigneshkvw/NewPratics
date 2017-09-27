/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.pratics;

/**
 *examples of
 * class
 * object
 * variable
 * methods
 * constructors
 * instances block
 * static block
 * inheritances
 * encap
 * poly
 * abstract
 * abstract class
 * interface
 * i.o packages
 * main method
 * package
 * thread
 * inner class
 * array
 * String
 * File input
 * Buffer input
 * Serialiazation
 * 
 */
public class Pratices {
   int a=3;
   int b=8;
   void add(){                                                                  //instances method
        System.out.println(a+b);

    }
    {
        for(int i=0;i<5;i++){                                                   // when object created instances block created
          System.out.println("insatances block  :"+i);
      }

    }
    static {                                                                    // runs when the main method created
       int a=0;                                                                 //local variable
       while(a<=5){
        System.out.println("Static Block :" +a);
           a++;
       }
    }

    public Pratices() {
    System.out.println("0 args construtor :");
    }

    public Pratices(int Q){
    System.out.println("1-args cons:");
    }
    public static void main(String [] args){                                    // main method
    int aa=55;
        Pratices A=new Pratices();                                              // object creation
        A.add();                                                                // method calling  instances menthod
    System.out.println(A.a);
    System.out.println(aa);                                                     //static variable
    Pratices Q=new Pratices(15);                                                //calling local variable
    }
}
