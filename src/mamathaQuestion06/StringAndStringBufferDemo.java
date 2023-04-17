package mamathaQuestion06;

public class StringAndStringBufferDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		concat1(s);
		System.out.println("String: " + s);
		StringBuffer sb = new StringBuffer("Welcome");
		concat2(sb);
		System.out.println("StringBuffer: " + sb);
	}

	public static void concat1(String s) {
		s = s + "World";
	}

	public static void concat2(StringBuffer sb) {
		sb.append(" to Northwest");
	}
}
