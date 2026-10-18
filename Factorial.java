package JOURNAL;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
      System.out.print("Enter Number: ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int fact = 1, i =1;
      
      while(i<=n){
        fact = fact*i;
        i++;
      }
      System.out.println("Factorial "+n+": "+fact);
      sc.close();
    }
}
