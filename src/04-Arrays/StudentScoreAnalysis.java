public class StudentScoreAnalysis
{
    public static void main(String[] args)
    {
        int TS=0;
        double AS;
        int scores[]={85,60,45,90,72,55,100};
        int HS=scores[0];
        int PS=0;
        for (int i=0;i<= scores.length-1;i++)
        {
           TS+=scores[i];
           if (HS<scores[i])
           {
               HS=scores[i];
           }
           if (scores[i]>=60)
           {
               PS++;
           }
        }
        System.out.println("Total score:"+TS);
        AS=(double) TS/ scores.length;
        System.out.println("Average score:"+AS);
        System.out.println("Highest score:"+HS);
        System.out.println("Passed students:"+PS);
    }
}
