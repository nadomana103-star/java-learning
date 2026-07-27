public class ComputerSystem
{
    public static void main (String[] args)
    {
        Computer c1 = new Computer("Dell", "XPS", 1200);
        Computer c2 = new Computer("Apple", "MacBook", 1500);
        c1.setP(2000);
        c2.setP(1500);
        c1.compare(c2);
        c1.display();
        c2.display();
    }
}
class Computer
{
    private String CB;
    private String M;
    private double P;
    Computer(String cb,String m,double p)
    {
        CB=cb;
        M=m;
        P=p;
    }
    String getCB()
    {
        return CB;
    }
    void setCB(String cb)
    {
        CB=cb;
    }
    String getM()
    {
        return M;
    }
    void setM(String m)
    {
        M=m;
    }
    double getP()
    {
        return P;
    }
    void setP(double p)
    {
        if (p>=0)
        {
            P=p;
        }
    }
    void compare(Computer other)
    {
        if (getP()>other.getP())
        {
            System.out.println(getCB()+"'s price bigger");
        }
        else if (getP()< other.getP())
        {
            System.out.println(other.getCB()+"'s price bigger");
        }
        else
        {
            System.out.println("Same price");
        }
    }
    void display()
    {
        System.out.println(getCB());
        System.out.println(getM());
        System.out.println(getP());
    }
}
