
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class ArrayRoation {

    public static void main(String[] args) {
        Scanner arrary = new Scanner(System.in);
         System.out.print("enter arrary size :");
        int len = arrary.nextInt();
         System.out.print("enter rotation:");
        int rotation = arrary.nextInt();
        int [] arr = new int [len];
        int ptr = (rotation*-1) + len;
        for(int i = 0; i<len; i++){
             System.out.println("enter your element :");
            arr[ptr++] = arrary.nextInt();
            if(ptr==len) ptr = 0;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(+arr[i] + " ");
        }
}
}