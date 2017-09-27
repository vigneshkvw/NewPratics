
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class ArratListString {
public static void main(String[] args){
    ArrayList A=new ArrayList();
    A.add("viki");
    A.add("waran");
    A.add(new Integer(10));
    String name1=(String) A.get(0);
    System.out.println(name1);
    String name3=(String)A.get(1 );
    System.out.println(name3);
    ArrayList<String> Q=new ArrayList<String>();

    Gen<String> O=new Gen<String>("viki");

    O.Show();
Gen<Integer> E=new Gen<Integer>(10);
E.Show();
}
}
