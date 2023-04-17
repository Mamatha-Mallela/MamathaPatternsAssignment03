package mamathaQuestion17;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] {5, 10, 15, 20});
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
        Integer no = (Integer)itr.next();
        System.out.println(no);
        if (no == 8) {
            list.add(14);
        }
	}
}
}
