package conditinal;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		int num;
		String a;
		System.out.println("Enter any number");
		System.out.println("Enter any name");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		Scanner b=new Scanner(System.in);
		a=b.nextLine();
		{
		System.out.println(a);
		}
		if(num%2==0){
			
			System.out.print("even number");
		}else {
			System.out.println("odd number");
		}
			
		}
	}


