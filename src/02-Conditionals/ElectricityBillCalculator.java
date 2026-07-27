import java.util.Scanner;
public class ElectricityBillCalculator
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of electricity");
        double bill;
        int userunit=input.nextInt();
        if (userunit<=100)
        {
            bill=userunit*0.50;
            System.out.println("Unites:"+userunit);
            System.out.println("Bill:"+bill);
        }
        else
        {
            bill=userunit*0.75;
            System.out.println("Unites:"+userunit);
            System.out.println("Bill:"+bill);
        }
    }
}
