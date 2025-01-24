package polimorphizm;

public class A {
	public void add() {
		int a,b,c ;
		a=20; b=20; c=a+b;
		System.out.println(c);
	}
	public void add(int x, int y) {
		double z=x-y;
		System.out.println(z);
	}
	public void add(String a ,String b) {
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		A a1=new A();
		a1.add(); a1.add(20,10); a1.add("abhi","chukki");
		// TODO Auto-generated method stub

	}

}
