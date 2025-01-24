package conditinal;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		int i;	
		System.out.println("enter 1 number");
		Scanner c1=new Scanner(System.in);
		i=c1.nextInt();
		for(i=i; i<=10; i++) {
			if(i==3)
				break;
			System.out.println(i);
			
		}

	}

}
