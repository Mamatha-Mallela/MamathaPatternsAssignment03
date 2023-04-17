package mamathaQuestion13;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class VectorAndArrayListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Bike");
		al.add("Car");
		al.add("Scooty");
		al.add("Aeroplane");
		System.out.println("ArrayList elements are:");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		Vector<String> v = new Vector<String>();
		v.addElement("Blue");
		v.addElement("White");
		v.addElement("Black");

		System.out.println("Vector elements are:");
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}
