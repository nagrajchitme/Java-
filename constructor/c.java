package constructor;
 class pen{
	 String color;
	 String type;
	 public void write() {
		 System.out.println("writng");
	 }
 }

public class c {

	public static void main(String[] args) {
		pen pen1=new pen();
		pen1.color="red";
		pen1.type="bolpen";
		pen1.write();


	}

}
