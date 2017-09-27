/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
class parent{
    void m1(){
        System.out.println("parent");
    }
}
public class poly6 {
    static void m1(){
        System.out.println("child");

    }
public static void main(String2[] args){
    parent p=new poly6();                   
    p.m1();
}
}
