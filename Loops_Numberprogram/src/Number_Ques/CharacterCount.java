package Number_Ques;
  
import java.util.Scanner;
public class CharacterCount{
	public static void main(String[] args){
		String original="My Name is Akash Patel";
		String reverse=reverseString(original);
		System.out.println("Original : "+original);
	    System.out.println("reverse : "+reverse);
	}
	private static String reverseString(String input) {	
		StringBuilder stringBuilder= new StringBuilder(input);
		stringBuilder.reverse();
		return stringBuilder.toString();
		
		
	}
}