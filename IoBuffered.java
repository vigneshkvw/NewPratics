/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.iopacakage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author viki
 */
public class IoBuffered {

public static void main(String[] args) throws   FileNotFoundException, IOException{
    BufferedReader br=new BufferedReader(new FileReader("C:/Users/viki/Documents/NetBeansProjects/oops/viki.txt"));
   BufferedWriter bw= new BufferedWriter(new FileWriter("C:/Users/viki/Documents/NetBeansProjects/oops/waran.txt"));
    String line;
    while(    (line=br.readLine())!=null){
    System.out.println(line);
    bw.write(line);
    bw.newLine();
    }

br.close();
bw.close();
}
}
