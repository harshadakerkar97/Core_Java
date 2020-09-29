package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		Set a=new HashSet();
		a.add("ram");
		a.add("sita");
		a.add("laxman");
		a.add("ram");
		a.add("hanuman");
		a.add(123);
		System.out.println(a);
		System.out.println("===============");
		Set b=new LinkedHashSet();
		b.add("ram");
		b.add("sita");
		b.add("laxman");
		b.add("ram");
		b.add("hanuman");
		b.add(123);
		System.out.println(b);
		Set c=new TreeSet();
		c.add("ram");
		c.add("sita");
		c.add("laxman");
		c.add("ram");
		c.add("hanuman");
//		c.add(123456);		same type of data can be stored in tree set
		System.out.println(c);
		
	}
}
