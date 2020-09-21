class Demo{
	private int id;
	private String name;
	Demo(int id){
		this.id=id;
		System.out.println("Id constructor");
	}
	Demo(int id ,String name){
		this(id);	//this construct should be on 
					//first line of constructor
		this.name=name;
		System.out.println("name constructor");
	}
	void getId(){
		System.out.println("Id : "+id);
	}
	void show(){
		this.getId();
		System.out.println("Name : "+name);
	}
}



class ThisDemo{
	public static void main(String args[]){
		Demo d=new Demo(39,"Harshada kerkar");
		d.show();
	}
}