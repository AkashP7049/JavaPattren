package Exception_Handeling;

public class FinallyBlock {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		try {
			 arr[4]=7; //replace arr[1]=5
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("All Exception REsolved");
		}

	}

}
