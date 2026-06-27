


import java.util.*;
class ATM {
    
    public static void main(String[] args) {
        int balance = 1000;  
        
        Scanner sc = new Scanner(System.in);

        
        while (true) {
            
            System.out.println("\n---- ATM Menu ----");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please take your money.");
                    } else {
                        System.out.println("Not enough balance.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Money deposited.");
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
