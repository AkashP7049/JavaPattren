class parent2{
	String name;
	long balance;
	parent2(String name,long balance){
		this.name=name;
		this.balance=balance;
	}
}
class child2 extends parent2{
	String name;
	long balance;
	int PIN;
	child2(String name,long balance, int PIN){
		super(name,balance);
		this.PIN=PIN;
	}
	void disp() {
		System.out.println(name+" "+balance+" "+PIN);
	}
}
public class Test {
	public static void main(String[] args) {
		parent2 p2=new parent2("Akash",1000);
		child2 c2=new child2("Akash",1000,123);
		c2.disp();
	
		
		
	}

}
