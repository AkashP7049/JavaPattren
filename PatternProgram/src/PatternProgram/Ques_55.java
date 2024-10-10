package PatternProgram;

import java.util.Scanner;

public class Ques_55 {
   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the value of row");
	   int row=sc.nextInt();
	   Ascci(row);
}
   static void Ascci(int row) {

	char ch='A';
	   for(int i=1;i<=row;i++) {
		   for(int j=1;j<=i;j++) {
			   System.out.print(ch);
			   ch++;
		   }
		   System.out.println();
	   }
   }
}
