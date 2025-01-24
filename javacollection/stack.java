package javacollection;

import java.util.Stack;

public class stack {       //FIFO//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> name=new Stack();
		name.push("nagraj");
		name.push("chukki");
		name.push("abhi");
		System.out.println(name);
		name.pop();
		System.out.println(name);

	}

}
