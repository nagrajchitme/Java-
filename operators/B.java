package operators;
import java.util.Scanner;
public class B 
{
	public static void main(String[] args) 
	{
		int a ,b ,c ,d;
		System.out.println("enter any two number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();		
		System.out.println("enter your choice");
		System.out.println("1:Adition");
		System.out.println("2:substraction");
		System.out.println("3:multiplication");
		System.out.println("4:division");
		
		
		d=s.nextInt();
		switch(d)
		{
				case 1:c=a+b;
				System.out.println("addition: "+c+";");
				break;
				case 2:c=a-b;
				System.out.println("substraction: "+c+";");
					break;
				case 3:c=a*b;
				System.out.println("multiplication: "+c+";");
					break;
				case 4:c=a/b;
				System.out.println("division: "+c+";");
					break;
				default:
					System.out.println("invalid input");
		}

	}

}
