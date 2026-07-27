import java.util.Scanner;
public class NameInput
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        String name=input.nextLine();
        String university=input.nextLine();
        System.out.print(age);
        System.out.print(name);
    }
}
