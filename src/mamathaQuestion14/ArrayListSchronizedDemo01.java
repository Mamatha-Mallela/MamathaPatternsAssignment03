package mamathaQuestion14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSchronizedDemo01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("Car");
		list.add("Bicycle");
		list.add("Truck");
		synchronized(list){
			Iterator<String> itr = list.iterator();
			while (itr.hasNext())
		    System.out.println(itr.next());
		}
	}
}
