package PatternProgram;
import java.util.Scanner;
public class Ques_60 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of row");
        int row=sc.nextInt();
        PrintPattern(row);
    }
    public static void PrintPattern(int row) {

    	 for (int i = 1; i <= row; i++) {
    		 char ch = 'A';
            for (int j = 1; j <=row-i+1; j++) {
                	 System.out.print(ch);
                	 ch++;
                 }
             
            System.out.println();
        }
    	 for(int i=2;i<=row;i++) {
    		 char ch1='A';
    		 for(int j=1;j<=i;j++) {
    			 System.out.print(ch1);
    			 ch1++;
    		 }
    		 System.out.println();
    	 }
}
}