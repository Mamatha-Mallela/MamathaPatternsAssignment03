package mamathaQuestion17;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastIteratorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> stateCode = new HashMap<String, String>();
		stateCode.put("Missouri", "MO");
		stateCode.put("California", "CA");
		stateCode.put("Texas", "TX");

		Iterator<String> itr = stateCode.keySet().iterator();

		while (itr.hasNext()) {
			System.out.println(stateCode.get(itr.next()));
			stateCode.put("Kansas", "KS");
		}
	}

}
