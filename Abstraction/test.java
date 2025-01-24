package Abstraction;
abstract class animal{
	void legs() {
		System.out.println("animals have four legs");
	}
	abstract void eat();
	
	abstract void sound();

	abstract void play();
}
class dog extends animal{
	void eat() {
		super.legs();
		System.out.println("dog eat meet");
	}
	void sound() {
		System.out.println("bow bow");
	}
	void play() {
		System.out.println("dog plays");
	}
}
class cow extends animal{
	void eat() {
		super.legs();
		System.out.println("cow eat grass");
	}
	void sound() {
		System.out.println("cow sounds");
	}
	void play() {
		System.out.println("cow plays");
	}
}

public abstract class test {

	public static void main(String[] args) {
		cow c1=new cow();
		dog d1=new dog();
		c1.eat(); c1.sound(); c1.play();
		d1.eat(); d1.sound(); d1.play();
	}

}
