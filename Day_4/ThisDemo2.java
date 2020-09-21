class TDemo2{
	private int rollno;
	private String name;
	private int age;
	TDemo2(){
		System.out.println("Zero parameterized constructor.");
	}
	TDemo2(int rollno){
		this();
		this.rollno=rollno;
		System.out.println("One parameterized constructor.");
	}
	TDemo2(int rollno,String name,int age){
		this(rollno);
		this.name=name;
		this.age=age;
		System.out.println("3 parameterized constructor.");
	}
	void display(){
		System.out.println("Roll no : "+rollno+
		"\nName : "+name+"\nAge : "+age);
	}
	
}

class ThisDemo2{
	public static void main(String args[]){
		TDemo2 t=new TDemo2(101,"Alexander",25);
		System.out.println("========================");
		t.display();
	}
}