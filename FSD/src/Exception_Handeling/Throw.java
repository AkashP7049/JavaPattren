package Exception_Handeling;

public class Throw {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try
		{
			int z=x/y;
		}
		catch(ArithmeticException  e)
		{
			throw new ArithmeticException("Value of denominator is 0 ,please change!!");
		}
	}

}
