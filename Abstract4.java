/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
abstract  class child {
abstract void m1();
abstract void m2();
void m3(){
    System.out.println("m3");
}

    public child() {
System.out.println("child cons");

    }
}
  class Abstract4 extends Abstract5{

    void m1(){
 System.out.println("m1");

    }
    void m2(){
 System.out.println("m2");

    }

        public Abstract4() {
            super();
System.out.println("abstract const");
        }


  public static void main(String[] args){
     Abstract4 a=new Abstract4();
     a.m1();
     a.m2();
     a.m3();
    }
}

