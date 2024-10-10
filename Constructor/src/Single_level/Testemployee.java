package Single_level;
import java.util.Scanner;

class Person{
	String Firstname;
	String Lastname;
	void disp() {
		System.out.println("the Fistname is"+Firstname);
		System.out.println("the Lastname is"+Lastname);
	}
}
class Employee extends Person{
	int id;
	String title;
	void disp() {
		System.out.println(" the Employee id"+id);
		System.out.println("Employee jobs titles"+title);
	}
	
}
public class Testemployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name");
		String Firstname=sc.nextLine();
	    System.out.println("Enter last name");
		String Lastname=sc.nextLine();
		System.out.println("Enter employee id");
		int id=sc.nextInt();
		System.out.println("Enter employee title");
		String title=sc.nextLine();
		Person p1=new Person();
		Employee e1=new Employee();
		p1.disp();
		e1.disp();
		
		
	}

	
	}



