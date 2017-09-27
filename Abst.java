/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.pratics;

/**
 *In this Example we want you to take an abstract class which we have defined for you and develop two classes.
 * The abstract class represents the basic building block for employees in a personnel database.
 *Abstract class
 * Abstract method
 */
abstract class Abss{
    abstract void  Ename(String str);
abstract void Eid(int  adr);

}
public  class Abst extends Abss {


public static  void main(String[] args){
    new Abst().Eid(11);
    new Abst().Ename("viki");
}
void Ename(String str){
    System.out.println(str);
}
void Eid(int adr){
    System.out.println(adr);

}

}
