package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection a=new ArrayList();
		a.add("monika");
		a.add("shraddha");
		a.add("rupali");
		a.add("pooja");
//		a.add(123456);
		ArrayList <String>a1=new ArrayList<String>();
		a1.add("rupali");
		a1.add("pooja");
		a1.add("extra");
		a1.addAll(a);
//		System.out.println(a);
//		System.out.println(a1);
//		a1.removeAll(a);
//		System.out.println(a1);
//		for(Object o:a1) {
//			System.out.println(o);
//		}
//		
		
		Iterator it=a1.iterator();
		while(it.hasNext()) {
			it.remove();
			System.out.print(it.next()+" ");
			
		}
		System.out.println("\n");
//		System.out.println(a1);
		System.out.println("ok");
		
	}
}
