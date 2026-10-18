package JOURNAL;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i=0; i<n; i++){
           if(arr[i] > largest){
            largest = arr[i];
           }     
        }
        System.out.println("Largest Element: "+largest);
        
        sc.close();
    }
    
}
