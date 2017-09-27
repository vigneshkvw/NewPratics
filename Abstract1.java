/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public abstract  class Abstract1 {
abstract void m1();
abstract void m2();
abstract void m3();
void  m4(){
    System.out.println("m4 :");
}
static class child extends Abstract1{
    void m1(){
   System.out.println("m1:");

    }
     void m2(){
   System.out.println("m2:");

    }
     void m3(){
   System.out.println("m3:");

    }

}
public static void main(String[] args){
    child a=new child();
a.m1();
a.m2();
a.m3();a.m4();
Abstract1 t=new child();
t.m1();
t.m2();


}
}
