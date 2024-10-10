package NumberProgram_Method;
import java.util.*;
public class Ques_10 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a number");
	int num=sc.nextInt();
	int sum=WholeNumber(num);
	
	System.out.println("The sum of whole number up to n:" +sum);
	  
	}
	static int WholeNumber(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		return sum;
	}
}
