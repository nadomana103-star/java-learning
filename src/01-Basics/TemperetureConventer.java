import java.util.Scanner;
public class TemperetureConventer
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double C=input.nextDouble();
        double F=C*9/5+32;
        System.out.println("Celsius="+C);
        System.out.println("Fahrenheit="+F);
    }
}
