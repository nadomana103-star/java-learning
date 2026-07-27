import java.util.Scanner;
public class FindMaximumNumber
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("how many numbers you want to enter?");
        int hm=input.nextInt();
        int max= input.nextInt();
        for (int i=2;i<=hm;i++)
        {
            int a=input.nextInt();
            if (a>max){max=a;}
        }
        System.out.println("Maximum number:"+max);
    }
}
