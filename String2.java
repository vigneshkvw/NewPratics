/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *to string()
 * hashcode()
 *get class()
 * equals
 */
public class String2 {
public static void main(String[] main){
    String R ="hi";
    emp e=new emp(11,"viki");
    System.out.println(R.hashCode());
    System.out.println(R.getClass());
System.out.println(R.toString());
System.out.println(R.equals(R));

    System.out.println(e.hashCode());
    System.out.println(e.getClass());
System.out.println(e.toString());
System.out.println(e.equals(R));
}
}
