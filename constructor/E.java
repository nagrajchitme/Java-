package constructor;
class mobile{
	String a ,b ,c , d;
	mobile(){
		this.a="apple";
		this.b="samsung";
		this.c="one plus";
		this.d="oppo";
	}
	public void brand() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	
}

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobile m1=new mobile();
		m1.brand();
	}

}
