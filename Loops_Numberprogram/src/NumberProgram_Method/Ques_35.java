package NumberProgram_Method;
import java.util.*;
public class Ques_35 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		gcd(a,b);
		int max=0;
		System.out.println(max);
		
	}
	static int gcd(int a,int b) {
			int max=0;
		
		if(a<b) {
			for(int i=1;i<=a;i++) {
				if(a%i==0 && b%i==0) {
					Math.max(max, i);
				}
				max=i;
			}
		return max;
	}
		if(b<a) {
			for(int i=1;i<=b;i++) {
				if(b%i==0 && a%i==0) {
					Math.max(max, b);
				}
				max=i;
			
			}
			return max;
		}
		return max;
		}

}
