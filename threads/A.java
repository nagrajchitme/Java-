package threads;
 class B extends Thread{
	void show() throws InterruptedException {
		for(int i=1; i<=5; i++) {
			System.out.println("Raj chukki abhi");
			Thread.sleep(2000);
			
		}
	}
}

 public class A {

	public static void main(String[] args)throws InterruptedException  {
		B a1=new B();
		a1.show();
		for(int i=1; i<=5; i++) {
			System.out.println("Pallavi");
			Thread.sleep(1000);
		}

	}

}
