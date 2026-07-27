public class SecondHighestScore
{
    public static void main(String[] args)
    {
        int scores[]={85,60,45,90,72,55,100};
        int HS=scores[0];
        int SHS=scores[0];
        for (int i=0;i<= scores.length-1;i++)
        {
            if (scores[i]>HS)
            {
                SHS=HS;
                HS=scores[i];
            }
        }
        System.out.println("Highest score:"+HS);
        System.out.println("Second highest score:"+SHS);
    }
}
