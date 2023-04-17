package mamathaQuestion12;

public class FinalizeDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeDemo fd = new FinalizeDemo();
		System.out.println("Hashcode is: " + fd.hashCode());
		fd = null;
		System.gc();
		System.out.println("End of the garbage collection");
	}

	protected void finalize() {
		System.out.println("Called the finalize() method");
	}
}
