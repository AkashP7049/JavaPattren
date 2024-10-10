package String;
import java.util.Scanner;

public class String_Builder_Insert {
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter an String");//suppose enter string 'Akash'
			String str=sc.nextLine();
			System.out.println(str);
			 // Convert the String to a StringBuilder
		    StringBuilder str1 = new StringBuilder(str);
		    //Inset Ain index 0
		    str1.insert(0,'A');
		    System.out.println(str1);
		    str1.insert(2,'a');
		    System.out.println(str1);
			
		}

		
	}


