//Q7. Write a Java Program that displays an ATM Menu using Switch Case Statement a) Balance b) Deposit Money c) Withdraw Money d) Exit 

package JOURNAL;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ATM MENU DRIVEN: ");
        

        int balance = 55000;
        int choice = 0;
        while(choice!=4){
            System.out.println("1. Check Balance: ");
            System.out.println("2. Deposit Money: ");
            System.out.println("3. Withdraw Money: ");
            System.out.println("4. Exit: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Current Balance: "+balance);
                    break;
                case 2:
                    System.out.println("Enter Deposit Amount: ");
                    int deposit = sc.nextInt();               
                    if(deposit>0){
                        balance += deposit;
                        System.out.println(deposit+" Successfully Deposited \nNew Balance = "+balance);
                    }else{
                        System.out.println("Invalid Amount!!");
                    }
                    break;
                case 3:
                    System.out.println("Enter Withdraw Amount: ");
                    int withdraw_amnt = sc.nextInt();
                    if(withdraw_amnt <= balance){
                        balance -= withdraw_amnt;
                        System.out.println("Withdraw successful of "+withdraw_amnt+ " New Balance: "+balance);
                    }else{
                        System.out.println("Insufficient Balance!!");
                    }
                    break;
                case 4:
                    System.out.println("Thank You");
                    break;
            
                default:
                    System.out.println("Invalid Choice please choose b/w 1 - 4");
                    break;
            }
        }       
        sc.close();
    }
}