package PatternProgram;
import java.util.Scanner;

public class Ques_46 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of row");
	int row=sc.nextInt();
	sum(row);
}
  static void sum(int row) {
	  for(int i=1;i<=row;i++) {
		  for(int j=1;j<=(2*(row-i)+1);j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  for(int i=1;i<=row;i++) {
		  for(int j=1;j<=2*i-1;j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
  }
}
