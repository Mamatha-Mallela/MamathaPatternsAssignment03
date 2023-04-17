package mamathaQuestion15;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
public class HashTableAndHashMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(1,"Aishwarya");
        ht.put(2,"Mallela");
        ht.put(3,"Gautam");
        ht.put(4,"Mallela");
        System.out.println("************Hash table************");
        for (Entry<Integer, String> m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(10,"Krishna");
        hm.put(9,"Suneetha"); 
        hm.put(8,"Dindi");
        hm.put(7,"Ma");
        System.out.println("************Hash map************");
        for (Entry<Integer, String> m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
	}
}
