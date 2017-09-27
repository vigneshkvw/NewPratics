
package com.smhack.iopacakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author viki
 */
public class demo {
public static void main(String[] args) throws  FileNotFoundException,IOException{
    FileInputStream fs=new FileInputStream("C:/Users/viki/Documents/NetBeansProjects/oops/viki.txt");
    FileOutputStream fo=new  FileOutputStream("/name.txt");
    fs.available();
    int A;
    while(    (A=fs.read())!=-1){
    System.out.println((char)A);
    fo.write(A);
    }
   
fo.close();
fs.close();
}
}
