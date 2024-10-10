package Exception_Handeling;

import java.io.IOException;
import java.sql.SQLException;

public class CheckException {

	public static void main(String[] args) {
		        int a=10;
		        int b=0;
		        try{
		            int c=a/b; //ArithmeticException
		        }
//		        catch(ArithmeticException e){
//		        System.out.println("Tried to divide by zero");
//		        }
//		        catch(IndexOutOfBoundsException e) {
//		        	System.out.println("Try to occur element in range");
//		        }
		        catch(ArithmeticException|IndexOutOfBoundsException e) {
		        	System.out.println("Exception raised , try to resolve it");
		        }
	}

}
