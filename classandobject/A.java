package classandobject;

 class A {
	 int age=30;
	 int weight=60;
	 String name="abcd";
	 void eat(){
		 System.out.println("eating");
	 }
	 void sleep() {
		 System.out.println("sleeping");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		System.out.println(a1.age);
		System.out.println(a1.weight);
		System.out.println(a1.name);
		
		a1.sleep();
		a1.eat();

	}

}
