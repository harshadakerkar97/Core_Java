class Person{
	private int age;
	private String name;
	Person(){
		this.age=18;
	}
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	void display(){
		System.out.println("Name : "+name+
				"\nAge : "+age);
	}
}
class PersonDemo{
	public static void main(String args[]){
		Person p=new Person();
		System.out.println("Default age ");
		p.display();
		System.out.println("Given properties of person : ");
		Person p1=new Person(24,"Pooja");
		p1.display();
	}
}