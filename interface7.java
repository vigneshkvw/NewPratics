/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *interface variable
 */
interface A{
    int a=505;
    
}
interface B{
    int a=404;
}
public class interface7 implements A,B{
public void m1(){
    System.out.println(A.a);   //both interface has same name so use interface name to refer
System.out.println(B.a);

}
public static void main(String[] args){
    new interface7().m1();
}
}
