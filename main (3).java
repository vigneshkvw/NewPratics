package calculator;

import java.util.Scanner;

public class main {
	
public static void main(String [] args) {
	int num1,num2;
	Scanner A=new Scanner(System.in);
	System.out.println("1:addition.\t2.substraction\t3.multipication\t4.divide");
	int ch=A.nextInt();
	switch (ch) {
	case 1:
		 num1=A.nextInt();
		 num2=A.nextInt();
System.out.println(num1+num2);
		break;
	case 2:
		 num1=A.nextInt();
		 num2=A.nextInt();
System.out.println(num1-num2);
		break;
	case 3:
		 num1=A.nextInt();
		 num2=A.nextInt();
System.out.println(num1*num2);
		break;
	case 4:
		 num1=A.nextInt();
		 num2=A.nextInt();
System.out.println(num1%num2);
		break;
	default:
		break;
	}
}
}