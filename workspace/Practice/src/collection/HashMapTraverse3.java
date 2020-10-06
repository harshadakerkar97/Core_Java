package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTraverse3 {
	public static void main(String[] args) {
		HashMap<String,Object> m =new HashMap<>();
		m.put("rollno",39);
		m.put("name","Harshada");
		m.put("fee",94400.50);
		Collection<Object> col=m.values();
		Iterator<Object> it=col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
