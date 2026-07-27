public class FindMaximumScore
{
    public static void main(String[] args)
    {
        int arr[]={45,78,92,56,88,67};
        int max=arr[0];
        for (int i=0;i<= arr.length-1;i++)
        {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Highest score:"+max);
    }
}
