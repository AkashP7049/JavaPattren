package NumberProgram_Method;
import java.util.*;
public class Ques_11{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a number");
	double num=sc.nextDouble();
	double avg=NaturalNumber(num);
	
	System.out.println("The Average of Natural number up to "+num+" is :" +avg);
	  
	}
	static double NaturalNumber(double num) {
		double sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		double average = sum/num;
		
		return average;
	}
}
