interface Pet{
	String getName();
	void setName(String name);
	void play();
}

abstract class Animal{
	protected int leg;
	protected Animal(){
		
	}
	protected Animal(int leg){
		this.leg=leg;
	}
	abstract void eat();
	void walk(){
		System.out.println("Can walk with "+leg+" legs");
	}
}
class Cat extends Animal implements Pet{
	String name;
	Cat(){
		
	}
	Cat(String name,int leg){
		super(leg);
		this.name=name;
	}
	public void eat(){
		System.out.println("Cat eating");
	}
	public void play(){
		System.out.println("Cat plyaing ");
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
}
class Dog extends Animal{
	Dog(){
		
	}
	Dog(int leg){
		super(leg);
	}
	void eat(){
		System.out.println("Dog eats.....");
	}
}

class AbstractDemo{
	public static void main(String args[]){
		Dog d=new Dog(4);
		d.eat();
		d.walk();
		Cat c=new Cat("Mittya",4);
		c.eat();
		c.walk();
		c.setName("Mini");
		System.out.println(c.getName());
		
	}
}