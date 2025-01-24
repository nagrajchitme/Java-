package encapsulation;
import java.util.Scanner;

class canara{
	private double bal=5000;
	private int pwd;
	
	public void Deposite(double money) {
		System.out.print("Enter your passward:");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234){
			bal=bal+money;
			System.out.println("Deposited money :"+money);
			System.out.println("Total Balance :"+bal);
		}
		else {
			System.out.println("Incurrect passward");
		}
				}
	public void Withdraw(double money){
		System.out.print("Enter your passward:");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234){
			bal=bal-money;
			System.out.println("Withdraw money :"+money);
			System.out.println("Total Balance :"+bal);
		}
		else {
			System.out.println("Incurrect passward");
		}
		
	}
	public void checkBal() {
		System.out.print("Enter your passward:");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234){
			System.out.println("Total Balance :"+bal);
		}
		else {
			System.out.println("Incurrect passward");
		}
		
	}
	
}

public class B {
	public static void main(String[] Raj) {
		canara a1=new canara();
		int ch;
		System.out.println("1. Deposite:");
		System.out.println("2. Withdraw:");
		System.out.println("3. CheckBalance:");
		System.out.print("Enter your choice :");
		Scanner sc=new Scanner(System.in);
		
          ch=sc.nextInt();
		
		switch(ch){
		case 1: a1.Deposite(1000);
		break;
		case 2:a1.Withdraw(2000);
		break;
		case 3:a1.checkBal();
		break;
		default : System.out.println();
		}

	}

}
