public class ProblemDecription
{
   public static void main(String[] args)
   {
       int number[]={12,45,7,89,34};
       FindMaximum( number);
   }
   public static void FindMaximum(int arr[])
   {
       int max= arr[0];
      for (int i = 0; i<= arr.length-1; i++)
      {
          if (arr[i]> max)
          {
              max= arr[i];
          }
      }
      System.out.println("Maximum number:"+max);
   }
}
