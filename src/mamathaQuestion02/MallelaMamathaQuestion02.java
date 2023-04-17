package mamathaQuestion02;

public class MallelaMamathaQuestion02 extends SubClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallelaMamathaQuestion02 mm = new MallelaMamathaQuestion02();
		mm.displayMethod();
	}
	public void displayMethod()
    {
        System.out.println("Welcome to super class program.");
    }
}

class SubClass {
    private void displayMethod()
    {
        System.out.println("Welcome to sub class program.");
    }
}
