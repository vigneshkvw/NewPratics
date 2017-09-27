/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class Arrary {
public static void main(String[] args) throws NullPointerException{
    int [] a=new int[2];
    a[0]=10;
    a[1]=404;
   
    System.out.println(a.length);   //print length
for(int i=0;i<a.length;i++){             //print array
    System.out.println(a[i]);
}
    for (int aa:a){                       //print array
   System.out.println(aa);

    }
    emp e1=new emp(111, "viki");
    emp e2=new emp(222, "waran");
    
    emp[] v=new emp[5];
   v[0]=e1;
    v[4]=e2;
    for (Object o:v){                         //print array
if(o instanceof emp){
 emp BB =(emp)o;
    System.out.println(BB.ename);
}
if(o==null){
    System.out.println(o);
}
    }

}
}
