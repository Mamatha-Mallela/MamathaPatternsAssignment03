package mamathaQuestion14;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSchronizedDemo02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> asd = new CopyOnWriteArrayList<String>();
		asd.add("Apple");
		asd.add("Banana");
		asd.add("Pineapple");

		System.out.println("Elements of synchronized ArrayList :");

		Iterator<String> itr = asd.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
