
package Array;
import java.util.Scanner;
public class SearchElementX {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of an array:");
	int size=sc.nextInt();
	 
	int number[]=new int[size];
	System.out.println("Enter value of an array :");
	for(int i=0;i<size;i++) {
		number [i]= sc.nextInt();
	}	
		System.out.println("Enter to search an element:");
		int x=sc.nextInt();
	
	for(int i=0; i<number.length;i++) {
		if(number[i]==x) {
			System.out.println("x is found at index no."+i);
		}
		else {
			System.out.println("not found!!");
		}
	}
  }

}
