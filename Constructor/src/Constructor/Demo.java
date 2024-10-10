package Constructor;
class Animal
{
	int legs=4;
	int eyes=2;
}
class Tiger extends Animal
{
	
}
class Cow extends Animal
{
	
}
public class Demo {
public static void main(String[] args) {
	Animal a=new Animal();
	System.out.println(a.legs);
	System.out.println(a.eyes);
	
	Tiger t=new Tiger();
	System.out.println(t.legs);
	System.out.println(t.eyes);
	
	Cow c=new Cow();
	System.out.println(c.legs);
	System.out.println(c.eyes);
}
}

