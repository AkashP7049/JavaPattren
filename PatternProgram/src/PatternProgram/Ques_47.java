package PatternProgram;
import java.util.Scanner;
public class Ques_47 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of row");
        int row=sc.nextInt();
        PrintPattern(row);
    }
    public static void PrintPattern(int row) {
    	 for (int i = 1; i <= row; i++) {
             char ch = 'A';
             for (int j = 1; j <= i; j++) {
                 System.out.print(ch+" ");
                 ch++;
             }
            System.out.println();
        }
}
}