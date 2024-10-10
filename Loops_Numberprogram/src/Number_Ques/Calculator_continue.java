package Number_Ques;

import java.util.Scanner;

public class Calculator_continue {

	public static void main(String[] args) {
		while(true) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the first number");
	     double num1=sc.nextDouble();
	     System.out.println("Enter the second number");
	     double num2=sc.nextDouble();
	     System.out.println("choice operator +, -, *, /");
	      char operator=sc.next().charAt(0);
	     double result=0;
	     switch(operator)
	     
	     {
	     case '+':
	    	 result=num1+num2;
	    	 System.out.println("Result is :"+result);
	    	 break;
	     case '-':
	    	 result=num1-num2;
	    	 System.out.println("Result is :"+result);
	    	 break;
	     case '*':
	    	 result=num1*num2;
	    	 System.out.println("Result is :"+result);
	    	 break;
	     case '/':
	    	 result=num1/num2;
	    	 System.out.println("Result is :"+result);
	    	 break;
	    	 default:
	    		 System.out.println("Invalid Operator");
	    		 
	     }
	    	 System.out.println("Do you want to continue? (yes/no)");
	            String response = sc.next();
	            
	            if (response.equalsIgnoreCase("no")) {
	                System.out.println("Program terminated.");
	               break;
	            }
	            else if (!response.equalsIgnoreCase("yes"))
	            {
	                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
	            }
	            }
	}

	}

