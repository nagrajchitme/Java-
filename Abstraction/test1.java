package Abstraction;
abstract class vehical{
	
	 void fule() {
		System.out.println("all vehical use fule to work");
	}
	
	abstract void tire();
	
	abstract void speed();
}
   class thar extends vehical{
	void tire() {
		System.out.println("thar having four tires");
	}
	 void speed(){
		 System.out.println("thar runs 100k/h");
	 }
}
   class tempo extends vehical{
	   void tire() {
			System.out.println("tempo having six tires");
		}
	   void speed() {
			 System.out.println("tempo runs 50k/h");
		 }
   }
public abstract class test1 {

	public static void main(String[] args) {
		thar t1=new thar();
		t1.fule(); t1.tire(); t1.speed();
		tempo t=new tempo();
		t.fule(); t.tire(); t.speed();

	}

}
