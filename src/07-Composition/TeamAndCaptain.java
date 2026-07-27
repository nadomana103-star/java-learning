public class TeamAndCaptain
{
    public static void main (String[] args)
    {
        Captain c1= new Captain("Aman",100);
        team t1=new team("Team1",c1);
        team t2=new team("Team2",c1);
        c1.setl(90);
        t1.display();
        t2.display();
        Captain c2= new Captain("Aman2",100);
        t2.setCaptain(c2);
        c2.setl(95);
        t1.display();
        t2.display();
    }
}
class Captain
{
    private String N;
    private int L;
    Captain(String N,int L)
    {
        this.N=N;
        this.L=L;
    }
    String getN()
    {
        return N;
    }
    void setN(String N)
    {
        this.N=N;
    }
    int getL()
    {
        return L;
    }
    void setl(int L)
    {
        this.L=L;
    }
    void display()
    {
        System.out.println(N);
        System.out.println(L);
    }
}
class team
{
    private String N;
    private Captain captain;
    team(String N,Captain captain)
    {
        this.N=N;
        this.captain=captain;
    }
    String getN()
    {
        return N;
    }
    void setN(String N)
    {
        this.N=N;
    }
    Captain getCaptain()
    {
        return captain;
    }
    void setCaptain(Captain captain)
    {
        this.captain=captain;
    }
    void display()
    {
        System.out.println(N);
        captain.display();
    }
}