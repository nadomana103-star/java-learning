import java.util.Scanner;
public class TemperatureConventer
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Temperature t1=new Temperature();
        t1.celsius= input.nextDouble();
        t1.CelsiustoFahrenheit();
        t1.CelsiustoKelvin();
        t1.display();
    }
}
class Temperature
{
    double celsius;
    double kelvin;
    double fahrenheit;
     void CelsiustoFahrenheit()
    {
         fahrenheit=((celsius*9)/5)+32;
    }
     void CelsiustoKelvin()
    {
        kelvin=celsius+273.15;
    }
     void display()
    {
        System.out.println("----- Temperature Report -----");
        System.out.println("Celsius:"+celsius);
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Kelvin:"+kelvin);
    }
}