package constructor;

class matchine{
		String a;
		String b;
	 matchine(){
		 this.a="if u start then it will rotate";
		 this.b="if u stop then it will not rotate";
	 }
	 public void show(){
		 System.out.println(this.a+""+this.b);
	 }

public class B {

	public static void main(String[] args) {
		matchine m1=new matchine();
		m1.show();
	}

}
}
