import java.util.Scanner;
public class InformationSystem
{
    public static  void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your  name:");
        String SN=input.nextLine();
        System.out.println("Enter your age");
        int SA= input.nextInt();
        System.out.println("Number of subjects:");
        int NOS=input.nextInt();
        System.out.println("Scores:");
        int score[]=new int[NOS];
        for (int i=0;i<=NOS;i++)
        {
            score[i]=input.nextInt();
        }
        System.out.println("----- Student Information -----");
        System.out.println("Name:"+SN);
        System.out.println("Age:"+SA);
        int TS=calculateTotal(score);
        System.out.println("Total score:"+TS);
        double AS=calculateAverage(NOS,TS);
        System.out.println("Average score:"+AS);
        int HS=findHighest(score);
        System.out.println("Highest score:"+HS);
        int PS=countPassed(score);
        System.out.println("Passed subjects:"+PS);
    }
    public static int calculateTotal(int arr[])
    {
        int total=0;
        for (int i = 0; i<= arr.length-1; i++)
        {
            total+= arr[i];
        }
        return total;
    }
    public static double calculateAverage(int a,int b)
    {
        double averege=0;
        return averege=(double) b/a;
    }
    public static int findHighest(int arr[])
    {
        int max= arr[0];
        for (int i = 0; i<= arr.length-1; i++)
        {
            if (max< arr[i])
            {
                max= arr[i];
            }
        }
        return max;
    }
    public static int countPassed(int arr[])
    {
        int flag=0;
        for (int i = 0; i<= arr.length-1; i++)
        {
            if (arr[i]>=60)
            {
                flag++;
            }
        }
        return flag;
    }
}
