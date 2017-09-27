/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *marker interface

 * object cloning
 */
public class interface9 implements Cloneable {                     //should implement cloneable to clone 
int a=10;
int b=45;
public static void main(String[] args) throws CloneNotSupportedException{
    interface9 A=new interface9();
    System.out.println(A.a);
       System.out.println(A.b);
       A.a=444;
        A.b=777;
          System.out.println(A.a);   System.out.println(A.b);
     interface9 Q=(interface9)    A.clone();
A.a=888;
A.b=636;
          System.out.println(A.a);   System.out.println(A.b);
          System.out.println(Q.a);   System.out.println(Q.b);

}
}
