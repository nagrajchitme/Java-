package conditinal;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		int i;
		System.out.println("enter any number");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		if(i==10) {
			System.out.println("you enterd "+i);
			if(i>=10 ) {System.out.println("abhi");
			}else{
				System.out.println("nagraj");
			}
		}else {
			System.out.println("chukki");
		}
//		for( i=1; i<=10; i++){
//			if(i==5)
//				continue;
//			System.out.println(i);
//		}
	}
}

