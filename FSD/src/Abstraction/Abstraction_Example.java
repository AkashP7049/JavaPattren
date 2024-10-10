package Abstraction;


 abstract class parent1{
	 void eat() {
		 System.out.println("Eating");
	 }
	 
}
 abstract class parent2{
	 abstract void sleep();
	 }
 class child1 extends parent1{
	 
 }
 
	 
public  class Abstraction_Example{
	public static void main(String[] args) {
		child1 c=new child1();
		c.eat();
	}

}
