/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.hackers;

import java.util.Scanner;

/**
 *Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
 * @author viki
 */
public class stdin2 {
public static void main(String[] args){
    Scanner A=new Scanner(System.in);
    int a=A.nextInt();
    for(int i=0;i<=10;i++){
       int mul=i*a;
       System.out.println(i+"*"+a+"="+mul);
    }
    A.close();
}
}
