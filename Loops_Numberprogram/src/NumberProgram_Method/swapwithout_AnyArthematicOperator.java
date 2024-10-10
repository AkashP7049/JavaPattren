package NumberProgram_Method;
import java.util.Scanner;
public class swapwithout_AnyArthematicOperator {

	    static void swap(int a, int b)
	    {
	    	a=a^b;
	    	b=a^b;
	    	a=a^b;
	    	System.out.println("The value of a is:"+a);
	    	System.out.println("The value of b is:"+b);
	    	
	    }
	    public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the a number");
			int a=sc.nextInt();
			System.out.println("Enter the b number");
			int b=sc.nextInt();
			swap(a,b);
			
		}
	

}
