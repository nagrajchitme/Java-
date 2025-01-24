package threads;


class p extends Thread{
	void name() throws InterruptedException {
		for(int i=1; i<=5; i++) {
		System.out.println("Nagraj");
		Thread.sleep(1000);
	}
}
}
public class R  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		p p1=new p();
		p1.name();

	}

}
