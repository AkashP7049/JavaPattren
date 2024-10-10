package Number_Ques;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
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
    	 default :
    	 System.out.println(" enter a valid operator");
     
     }
     
     double x=result;
     System.out.println("enter a number");
     double num3=sc.nextDouble();
     System.out.println("select operator ( + , - , * , / ");
     char operator1 =sc.next().charAt(0);
     switch(operator1)
     {
       case '+':
    	 result=x+num3;
    	 System.out.println(result);
    	 break;
       case '-':
      	 result=x-num3;
      	 System.out.println(result);
      	 break;
       case '*':
      	 result=x*num3;
      	 System.out.println(result);
      	 break;
       case '/':
      	 result=x/num3;
      	 System.out.println(result);
      	 break;
      	 default:
      		 System.out.println("enter  a valid operator");
     }  

	}

}
