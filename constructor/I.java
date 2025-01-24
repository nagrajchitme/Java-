package constructor;	
	class water{ //copy constructor
		int a;
		String b;
		water(){
			a=20;
			b ="kinly";
		}
		water(water ref){
			a=ref.a;
			b=ref.b;
			System.out.println(a+" "+b);
		}
		void detail() {
			System.out.println(a+" "+b);
		}
	}

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		water w=new water();
		water w2=new water(w);
		w2.detail();

	}

}
