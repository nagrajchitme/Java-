package conditinal;

import java.util.Scanner;

public class H {
	public static void main(String []Raj) {
		int i;
		
		System.out.println();
		Scanner c2=new Scanner(System.in);
		i=c2.nextInt();
		
			for(i=i; i<=10;i++) {
				if(i==5)
					continue;
				System.out.println(i);
			
		}
	}

}
