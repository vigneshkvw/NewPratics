
package com.smhack.iopacakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class iopackage  {
    @SuppressWarnings("empty-statement")
    public static void main(String [] args) throws FileNotFoundException,IOException{

FileInputStream fis=new FileInputStream("/viki.txt");
FileOutputStream fos =new FileOutputStream("/xyz.txt");
int c;
while( (c=fis.read())!=-1)
{
    System.out.print((char)c);
    fos.write(c);
}
fis.close();
fos.close();
    }
}