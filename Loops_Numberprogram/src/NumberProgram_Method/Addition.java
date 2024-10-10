// with parameter without return value 
package NumberProgram_Method;
import java.util.Scanner;
public class Addition {
    
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num2=sc.nextInt();
		sum(num1,num2);
	
	}

	 static void sum(int num1, int num2) {
		
		int sum=num1+num2;
		System.out.println(sum);
	}
     	
}
