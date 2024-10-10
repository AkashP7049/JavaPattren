package NumberProgram_Method;
import java.util.Scanner;

public class Ques_24 {
  static boolean CheckPrime(int n) {
	  if(n<2)
	  {
		  return false;
	  }
	  for(int i=2; i<n; i++)
	  {
		  if(n%i==0)
		  {
			  return false;
		  }
	  }
	  return true;
  }
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	
	System.out.println(CheckPrime(n));
}
}
