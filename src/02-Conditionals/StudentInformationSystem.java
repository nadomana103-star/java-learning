import java.util.Scanner;
public class StudentInformationSystem
{
    public static void main(String [] args)
    {
        System.out.println("Please enter your information:");
        System.out.println("Student name:");
        Scanner input=new Scanner(System.in);
        String Sname=input.nextLine();
        System.out.println("Student age:");
        int Sage=input.nextInt();
        System.out.println("Java exam score:");
        double Jscorer=input.nextDouble();
        System.out.println("Mathematics exam score:");
        double Mscore=input.nextDouble();
        System.out.println("English exam score:");
        double Escore=input.nextDouble();
        System.out.println("----- Student Information -----");
        System.out.println("Name:"+Sname);
        System.out.println("Age:"+Sage);
        System.out.println("Java:"+Jscorer);
        System.out.println("Math:"+Mscore);
        System.out.println("English:"+Escore);
        double Average=(Jscorer+Mscore+Escore)/3;
        System.out.println("Average Score:"+Average);
        if (Average>=90)
        {
            System.out.println("Grade:Excellent");
        }
        else if (Average>=75)
        {
            System.out.println("Grade:Good");
        }
        else if (Average>=60)
        {
            System.out.println("Grade:Pass");
        }
        else
        {
            System.out.println("Grade:Fail");
        }
        if (Sage<13)
        {
            System.out.println("Category:Child");
        }
        else if (Sage>=13 && Sage<=17)
        {
            System.out.println("Category:Teenager");
        }
        else
        {
            System.out.println("Category:Adult");
        }

    }
}
