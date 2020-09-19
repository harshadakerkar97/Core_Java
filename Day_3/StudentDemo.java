class Student{
	private int rollNo;
	private String name;
	public void setData(int rn,String n){
		rollNo=rn;
		name=n;
	} 
	public void showData(){
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
	}
}

class StudentDemo{
	public static void main(String args[]){
		Student s=new Student();
		s.setData(39,"Harshada");
		s.showData();
		System.out.println("===================");
		Student s1=new Student();
		s1.setData(94,"Rupali");
		s1.showData();
		System.out.println("=====================");
	
	}
}