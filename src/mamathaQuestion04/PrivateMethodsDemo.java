package mamathaQuestion04;

public class PrivateMethodsDemo extends Parent{
	private void display() {
    System.out.println("This is a Sub class");
 }
 public static void main(String[] args) {
    Parent obj = new PrivateMethodsDemo();
    obj.display();
 }
}

class Parent {
	private void display() {
		System.out.println("This is Parent action");
	}
}
