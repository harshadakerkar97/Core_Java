package collection;

import java.util.Comparator;
import java.util.TreeSet;

class Employee3{
	 int empid;
	 String name;
	public Employee3(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "empid = " + empid + 
				", name = " + name + "\n";
	}
}

class EmployeeComparator implements Comparator<Employee3>{
	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		return o1.empid - o2.empid;
	}
}
class EmployeeComparator2 implements Comparator<Employee3>{
	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
		System.out.println("====== sort by id ============");
		TreeSet<Employee3> a1=new TreeSet<Employee3>(new EmployeeComparator());
		a1.add(new Employee3(101,"sharddha"));
		a1.add(new Employee3(103,"pooja"));
		a1.add(new Employee3(102,"monika"));
		a1.add(new Employee3(104,"rupali"));
		a1.add(new Employee3(105,"sharddha"));
		a1.add(new Employee3(101,"pooja"));
		a1.add(new Employee3(102,"monika"));
		a1.add(new Employee3(101,"harshada"));
		System.out.println(a1);
		System.out.println("========= sort by name ===========");
		TreeSet<Employee3> a=new TreeSet<Employee3>(new EmployeeComparator2());
		a.add(new Employee3(101,"sharddha"));
		a.add(new Employee3(103,"pooja"));
		a.add(new Employee3(102,"monika"));
		a.add(new Employee3(104,"rupali"));
		a.add(new Employee3(105,"sharddha"));
		a.add(new Employee3(101,"pooja"));
		a.add(new Employee3(102,"monika"));
		a.add(new Employee3(101,"harshada"));
		System.out.println(a);
	}
}
