/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
 abstract class child {
abstract void m1();

    public child() {
    System.out.println("contr abs");

    }


}
 class Abstract5 extends child{
    void m1(){
        System.out.println("m1");
    }

    public Abstract5() {
super();
        System.out.println("abst cont");
    }
    public static void main(String[] args){
        new Abstract5().m1();

    }
 }




