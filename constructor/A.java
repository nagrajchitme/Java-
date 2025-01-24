package constructor;
 class Animal{
		 int a;
		 String b;
	 Animal(){
		this.a=10;
		this.b="Raj";
	 }
		 
		public void show(){
		 System.out.println(this.a+""+this.b);
	 }
	 public class A{
		 public static void main(String []args){
			 Animal a2=new Animal();
			 a2.show();
		 }
	 }
	 
 }
		
