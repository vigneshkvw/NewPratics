/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * index even or odd
 */
public class ArrayEvenIndex {
public static void main(String[] args){
    String[] A=new String[4];
    A[0]="viki";A[1]="viki";A[2]="viki";A[3]="viki";
for(int i=0;i<A.length;i++){
    if(i%2==0){
        System.out.println("even idex is :"+i);
    }
    if(i%2!=0){
        System.out.println("odd idex is :"+i);
    }

}
}
}
