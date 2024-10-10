package Number_Ques;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        Set<Character> alphabetSet = new TreeSet<>();
        Set<Character> digitSet = new TreeSet<>();

         for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetSet.add(ch);
            } else if (Character.isDigit(ch)) {
                digitSet.add(ch);
            }
        }

        Character[] sortedAlphabets = alphabetSet.toArray(new Character[0]);
        Character[] sortedDigits=digitSet.toArray(new Character[0]);
        
        System.out.println("Alphabets in asending order:");
        for(char ch:sortedAlphabets){
            System.out.print(ch+" ");
        }
        System.out.println();
        
        System.out.println("Digits in ascending Order:");
        for(char ch:sortedDigits){
            System.out.print(ch+" ");
        }
        System.out.println();
        scanner.close();
    }
}