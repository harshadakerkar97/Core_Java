package practice;

interface Foo{
	void Foo();
}

interface Bar{
	void a();
	
	
}

class Club implements Foo,Bar{
	public void a() {
		System.out.println("Hello");
	}
	
	public void b() {
		System.out.println("Welcom");
	}

	@Override
	public void Foo() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void Foo() {
//		// TODO Auto-generated method stub
//		
//	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club c1 = new Club();
		c1.a();
	}

}