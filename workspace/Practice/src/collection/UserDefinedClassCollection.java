package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

class Employee{
	private int empid;
	private String name;
	
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return empid%10;
	}
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof Employee) {
			Employee e=(Employee)obj;
//			return (name.equals(e.name));
			return empid==e.empid;
		}
		return false;
	}

	@Override
	public String toString() {
		return "empid = " + empid + ", name = " + name;
	}
	
}

public class UserDefinedClassCollection {
	public static void main(String[] args) {
		ArrayList<Employee> a=new ArrayList<Employee>();
		a.add(new Employee(101,"sharddha"));
		a.add(new Employee(103,"pooja"));
		a.add(new Employee(102,"monika"));
		a.add(new Employee(104,"rupali"));
		a.add(new Employee(105,"sharddha"));
		a.add(new Employee(101,"pooja"));
		a.add(new Employee(102,"monika"));
//		for(Employee e:a) {
//			System.out.println(e);
//		}
		HashSet <Employee> s=new HashSet<Employee>();
		s.add(new Employee(101,"sharddha"));
		s.add(new Employee(102,"monika"));
		s.add(new Employee(103,"pooja"));
		s.add(new Employee(104,"rupali"));
		s.add(new Employee(105,"sharddha"));
		s.add(new Employee(101,"pooja"));
		s.add(new Employee(102,"monika"));
		s.add(new Employee(102,"monika"));
		s.add(new Employee(103,"monika"));
		for(Employee e:s) {
			System.out.println(e);
		}
		System.out.println("======================");
		HashSet<Employee> l=new LinkedHashSet<Employee>();
		l.add(new Employee(101,"sharddha"));
		l.add(new Employee(102,"monika"));
		l.add(new Employee(103,"pooja"));
		l.add(new Employee(104,"rupali"));
		l.add(new Employee(105,"sharddha"));
		l.add(new Employee(101,"pooja"));
		l.add(new Employee(102,"monika"));
		l.add(new Employee(102,"monika"));
		l.add(new Employee(103,"monika"));
		for(Employee e:l) {
			System.out.println(e);
		}
	}

}
