//Q9. Write a Java Program to accept elements from user and find out the multiplication of all elements in an array.

package JOURNAL;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();
        int product = 1;
        System.out.print("Enter Elements: "); 
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++){
            product = product * arr[i];
        }
        System.out.print("Multiplication of Array Elements: "+product);
        
        sc.close();
    }
}