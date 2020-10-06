package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTraverse {
	public static void main(String[] args) {
		HashMap<String,Object> m =new HashMap<>();
		m.put("rollno",39);
		m.put("name","Harshada");
		m.put("fee",94400.50);
		//m.put(null,123);
		Set<String>keys=m.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
