import java.util.Scanner;
public class AgeClassification
{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        if (age<13)
        {
            System.out.println("Child");
        }
        else if (age>=13 && age<=17)
        {
            System.out.println("Teenager");
        }
        else
        {
            System.out.println("Adult");
        }
    }
}
