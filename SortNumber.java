package pratics;

import java.util.Scanner;


/*
 * Sorting the array
 * */
public class SortNumber {
public static void main(String [] args){
	System.out.println("Sort ArrayNumber !!!!");
	Scanner A=new Scanner(System.in);
	int n=A.nextInt();
	int[] a=new int[n];
	System.out.println("Enter Your Elements :");
	for(int i=0;i<a.length;i++){
		a[i]=A.nextInt();
	}
	sort(a);
for (int i : a) {
	System.out.println(i);
}    
}

private static void sort(int[] a) {


}
}
