package Number_Ques;

import java.util.Scanner;

public class Que_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		System.out.println("enter the number");
		int o = sc.nextInt();
		
	   int sum=0;
		
	
     for(int i=n;i<=o;i=i+1) 
     {
    	 if(i%2==0) {
    		 sum=sum+i;
    	
    	 }
    		
     }
	 System.out.println(sum);

	}

}
