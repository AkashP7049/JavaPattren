package PatternProgram;

import java.util.Scanner;
public class Ques_44{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            int num=1;
            for(int k=1;k<=(n-i+1);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(i>j){
                    System.out.print(num);
                    num++;
                }else{
                System.out.print(num);
                num--;
            }}
            System.out.println();
        }
            for(int i=1;i<=n;i++){
                int num=(n-i);
                for(int k=1;k<=i;k++){
                System.out.print(" ");
                }
                for(int j=1;j<=(2*(n-i)+1);j++){
                    if(j<=(n-i+1)){
                        System.out.print(j);
                        
                    }else{
                         System.out.print(num);
                         num--;
                         
                }}
                System.out.println();
            }
        
    }
}