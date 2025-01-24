package javacollection;

import java.util.ArrayList;

public class Arraylinklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<String>();
		name.add("Nagraj");
		name.add("chukki");
		name.add("abhi");
		System.out.println(name);
		name.addFirst("munnya");
		System.out.println(name);
		name.removeFirst();
		System.out.println(name);
		name.removeLast();
		System.out.println(name);
		name.remove(0);
		System.out.println(name);
		name.clear();
		System.out.println(name);

	}

}
