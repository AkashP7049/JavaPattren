package Constructor;

class Animal1
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
class Tiger1 extends Animal1
{
	
}
class Cow1 extends Animal1
{
	
}
public class Main {
public static void main(String[] args) {
	Animal1 a=new Animal1();
	System.out.println(a.legs);
	System.out.println(a.eyes);
	a.eat();
	a.walk();
	a.sleep();
	
	Tiger1 t=new Tiger1();
	System.out.println(t.legs);
	System.out.println(t.eyes);
	t.eat();
	t.walk();
	t.sleep();
	
	
	Cow1 c=new Cow1();
	System.out.println(c.legs);
	System.out.println(c.eyes);
	c.eat();
	c.walk();
	c.sleep();
	
}
}

