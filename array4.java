/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.w3resources;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *Write a Java program to find the index of an array element.
 */
public class array4 {
public static void main(String[] args){
 Scanner B=new Scanner(System.in);
   System.out.println("Enter the size of the array");
 int n=B.nextInt();
  int [] A1=new int[n];
         System.out.println("Enter array values");
for(int i=0;i<n;i++){
    A1[i]=B.nextInt();
}
    System.out.println(Arrays.toString(A1));
System.out.println("ENter The Element to find the index :");
int Q=B.nextInt();
for(int i=0;i<n;i++)

{
    if (A1[i]=Q) {
        
    } else {
    }
}

}
}
