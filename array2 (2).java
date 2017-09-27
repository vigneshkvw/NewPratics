/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.w3resources;

/**
 *Write a Java program to calculate the average value of array elements
 * @author viki
 */
public class array2 {
public static void main(String[] args){
    int[] a={5,4,8,6,4,6,78,87};
    double avg=0;
    int sum=0;
    for (int i : a) {
        sum+=i;
    }
    System.out.println(sum);
    System.out.println(a.length);

     avg=sum%a.length;
    System.out.println(avg);
}
}
