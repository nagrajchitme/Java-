package thiskeyword;

public class A {
	A(){
		System.out.println("hello");
	}
	A(int a){
		this();
		System.out.println(a);
	}
	public static void main(String[] args) {
		A a1=new A(100);
	}

}
