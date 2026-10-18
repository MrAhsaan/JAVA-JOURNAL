package JOURNAL;

import java.util.Scanner;

public class StringPalindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String original = sc.nextLine();
        String reversed = "";

        for(int i =original.length()-1; i>=0; i--){
            reversed = reversed + original.charAt(i);
        }
        if(original.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Paindrome");
        }
        
        sc.close();
    }
}
