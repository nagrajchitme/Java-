package operators;
import java.util.Scanner;
public class C 
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		System.out.println("enter any two number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		d=s.nextInt();
		switch(d) {
		case 1:c=a+b;
		System.out.println("addition:"+c);
		break;
		case 2:c=a-b;
		System.out.println("substraction:"+c);
		break;
		case 3:c=a*b;
		System.out.println("multiplication:"+c);
		break;
		case 4:c=a/b;
		System.out.println("division:"+c);
		break;
		default:
		System.out.println("invad input");
		}
	}
}
