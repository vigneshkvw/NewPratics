/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
class emp{
    int eid;
    String ename;
    public emp(int eid,String ename){
    this.eid=eid;
    this.ename=ename;
    }
}

public class String6 {
public static void main(String[] args){
    emp e=new emp(555,"viki");
    System.out.println(e.toString());
}
}
