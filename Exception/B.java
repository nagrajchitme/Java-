package Exception;
import java.io.*;

public class B {

	public static void main(String[] args) {
		int x  ,y ,z;
		x=20; y=40; z=x/y;
		try{
			System.out.println(z);
		}
		catch(ArithmeticException e) {
			System.out.println("we handeld exceptin");
		}
		System.out.println("hello world");
	}

}
