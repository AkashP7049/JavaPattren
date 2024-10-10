
package String;
import java.util.Scanner;

public class String_reverse {
	static String reverse(String str)
	{   
		String newstr="";
		for(int i=str.length()-1;i>=0;i--)
		{   
			char ch=str.charAt(i);
			newstr=newstr+ch;
		}
		return newstr;
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println(reverse(str));
	}

}

  