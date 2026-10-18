package JOURNAL;

import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        System.out.print(" Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n>0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println("Sum of digit: "+sum);
        sc.close();
    }
}
