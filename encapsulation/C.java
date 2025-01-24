package encapsulation;
//
//import java.util.Scanner;
//
//class canaraBank {
//	private int Balance=5000;
//	private int pwd;
//	
//	public void Deposit(int money) {
//		System.out.print("Password :");
//		Scanner sc=new Scanner(System.in);
//		pwd=sc.nextInt();
//		if(pwd==122334) {
//			Balance=Balance+money;
//			System.out.println("Deposit :"+money);
//			System.out.println("Total Balance :"+Balance);
//			
//		}else {
//			System.out.println("Incorrect Password....");
//		}
//	}
//	public void Withdraw(int money) {
//			System.out.print("Password :");
//			Scanner sc=new Scanner(System.in);
//			pwd=sc.nextInt();
//			if(pwd==122334) {
//				Balance=Balance-money;
//				System.out.println("withdraw :"+money);
//				System.out.println("Total Balance :"+Balance);
//			}else {
//			System.out.println("Incorrect Password....");
//		}
//	}
//	public void CheckBalance() {
//		System.out.print("Password :");
//		Scanner sc=new Scanner(System.in);
//		pwd=sc.nextInt();
//		if(pwd==122334) {
//			System.out.println("Total Balance :"+Balance);
//		}else {
//		System.out.println("Incorrect Password....");
//	}
//	}
//}
//
//public class C {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("well come to canara bank");
//		canaraBank b1=new canaraBank();
//		int ch;
//		
//		System.out.println("1.Deposit");
//		System.out.println("2.Withdraw");
//		System.out.println("3.CheckBalance");
//		Scanner s2=new Scanner(System.in);
//		ch=s2.nextInt();
//		
//		switch(ch){
//		case 1:b1.Diposite(1000);
//		break;
//		case 2:b1.Withdraw(1000);
//		break;
//		case 3:b1.CheckBalance();
//		break;
//		default: 
//			System.out.println("Incorrect choice...");		
//			
//			
//		}
//	}
//
//}

import java.util.Arrays;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		int []student=new int[10];
		System.out.println("enter student number");
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0; i<10; i++) {
			student[i]=sc.nextInt();
		}Arrays.sort(student);
		for(int s :student) {
			System.out.println(s);
		}
		
	}
}


