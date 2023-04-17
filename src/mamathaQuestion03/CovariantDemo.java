package mamathaQuestion03;

public class CovariantDemo extends SuperClass {
	CovariantDemo get() {
		System.out.println("From SubClass");
		return this;
	}

	public static void main(String[] args) {
		SuperClass sp = new CovariantDemo();
		sp.get();
	}

}

class SuperClass {
	SuperClass get() {
		System.out.println("From SuperClass");
		return this;
	}
}