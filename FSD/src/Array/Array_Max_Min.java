package Array;
import java.util.Scanner;
public class Array_Max_Min {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array size");
		int size=sc.nextInt();
		
		int number[]=new int[size];
		System.out.println("Eneter an Integer");
		for(int i=0;i<size;i++) {
			number[i]=sc.nextInt();
		}	
			int min=Integer.MAX_VALUE;
			int max=Integer.MIN_VALUE;
		
		for(int i=0;i<number.length;i++) {
			if(number[i]<min) {
				min=number[i];
			}
			if(number[i]>max) {
				max=number[i];
			}
		}
		System.out.println("The Largest number of an Array is :" +max);
		System.out.println("The Smallest No. of an Array is :"+min);
		

	}

}
