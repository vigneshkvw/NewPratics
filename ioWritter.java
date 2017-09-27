/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.iopacakage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author viki
 */
public class ioWritter {

public static void main(String[] args) throws  FileNotFoundException,IOException{
    FileReader fs=new FileReader("C:/Users/viki/Documents/NetBeansProjects/oops/viki.txt");
    FileWriter fo=new  FileWriter("C:/Users/viki/Documents/NetBeansProjects/oops/name.txt");

    int A;
    while(    (A=fs.read())!=-1){
    System.out.println((char)A);
    fo.write(A);
    }

fo.close();
fs.close();
}
}
