package JOURNAL;
//Q6. Write a java program to input a five digit number and display its last and first digits.
import java.util.Scanner;

public class First_and_Last_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five Digit Number: ");
        int n = sc.nextInt();
        int lastDigit = n % 10;
        int temp = n;
        while(temp>=10){
            temp = temp/10;
        }
        int firstDigit = temp;
        System.out.println("First Digit: "+firstDigit);
        System.out.println("Last Digit: "+lastDigit);
        sc.close();
    }
}