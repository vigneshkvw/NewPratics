/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.hackers;

import java.util.Scanner;

/**
 *
 * Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100
cpp            065
python         050
================================
 */
public class stdin1 {
public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
          for(int i=0;i<3;i++)
                {
                    String s1=sc.next();
                    int x=sc.nextInt();
                    System.out.printf( "%-15s%03d %n", s1, x);
                }
      System.out.println("================================");
}
}