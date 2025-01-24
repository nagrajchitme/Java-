package javacollection;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> student=new LinkedList<>();
		student.add("nagraj");
		student.add("chukki");
		student.add("abhi");
		
		System.out.println(student);
		student.addFirst("raj");
		System.out.println(student);
		student.addLast("munnya");
		System.out.println(student);
		student.remove();
		System.out.println(student);
	}

}
