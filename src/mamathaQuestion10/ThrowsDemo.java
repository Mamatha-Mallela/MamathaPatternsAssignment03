package mamathaQuestion10;

import java.io.FileNotFoundException;

public class ThrowsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo td = new ThrowsDemo();
		td.demoMethod();
	}

	public void demoMethod() {
		System.out.println("Method of Subclass");
	}

}

abstract class SuperClass {
	public void demoMethod() throws FileNotFoundException {
		System.out.println("Method of superclass");
	}
}