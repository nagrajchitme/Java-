package conditinal;

import java.util.Scanner;

public class A {

	public static void main(String[] raj) {
		int age;
		System.out.println("enter your age");
		Scanner a=new Scanner(System.in);
		age=a.nextInt();
		if(age>=18){
			System.out.println("Your eligible for voting");
			System.out.println("you can vote");
		}
		else {
			System.out.println("your not eligible");
		}
	}

}


