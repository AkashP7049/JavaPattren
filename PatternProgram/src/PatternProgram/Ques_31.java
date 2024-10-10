package PatternProgram;

import java.util.Scanner;

public class Ques_31 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of row");
			int row=sc.nextInt();
			for(int i=1;i<=row;i++) {
				int num=2*(row-i)+1;
				for(int k=1;k<=i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=(2*(row-i)+1);j++) {
					System.out.print(num);
					num--;
				}
				System.out.println();
			}
			
	}

}
