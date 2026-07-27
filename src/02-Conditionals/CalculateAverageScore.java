import java.util.Scanner;
public class CalculateAverageScore
{
    public static void main(String[] args)
    {
        int sum=0;
        double aver;
       Scanner input=new Scanner(System.in);
       System.out.println("How many scores you want to enter?");
       int hm= input.nextInt();
       System.out.println("Put your numbers:");
       for (int i=1;i<=hm;i++)
       {
           int a=input.nextInt();
           sum+=a;
       }
       System.out.println("Total score:"+sum);
       System.out.println("Average score:"+sum/hm);
    }
}
