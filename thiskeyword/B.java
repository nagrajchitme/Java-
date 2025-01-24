package thiskeyword;

public class B {
	B(){
	System.out.println("hello world");	
	}
	B(int a,String b){
		this();
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B(100,"raj");
		

	}

}
