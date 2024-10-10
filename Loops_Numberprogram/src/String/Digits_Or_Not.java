

package String;
import java.util.*;

public class Digits_Or_Not {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an String");
		String str=sc.nextLine();
        if(isdigit(str)) {
        	System.out.println("true :Digits are contain this string");
        }
        else {
        	System.out.println("False :jDigits are not contain this string");
        }
		
	}
		static boolean isdigit(String str) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9') {
				count++;
			}
		}
		if(count>0) {
			return true;
		}
		else {
			return false;
		}
	}
}  

