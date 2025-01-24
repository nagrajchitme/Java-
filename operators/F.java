package operators;
public class F {//logical operator
	public static void main(String[] args) {
		int a,b;
		a=10;
		b=20;
		System.out.println(a==b && a!=b);   //false
		System.out.println(a==b || a!=b);   //true
		System.out.println(!(a>b));         //true
	}
}
