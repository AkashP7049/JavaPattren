class parent1{
	String name ="parent1";
	void disp() {
		System.out.println(name);
	}
}
class child1 extends parent1{
	void disp1() {
		super.disp();
	}
}
public class SuperClass {
	public static void main(String[] args) {
		child1 c1=new child1();
		c1.disp1();
	}

}
