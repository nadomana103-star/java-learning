import java.util.Scanner;
public class ATMsystem
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ATMAccount account = new ATMAccount();

        System.out.print("Enter holder name: ");
        account.holderName = input.nextLine();

        System.out.print("Enter account number: ");
        account.accountNumber = input.nextInt();

        System.out.print("Enter initial balance: ");
        account.balance = input.nextDouble();

        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Account");

        System.out.print("Choose an option: ");
        int choice = input.nextInt();

        if (choice == 1)
        {
            System.out.print("Enter deposit amount: ");
            double amount = input.nextDouble();
            account.deposit(amount);
        }
        else if (choice == 2)
        {
            System.out.print("Enter withdrawal amount: ");
            double amount = input.nextDouble();
            account.withdraw(amount);
        }
        else if (choice == 3)
        {
            account.display();
        }
        else
        {
            System.out.println("Invalid option.");
        }

        System.out.println();
        account.display();
    }
}

class ATMAccount
{
    String holderName;
    int accountNumber;
    double balance;

    void deposit(double amount)
    {
        balance += amount;
    }

    void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient funds.");
        }
    }

    void display()
    {
        System.out.println("----- Account Information -----");
        System.out.println("Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}