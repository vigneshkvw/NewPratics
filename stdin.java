/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.hackers;

import java.util.Scanner;

/**
 *In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are  lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125
 * @author viki
 */
public class stdin
{
    public static void main(String[] args){
Scanner A=new Scanner(System.in);
System.out.println("Enter your 1st number :");
int a=A.nextInt();
System.out.println("Enter your 2st number :");
int b=A.nextInt();
System.out.println("Enter your 3st number :");
int c=A.nextInt();
 System.out.println(a);
 System.out.println(b);
 System.out.println(c);
    }
}