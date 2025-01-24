package operators;
public class E { //relational operator
	public static void main(String[] args) {
		int a,b;
		a=10;
		b=20;
		System.out.println(a==b);    //false  10 equal to 20 
		System.out.println(a!=b);    //true   10 not equal to 20
		System.out.println(a<b);     //true   10 less then 20
		System.out.println(a>b);     //false  10 greater then 20
		System.out.println(a>=b);    //false  10 grater then or equal to 20
		System.out.println(a<=b);    //true   20 grater then or equal to 10
	}
}
