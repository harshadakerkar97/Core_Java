package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTraverse2 {
	public static void main(String[] args) {
		HashMap<String,Object> m =new HashMap<>();
		m.put("rollno",39);
		m.put("name","Harshada");
		m.put("fee",94400.50);
		Set<Entry<String,Object>> s=m.entrySet();
		Iterator<Entry<String,Object>> it=s.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			//it.remove();
//		}
		//System.out.println(m);
		for(Entry<String,Object> e : s) {
			System.out.println(e);
		}
	}
}
