import java.util.Scanner;
public class LoginSystem
{
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("put your name:");
        String username=input.nextLine();
        System.out.println("put your password:");
        int password=input.nextInt();
        if (username.equals("admin") && password==12345)
        {
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("Invalid user ");
        }

    }
}
