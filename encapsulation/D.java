package encapsulation;

import java.util.Scanner;

class store{
	int pwd;
	public void mobile() {
		System.out.println("enter your passward");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==12345) {
			System.out.println("samsung");
			System.out.println("apple");
			System.out.println("one plus");
		}else {
			System.out.println("invalid passward");
		}
	}
	public void purchase() {
		System.out.println("enter your passward");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==12345) {
			System.out.println("earphone");
			System.out.println("Bluetooth");
			System.out.println("watch");
		}else {
			System.out.println("invalid passward");
		}
	}
}
public class D {

	public static void main(String[] args) {
		store s2=new store();
		int ch;
		System.out.println("enter your choice");
		System.out.println("1 mobile");
		System.out.println("2 purchase");
		Scanner s1=new Scanner(System.in);
		ch=s1.nextInt();
		switch(ch) {
		case 1:s2.mobile();
		break;
		case 2:s2.purchase();
		break;
		default:{
			System.out.println("invalid choice....");
		}
		}

	}

}
