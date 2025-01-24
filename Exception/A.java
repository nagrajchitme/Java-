package Exception;
import java.io.*;

public class A {

	public static void main(String[] args) {
		int a,b,c;
		a=10; b=20; c=a/b;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("hello world");
		}
	}

}
