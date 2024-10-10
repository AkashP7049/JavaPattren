// with parameter with return value

package NumberProgram_Method;
import java.util.Scanner;
public class Addition2 {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the 1st number");
	 int num1=sc.nextInt();
	 System.out.println("Enter the 2nd number");
	 int num2=sc.nextInt();
	 int res=sum(num1,num2);
	 System.out.println(res);
	 
}

private static int sum(int num1, int num2) {
	int sum=num1+num2;
	return sum;
}

    
}
