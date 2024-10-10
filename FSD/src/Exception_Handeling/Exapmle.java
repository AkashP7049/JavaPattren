package Exception_Handeling;

public class Exapmle {
	public static void main(String[] args) {
	int a=10;
    int b=0;
    try{
        int c=a/b;
    }
    catch(ArithmeticException e){
    System.out.println("Tried to divide by zero");
    }
	 System.out.println("Start multiplication");
     int x=10;
     int y=0;
     System.out.println(x*y);

	}
}
