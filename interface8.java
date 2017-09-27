/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *adaptor class
 */


interface A{
    void m1();
 void m2(); void m3(); void m4(); void m5(); void m6(); void m7(); void m8(); void m9(); void m10();
}

class B implements A{

    public void m1() {
    }

    public void m2() {
    }

    public void m3() {
    }

    public void m4() {
    }

    public void m5() {
    }

    public void m6() {
    }

    public void m7() {
    }

    public void m8() {
    }

    public void m9() {
    }

    public void m10() {
    }

}
public class interface8 extends  B{
public void m1(){
    System.out.println("m1");
}
public static void main(String[] args){
   new interface8().m1();
}
}
