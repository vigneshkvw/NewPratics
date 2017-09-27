/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.w3resources;

/**
 *
 * @author viki
 */
interface A{
    void B();
void C();
void D();
}
class marker implements A{

    public void B() {
       
    }

    public void C() {
       
    }

    public void D() {
     
    }
    
}
public class inte_marker extends marker {
    @Override
public void B(){
    System.out.println("B_class");
}

    public void C() {
       System.out.println("C_class");
    }

    public void D() {
     System.out.println("D_class");
    }
    public static void main(String[] args){
        inte_marker Q=new inte_marker();
        Q.B();
        Q.C();Q.D();
    }
}
