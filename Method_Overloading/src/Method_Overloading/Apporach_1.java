//APPROCHE 1 IN METHOD OVERLOADING : CHANGE NO. OF PARAMETERS

package Method_Overloading;

public class Apporach_1 {
static int add(int a ,int b)
{
	int sum=a+b;
	return sum;
}
static int add(int a,int b,int c)
{
	int sum=a+b+c;
	return sum;
}
public static void main(String[] args) {
	System.out.println(add(20,40));
	System.out.println(add(20,40,40));
}
}
