package constructor;

class B{  // this is default constructor we can define the value other wise it will define it self 
	int a;
	String b;
	boolean c;
	B(){
		a=10;
		b="null";
		c=false;
		}
	void show() {
		System.out.println(a+" "+b+" "+c);
	}
}

public class A1 {

	public static void main(String[] args) {
		B b=new B();
		b.show();


	}

}
