package Number_Ques;



import java.util.Scanner;

public class Sum_Calculator {

	public static void main(String[] args) {
	     
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the first number");
	     double num1=sc.nextDouble();
	     while(true) {
	     System.out.println("Enter the second number");
	     double num2=sc.nextDouble();
	     double result=0;
		
	     System.out.println("choice operator +, -, *, /");
	      char operator=sc.next().charAt(0);
	    
	     switch(operator)
	     
	     {
	     case '+':
	    	 result=num1+num2;
	    	 System.out.println(result);
	    	 break;
	     case '-':
	    	 result=num1-num2;
	    	 System.out.println(result);
	    	 break;
	     case '*':
	    	 result=num1*num2;
	    	 System.out.println(result);
	    	 break;
	     case '/':
	    	 result=num1/num2;
	    	 System.out.println(result);
	    	 break;
	     }
	    	 System.out.println("Do you want to continue? (yes/no)");
	            String response = sc.next();
	            
	            if (response.equalsIgnoreCase("no")) {
	                System.out.println("Program terminated.");
	               
	            }
	           
	            	
	            else if (!response.equalsIgnoreCase("yes"))
	            {
	               
	                  System.out.println("Invalid response plz enter valid response yes or no");
	                }
	            }
	}
	}

