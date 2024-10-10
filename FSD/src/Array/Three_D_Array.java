package Array;
import java.util.*;
import java.util.Scanner;

public class Three_D_Array {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Row size");
		int row = sc.nextInt();
		System.out.println("Enter the column size");
		int col = sc.nextInt();
		System.out.println("ENter the width value");
		int wid=sc.nextInt();
		//create two d array
		int[][][] arr= new int [row][col][wid];
		//enter element in array
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				for(int k=0;k<wid;k++)
				{
					arr[i][j][k]=sc.nextInt();
				}
			 }
				
			}
		
		//Display an array
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<wid;k++) {
					System.out.print(arr[i][j][k]+ " ");
				}
			}
				System.out.println();
			}
			System.out.println();
		}
	}