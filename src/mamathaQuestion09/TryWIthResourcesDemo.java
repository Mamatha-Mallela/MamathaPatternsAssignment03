package mamathaQuestion09;

import java.io.FileOutputStream;

public class TryWIthResourcesDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fos = new FileOutputStream("demo.txt")) {
			String text = "Example for Try with resources";
			byte arr[] = text.getBytes();
			fos.write(arr);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Resource are closed and message has been written into the demo.txt");
	}
}
