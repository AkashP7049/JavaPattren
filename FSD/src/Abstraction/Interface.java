package Abstraction;
interface Parent12{
	default void eat() {
		System.out.println("Eating....");
	}
}
interface Parent13{
	void sleep();
}
class Child21 implements Parent12{
  public	void eat() {
	  System.out.println("Eating");
}
  
	  
  

}
	
public class Interface {
	public static void main(String[] args) {
		Child21 c=new Child21();
		c.eat();
		
	}

}

