package Array;
import java.util.Scanner;
public class C {
	public static void main(String[] args) 
	{
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int []number=new int[4];
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();		
			number[0]=a;
			number[1]=b;
			number[2]=c;			
			System.out.println(a+""+b+""+c);
	}
}
