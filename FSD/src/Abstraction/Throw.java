package Abstraction;

public class Throw {

	public static void main(String[] args) {
		try {
			checkage(15);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		public static void checkage(int age) {
			if(age<18) {
				throw new IllegalArgumentException("your age is below 18");
			}
			else {
				System.out.println("Age is valid");
			}
		
	}

}
