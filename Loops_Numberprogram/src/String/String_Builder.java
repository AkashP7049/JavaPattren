package String;

public class String_Builder {

	public static void main(String[] args) {
		String str ="java";
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
			
		}
		System.out.println(sb);
		
	}
}
