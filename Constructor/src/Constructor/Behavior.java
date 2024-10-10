package Constructor;

class Animal2
{
	int legs=4;
	int eyes=2;
	void eat()
	{
		System.out.println("Animals are Eating");
	}
	void walk()
	{
		System.out.println("Animals aare walking");
	}
	void sleep()
	{
		System.out.println("Animals are sleeping");
	}
	
}
class Tiger2 extends Animal2
{
	void eat()
	{
		System.out.println("Tiger is Eating");
		
	}
	void walk()
	{
		System.out.println("Tiger is Walking");
	}
	void sleep()
	{
		System.out.println("Tiger is Sleeping");
	}
	void run()
	{
		System.out.println("Tiger is running");
	}
}
class Cow2 extends Animal2
{
	void eat()
	{
		System.out.println("Cow are Eating");
	}
	void walk()
	{
		System.out.println("Cow aare walking");
	}
	void sleep()
	{
		System.out.println("Cow are sleeping");
	}
	 void run() {
		System.out.println("Cow is Running");
		
	}
	
}
public class Behavior {
public static void main(String[] args) {
	Animal2 a=new Animal2();
	System.out.println(a.legs);
	System.out.println(a.eyes);
	a.eat();
	a.walk();
	a.sleep();
	
	Tiger2 t=new Tiger2();
	System.out.println(t.legs);
	System.out.println(t.eyes);
	t.eat();
	t.walk();
	t.sleep();
	t.run();
	
	
	Cow2 c=new Cow2();
	System.out.println(c.legs);
	System.out.println(c.eyes);
	c.eat();
	c.walk();
	c.sleep();
	c.run();
	
}
}
