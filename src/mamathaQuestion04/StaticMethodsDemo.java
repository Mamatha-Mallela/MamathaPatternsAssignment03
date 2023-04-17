package mamathaQuestion04;
public class StaticMethodsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new A();
		b.display();
		b.print();
	}
}
class B {
	public static void display() {
		System.out.println("Static or class method from B");
	}
	public void print() {
		System.out.println("Non-static or Instance method from B");
	}
}
class A extends B {
	public static void display() {
		System.out.println("Static or class method from A");
	}

	public void print() {
		System.out.println("Non-static or Instance method from A");
	}
}
