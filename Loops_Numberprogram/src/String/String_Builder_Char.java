package String;
import java.util.*;

public class String_Builder_Char {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an String");
	String str=sc.nextLine();
	System.out.println(str);
	 // Convert the String to a StringBuilder
    StringBuilder str1 = new StringBuilder(str);
	//char at index 0
	System.out.println(str.charAt(0));
	//char at index 4
	System.out.println(str.charAt(4));
	//set character at index 0
    str1.setCharAt(0, 'A');
	System.out.println(str1);
	str1.setCharAt(2,'n');
	System.out.println(str1);
}

}