public class ExamTassk
{
    public static void main(String []args)
    {
        int []score={85,60,45,90,72,55,100};
        int total=calculateTotal(score);
       System.out.println(total);
       double averege=calculateAverage(score,total);
       System.out.println(averege);
       int Passed=countPassed(score);
       System.out.println(Passed);
    }

    public static int calculateTotal(int score[])
    {
        int sum=0;
        for (int i = 0; i<= score.length-1; i++)
        {
            sum+= score[i];
        }
        return sum;
    }
    public static double calculateAverage(int score[],int total)
    {
        double Average;
       return Average=(double) total/score.length;
    }
    public static int countPassed(int score[])
    {
        int Passed=0;
        for (int k = 0; k <= score.length-1; k++)
        {
           if (score[k]>=60)
           {
               Passed++;
           }
        }
        return Passed;
    }
}
