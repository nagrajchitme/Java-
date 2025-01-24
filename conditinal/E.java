package conditinal;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		String name;
		System.out.println("Enter any name");
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		if(name == "nagraj" ) {
			System.out.println("you enterd currect name");
			
		}else {
			System.out.println("you enterd wrong name");
		}

	}

}
