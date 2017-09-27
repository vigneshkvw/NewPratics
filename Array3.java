/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * array in methos and argument
 * @author viki
 */
public class Array3 {
int[] m1(){
 int[] a=new int[3];

 return a;

}
void m2(int[] b){
      System.out.println("m2 :");
for (int bb:b){
    System.out.println(bb);
}
}
public static void main(String[] args){
    Array3 A=new Array3();
    int [] Q=A.m1();
    for(int AA:Q){
        System.out.println(AA);
    }
    int[] d={10,20};
    A.m2(d);
}
}
