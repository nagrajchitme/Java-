package javacollection;

import java.util.ArrayList;


public class Arraylist  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<String>();
		name.add("nagraj");
		name.add("chukki");
		name.add("abhi");
		
		System.out.println(name);
		name.add(0,"raj");
		System.out.println(name);
		name.remove(1);
		System.out.println(name);
		name.clear();
		System.out.println(name);
		
		
	}

}
