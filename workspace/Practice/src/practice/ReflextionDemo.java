package practice;

class Emp{
	private int id;
	private String name;
	Emp(){
		
	}
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setData(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
}


public class ReflextionDemo {
	public static void main(String[] args) throws InstantiationException, ClassNotFoundException, IllegalAccessException{
		Class ref=Class.forName("practice.Emp");
		Emp e=(Emp)ref.newInstance();
		e.setData(101, "abc");
		System.out.println(e);
		//Method m[]args=ref.getDeclareMethods();
		
	}
}
