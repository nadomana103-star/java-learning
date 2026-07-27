import java.util.Scanner;
public class CountEvenNumber
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Put the number:");
        int num= input.nextInt();
        int flag=0;
        for (int i=1;i<=num;i++)
        {
            if (i%2==0)
            {
                ++flag;
            }
        }
        System.out.println("Number of even numbers:"+flag);
    }
}
