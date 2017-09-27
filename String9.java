/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class String9 {
public static void main(String[] args){
    String A= new String("viki");
    System.out.println(A.charAt(2));
  System.out.println(A.concat(A));  // print double time
    String B= new String("ada");

  System.out.println(A.contains(B));  //compare method
    System.out.println(A.compareToIgnoreCase(B));
   System.out.println(A.trim().length());
   StringBuffer Q=new StringBuffer("waeam");
      System.out.println(Q.append(Q));    // print doubletime
         System.out.println(Q.append(Q));   // prin 3 time
 System.out.println(Q.delete(1, 2));   //delete char
  System.out.println(Q.capacity());   //String stroage capacity
   System.out.println(Q.indexOf("a"));   //find the index
   System.out.println(A.lastIndexOf("i"));
   System.out.println(Q.reverse());  // reverse String







}
}
