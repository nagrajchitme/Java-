package input;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		int a ,b ,c;
		System.out.println("enter any number");
		
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("you enterd number="+c);

	}

}
