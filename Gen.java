/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
class Gen<T> {
T ob;

    Gen(T ob) {
        this.ob=ob;
    }
   public  void Show(){
    System.out.println(ob);
}
public T getob(){
    return ob;
}
}
