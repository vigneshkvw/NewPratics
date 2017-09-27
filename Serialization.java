package com.smhack.iopacakage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *writing obj to txt file
 *
 */
public class Serialization {
public static void main(String[] args) throws FileNotFoundException, IOException
{
    emp e=new emp();
FileOutputStream fos=new FileOutputStream("C:/Users/viki/Documents/NetBeansProjects/oops/viki.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(e);
System.out.println("complete");
}
}
