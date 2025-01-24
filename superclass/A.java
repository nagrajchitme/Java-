package superclass;
class p{
	String a;
	String b;
	p(){
	
		a="♾️";
		b="girl";
		
	}
}
class n extends p{
	String c="♾️";
	String d="boy";
	
}
class love extends n{
	
	String l="made for each other";
	
	void show() {
		System.out.println(l);
		System.out.println("Name:"+b+"❤️"+d);
		System.out.println("age:"+a+","+c);
		
		
		
	}
}

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		love p=new love();
		p.show();
		

	}

}
