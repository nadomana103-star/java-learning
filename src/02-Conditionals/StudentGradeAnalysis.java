import java.util.Scanner;
public class StudentGradeAnalysis
{
    public static void main(String[] args)
    {
        int TS=0;
        int max=0;
        int flag=0;
        double Avg;
        Scanner input=new Scanner(System.in);
        System.out.println("Student name:");
        String Sname=input.nextLine();
        System.out.println("Student age:");
        int Sage=input.nextInt();
        System.out.println("Number of subject:");
        int NS= input.nextInt();
        System.out.println("Scores for each subject:");
        for (int i=1;i<=NS;i++)
        {
            int a= input.nextInt();
            TS+=a;
            if (a>max)
            {
                max=a;
            }
            if (a>=60)
            {
                flag++;
            }
        }

        Avg=(double) TS/NS;
        System.out.println("Name:"+Sname);
        System.out.println("Age:"+Sage);
        System.out.println("Total score:"+TS);
        System.out.println("Average score:"+Avg);
        System.out.println("Highest score:"+max);
        System.out.println("Passed subjects:"+flag);
        if (Avg>=90)
        {
            System.out.println("Excellent");
        }
        else if (Avg>=75)
        {
            System.out.println("Good");
        }
        else if (Avg>=60)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
        if (Sage<13)
        {
            System.out.println("Child");
        }
        else if (Sage>=13&&Sage<=17)
        {
            System.out.println("Teenager");
        }
        else
        {
            System.out.println("Adult");
        }
    }
}
