package classandobject;

public class B {
	int age=22;
	int high=170;
	String name="abhi";
	void detail() {
		System.out.println("he is a healthy person");
	}
	void sleep() {
		System.out.println("sleeping");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		System.out.println(b.age);
		System.out.println(b.high);
		System.out.println(b.name);
		b.detail();
		b.sleep();

	}

}
