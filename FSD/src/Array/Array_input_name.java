package Array;
import java.util.*;
public class Array_input_name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array size");
		int size=sc.nextInt();
		
		String [] name=new String[size];
		System.out.println("Enter names:");
		for(int i=0;i<size;i++) {
			name[i]=sc.next();
		}
		for(int i=0; i<size;i++) {
			System.out.println("name " + (i+1) +" is : " + name[i]);
		}

	}

}
