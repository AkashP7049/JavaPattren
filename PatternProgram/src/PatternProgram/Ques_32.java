package PatternProgram;

import java.util.Scanner;
public class Ques_32{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int n=sc.nextInt();
        
        for(int i=n;i>=1;i--){
            
            for(int k=1;k<=n-i;k++){
            System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
            
            	System.out.print(j);
            }
           for(int j=2;j<=i;j++) {
                 System.out.print(j);
                
            }
            System.out.println();
            
        }
    
        
    }
}