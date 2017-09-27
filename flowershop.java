/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * interface for flower
 */
interface sf{
    void rose();
}
public class flowershop implements sf {

    public void rose() {
       System.out.println("rose is a rose");
    }
public static void main(String[] args){
    new flowershop().rose();
}
}
