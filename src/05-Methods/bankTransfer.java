import java.util.Scanner;

public class bankTransfer
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter  name:");
        String HN=input.nextLine();
        System.out.println("Enter number:");
        int AN= input.nextInt();
        System.out.println("Enter balance:");
        double B= input.nextDouble();
        input.nextLine();
        Account AC=new Account(HN,AN,B);
        System.out.println("Enter  name:");
        String HN1=input.nextLine();
        System.out.println("Enter number:");
        int AN1= input.nextInt();
        System.out.println("Enter balance:");
        double B1= input.nextDouble();
        input.nextLine();
        Account AC1=new Account(HN1,AN1,B1);
        System.out.println("Deposit:");
        AC.deposit(input.nextDouble());
        System.out.println("Withdraw:");
        AC.withdraw(input.nextDouble());
        System.out.println("Transfer:");
        AC.transfer(AC1,input.nextDouble());
        System.out.println("Deposit:");
        AC1.deposit(input.nextDouble());
        System.out.println("Withdraw:");
        AC1.withdraw(input.nextDouble());
        System.out.println("Transfer:");
        AC1.transfer(AC,input.nextDouble());
        AC.display();
        AC1.display();
    }
}
class Account
{
    String holderName;
    int accountNumber;
    double balance;
    Account(String hN, int aN, double b)
    {
        holderName=hN;
        accountNumber=aN;
        balance=b;
    }
    void deposit(double amount)
    {
        balance+=amount;
    }
    void withdraw(double amount)
    {
        balance-=amount;
    }
    void transfer(Account other, double amount)
    {
        if (amount<=balance)
        {
            balance-=amount;
            other.balance+=amount;
        }
    }
    void display()
    {
        System.out.println("Name:"+holderName);
        System.out.println("Number:"+accountNumber);
        System.out.println("Balance:"+balance);
    }
}