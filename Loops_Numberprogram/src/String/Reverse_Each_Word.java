package String;

import java.util.Scanner;

public class Reverse_Each_Word {
    
	static String wordReverse(String str) {
		StringBuilder sb= new StringBuilder();
		String[] word=str.split(" ");
		for(int i=0;i<word.length;i++) {
			sb.append(reverse(word[i]));
			sb.append(" ");
		}
		return sb.substring(0);
	}
	static String reverse(String word) {
		String newstr="";
		for(int i=word.length()-1;i>=0;i--) {
			newstr=newstr+word.charAt(i);
		}
		return newstr;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		System.out.println(wordReverse(str));
	}
}
