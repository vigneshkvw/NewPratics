/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.pratics;

/**
 * compile time ---------------> method overloading
 *run time      ---------------> method over loading
 *
 */
public class poly {
int a,b=2;
  void add(){                                                                  //instances method
        System.out.println(a+b);

    }
    public poly() {

}
        public poly(int b){
System.out.println(b);
}
public static  class poly1 extends poly{
   @Override
   void add(){
       System.out.println(a*b);
   }

}
    public static void main(String[] args){
   new poly().add();                                                                  //nameless ibject creation
   new poly(10);                                                                //nethod overloading
new poly1().add();
    }

}
