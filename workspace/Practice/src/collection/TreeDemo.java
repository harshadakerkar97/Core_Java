package collection;

import java.util.TreeSet;

class Employee2 implements Comparable<Employee2>{
	private int empid;
	private String name;
	public Employee2(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid = " + empid + 
				", name = " + name + "]\n";
	}
	@Override
	public int compareTo(Employee2 o) {
		// TODO Auto-generated method stub
		return empid - o.empid;
	}
	
}

public class TreeDemo {
	public static void main(String[] args) {
		TreeSet<Employee2> a=new TreeSet<Employee2>();
		a.add(new Employee2(101,"sharddha"));
		a.add(new Employee2(103,"pooja"));
		a.add(new Employee2(102,"monika"));
		a.add(new Employee2(104,"rupali"));
		a.add(new Employee2(105,"sharddha"));
		a.add(new Employee2(101,"pooja"));
		a.add(new Employee2(102,"monika"));
		System.out.println(a);
	}
}
