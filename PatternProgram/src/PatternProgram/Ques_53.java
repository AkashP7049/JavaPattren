package PatternProgram;
import java.util.Scanner;
public class Ques_53 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a row value");
		int row=sc.nextInt();
		printpattern(row);
	}
	static void printpattern(int row) {
		for(int i=1;i<=row;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*row-1);j++) {
				if(i==1) {
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
// sahi mi hai