/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.w3resources;

/**
 *
 * @author viki
 */
public class String2 {
public static void main(String[] args){
    String A="viki";
   A.concat("waram");                                                           // concat is not modified we cant modified is called immutable
    System.out.println(A);
String B=A.concat("waran");                                                     // we need to invoke new variable to modified
    System.out.println(B.indexOf('a'));
    StringBuffer str=new StringBuffer("viki");                                  //  we can modified
    str.append("suji");
System.out.println(str.insert(1, "q"));                                         // insert element

}
}
