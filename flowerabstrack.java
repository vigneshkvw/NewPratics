/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
abstract  class flower{
   abstract  void rose();
}
public class flowerabstrack extends flower {

    @Override
    void rose() {
          System.out.println("rose is a rose");
    }
public static void main(String[] args){
    new flowerabstrack().rose();
}
}
