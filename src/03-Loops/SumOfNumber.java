import java.util.Scanner;
public class SumOfNumber
{
    public static void main(String[] args )
    {
        int sum=0;
        System.out.println("Put a positiveinteger number:");
        Scanner input=new Scanner(System.in);
        int intn=input.nextInt();
        for (int i=1;i<=intn;i++)
        {
            sum+=i;
        }
        System.out.println("Sum="+sum);
    }
}
