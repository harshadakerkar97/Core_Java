package collection;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(20);
		a.add(12);
		a.add(4);
		a.add(8);
		a.add(13);
		a.add(0);
		a.add(16);
		a.add(7);
		a.add(8);
		a.add(12);
		Stream<Integer> strm=a.stream();
		//show the content of stream
		//System.out.println(a.stream());
		//strm=strm.distinct();
		//strm.forEach(ele -> System.out.print(ele+" "));
		//List<Integer> al=strm.collect(Collectors.toList());
		//System.out.println(al);
		
		//to perform any operation on each element of stream
		//System.out.println();
//		Stream<Integer> strm1=a.stream();
//		strm1=strm1.map(n -> n+100);
//		strm1.forEach(p -> System.out.print(p+" "));
//		System.out.println();
//		strm=strm.filter(n -> n%2==0);
//		strm.forEach(p -> System.out.print(p+" "));
		
		Optional<Integer> opt =strm.max(Comparator.comparing(n ->n));
		int i=opt.get();
		System.out.println(i);
		
	}
}
