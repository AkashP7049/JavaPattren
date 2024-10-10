// CAN BE OVERLOADED MAIN METHOD

package Method_Overloading;

public class Overload_MainMethod {
	public static void main()
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
	}
	public static int main(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		int a=5;
		int b=2;
		int pro=a*b;
		System.out.println(pro);
		System.out.println(main(20,20));
		main();
	}

}
