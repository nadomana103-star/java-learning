public class MethodReturningAValues
{
    public static void main(String[] args)
    {;
        System.out.println("Total cost:"+calculateTotal(25.5,4));
    }

    public static double calculateTotal(double price, int quantity)
    {
        return price * quantity;
    }
}

