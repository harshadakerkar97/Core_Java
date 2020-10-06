package collection;

import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String,Object> m =new HashMap<>();
		m.put("rollno",39);
		m.put("name","Harshada");
		m.put("fee",94400.50);
		m.put(null,123);
		System.out.println(m);
		Object o=m.get("name");
		System.out.println(o);
	}
}
