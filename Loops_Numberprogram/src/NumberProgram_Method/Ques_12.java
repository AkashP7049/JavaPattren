package NumberProgram_Method;
import java.util.*;
public class Ques_12{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter a nuber");
	double num=sc.nextDouble();
	double avg=WholeNumber(num);
	
	System.out.println("The Average of whole number up to "+num+" is :" +avg);
	  
	}
	static double WholeNumber(double num) {
		double sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		double average = sum/num;
		
		return average;
	}
}
