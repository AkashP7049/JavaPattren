package NumberProgram_Method;

import java.util.Scanner;

public class Ques_25 {
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
		int start = sc.nextInt();
		System.out.println("Enter the number");
		int end = sc.nextInt();
		int sum=0;
		for(int i=start;i<=end;i=i+1) 
		{
			if(CheckPrime(i))
				sum=sum+i;
		}
		System.out.print(sum);

		sc.close();
	}
	

}
