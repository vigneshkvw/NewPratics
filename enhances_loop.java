/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.w3resources;

import java.util.Scanner;

/**
 *
 * @author viki
 */
public class enhances_loop {
    public static void main(String[] args){
Scanner A=new Scanner(System.in);
System.out.println("enter the size of The Array");
int c=A.nextInt();
int[] a=new int[c];
    for(int i=0;i<c;i++){
        a[i]=A.nextInt();
    }
for(int aa:a){
    System.out.println(aa);
}
}
}