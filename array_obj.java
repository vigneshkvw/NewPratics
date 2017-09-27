/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smhack.w3resources;

/**
 *
 * @author viki
 */

class Car{
  public int power;
  public int Serial_no;
  public Car(int p, int s){
    power = p;
    Serial_no = s;
  }
}

public class array_obj{
  public static void main(String[] args){
    Car[] c;
    c = new Car[10];
    c[0] = new Car(800,111);
 System.out.println(c);
  }
}