/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *STring convert to buffer
 * Stringbuffer to String

 * compareto() return int value
 *
 */
public class String8 {
public static void main(String[] args){
    String s1="viki";
    StringBuffer s2=new StringBuffer(s1.toUpperCase());
    System.out.println(s2);
    String s3=new String(s2);
     System.out.println(s3.lastIndexOf(s3));       //compare to return int value

 System.out.println(s3.compareTo("waran"));       //compare to return int value
 System.out.println(s3.compareToIgnoreCase("Waran"));       //compare to return int value

}
}
