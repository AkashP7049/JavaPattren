package Abstraction;

public class ThrowExample {

	public static void main(String[] args) {
				try {
					div(10,0);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
				public static int div (int a, int b) throws Exception {
				
				
					if(b==0) {
						throw new ArithmeticException("Tryied diving with number=0");
					}
					else {
						int res=a/b;
					
					return res;
	}
				}
}


