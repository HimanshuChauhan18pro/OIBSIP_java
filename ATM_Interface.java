package Projects;

import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit Suceessfull.");
        } else{
            System.out.println("Invalid Deposit amount.");
        }
    }

    public void withdrall(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal Successfull. ");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
public class ATM_Interface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter Initial Balance  Amount : ");
        // double initBal=input.nextDouble();
        BankAccount user = new BankAccount(10000.00);
        
        while(true){
            System.out.println("\n----- Welcome to ATM -----\n ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");
            System.out.print("\n Enter your choice :");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: "+user.getBalance());
                    break;
                case 2:
                    System.out.print("Enter Deposit Amount : ");
                    double depositAmonut = input.nextDouble();
                    user.deposit(depositAmonut);
                    System.out.println("Current Balance: "+user.getBalance());
                    break;
                case 3:
                    System.out.print("Enter Withdrawal Amount : ");
                    double withdrallAmount= input.nextDouble();
                    user.withdrall(withdrallAmount);
                    System.out.println("Current Balance: "+user.getBalance());
                    break;
                case 4:
                    System.out.println("Thank You !");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Please Try again.");
            }
        }
    }
}
