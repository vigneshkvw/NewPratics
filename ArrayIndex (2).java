/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * find the index of missing array
 */
public class ArrayIndex {
public static void main(String[] args){
    int[] a=new int[4];
    a[0]=10;
a[3]=10;a[2]=10;
    for (int i = 0; i < a.length; i++) {
        if(a[i]==0)
        {
            System.out.println(i);
        }
    }
}
}
