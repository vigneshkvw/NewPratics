/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *method return array
 * arugement array
 * 
 *
 */
public class Array2 {
int[] m1(){
    int[] a=new int[5];
    return a;
}
void m2(String[] str){
   System.out.println("m2 :");

  for (String s:str){
      System.out.println(s);
  }

}
public static void main(String[] args){
  Array2 A=new Array2();
          int[] x=A.m1();
          for (int xx:x){
              System.out.println(xx);
          }
          String[] str ={"viki"};
          A.m2(str);
}
}
