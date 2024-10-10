package PatternProgram;
import java.util.Scanner;
public class Ques50 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row value");
		int row=sc.nextInt();
		sum(row);
	}
	static void sum(int row) {
		for(int i=1;i<row;i++) {
			for(int k=1;k<=(row-i+1);k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
			if(j==1||j==2*i-1||i==row) {
				System.out.print("*");
			}
			else {
				System.out.print(" " );
				}
			}
			System.out.println();
		}
		for(int i=1;i<=row;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*(row-i)+1);j++) {
				if(j==1||j==(2*(row-i)+1)||i==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
	
}
