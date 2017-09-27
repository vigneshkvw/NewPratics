/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */

abstract class parent{
    abstract void m1();
    abstract void m2();
    
    
}
abstract class Abstract5 extends parent{
    void m1(){
    System.out.println("m1");
}

}
abstract public class Abstract2 extends Abstract5 {
public static void main(String[] args){
    Abstract2 a =new Abstract2() {

            @Override
            void m2() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    
}

}

