import java.util.Scanner;
public class BankAccountSystem2
{
    public static  void main(String []args)
    {
        BankAccount BA=new BankAccount();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter holder name:");
        BA.holderName=input.nextLine();
        System.out.println("Enter account number:");
        BA.accountNumber=input.nextInt();
        System.out.println("Enter initial balance:");
        BA.balance= input.nextDouble();
        System.out.println("Enter deposit:");
        BA.deposit(input.nextDouble());
        System.out.println("Enter withdrawal:");
        BA.withdrawal(input.nextDouble());
        BA.display();
    }
}
class BankAccount
{
    String holderName;
    int accountNumber;
    double balance;

    void deposit(double a)
    {
        balance+=a;
    }
    void withdrawal(double b)
    {
        balance-=b;
    }
    void display()
    {
        System.out.println("----- Account Information -----");
        System.out.println("Holder:"+holderName);
        System.out.println("Account Number"+accountNumber);
        System.out.println("Balance:"+balance);
    }
}
