package constructor;
	
class tempo{	//Parameterized
	int x;
	int y;
	tempo(int a,int b){
		x=a;
		y=b;
	}
	tempo(int a,String b){
//		a=10;
//		b="ring";
		System.out.println(a+" "+b);
	}
	void mobile() {
		System.out.println(x+" "+y);
	}
	
}
public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tempo a1=new tempo(100,200);
		tempo a2=new tempo(300,"pencile");
		a1.mobile();
	}

}
