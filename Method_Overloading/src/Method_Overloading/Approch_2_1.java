// APPROCH 2 IN METHOD OVERLOADIN : CHANGE DATA TYPE IN PARAMETER

package Method_Overloading;

public class Approch_2_1 {
	public static int add(int a,int b)
	
	{
		int sum=a+b;
		return sum;
	}
	public static float add(float a,float b)
	{
		float sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(add(20,40));
		System.out.println(add(20.044f,40));
	}

}
