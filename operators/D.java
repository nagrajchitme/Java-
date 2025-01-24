package operators;

import java.util.Scanner;

import Array.B;

public class D {

	public static void main(String[] args) {
		int a,b,c,d,e,f,g,h,i;
		System.out.println("well come to the ATM sir");
		System.out.println("enter your pin");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		
		if(a==0000) {
			System.out.println("well come sir");
			System.out.println(" enterd your account number");
			b=s.nextInt(); 
			if(b==1234){
				System.out.println("your account number matched the with our system");
				System.out.println("1)check your account balance");
				System.out.println("2)check your mobile");
				c=s.nextInt();
				switch(c) {
				case 1:
				System.out.println("12345678");
				
				case 2: 
					System.out.println("9876543210");
				}
				
			}else {
				System.out.println("you enterd wrong account number");
			}
		}else {
			System.out.println("You enterd wrong passward");
			System.out.println("Try again");
			
		}

	}

}

