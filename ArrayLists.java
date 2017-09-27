/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists {
    private static int n;
     public static void main(String[] args)
    {
 Scanner scan = new Scanner(System.in);
         ArrayList<String> list = new ArrayList<String>();

 System.out.println("\nEnter 'n' value :");
		n = Integer.parseInt(scan.nextLine());
System.out.println("Enter the data :");

		for(int i=0; i<n; i++) {

			list.add(scan.nextLine());
System.out.print(i);
        }
     }

}
