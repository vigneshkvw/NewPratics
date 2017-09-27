/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.w3resources;

import java.util.Scanner;

/**
 *Write a Java program to test if an array contains a specific value
 * @author viki
 */

public class array3 {
public static void main(String[] args){
    int[] A={5,574,45,41,54,45};
Scanner M=new Scanner(System.in);
int Q=M.nextInt();
    for (int i : A) {
        if(Q==i){
            System.out.println(true);
        }else System.out.println(false);
    }
}
}
