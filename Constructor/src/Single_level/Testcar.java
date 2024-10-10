package Single_level;

class vehicle{
	void drive() {
		System.out.println("Driving a car");
	}
}
class car extends vehicle{
	void drive() {
		System.out.println("Reparing a car");
	}
}

public class Testcar {
public static void main(String[] args) {
	car c=new car();
	c.drive();
}
}
