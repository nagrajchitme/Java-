package constructor;	
	class m{
		int a; String b;
		m(){
			a=10;
			b="pen";
		}
		m(m ref){
			a=ref.a;
			b=ref.b;
			System.out.println(a+" "+b);
		}
		void show() {
			System.out.println(a+" "+b);
		}
	}

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m m1=new m();
		m m2=new m(m1);
		m1.show();

	}

}
