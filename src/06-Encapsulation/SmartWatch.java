public class SmartWatch
{
    public static void main (String [] args)
    {
        SWatch w1 = new SWatch("Apple", 80, 500);
        SWatch w2 = new SWatch("Samsung", 60, 400);
        w1.chargeBL(15);
        w2.UseBL(15);
        w1.compareBL(w2);
        w1.D();
        w2.D();
    }
}
class SWatch
{
    private String B;
    private int BL;
    private double P;
    SWatch(String b,int bl,double p)
    {
        B=b;
        BL=bl;
        P=p;
    }
    String getB()
    {
        return B;
    }
    void setB(String b)
    {
        B=b;
    }
    int getBL()
    {
        return BL;
    }
    void setBL(int bl)
    {
        if (bl>=0 && bl<=100)
        {
            BL=bl;
        }
        else if (bl>100)
        {
            BL=100;
        }
        else if (bl<0)
        {
            BL=0;
        }
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
    void chargeBL(int bl)
    {
        setBL(getBL()+bl);
    }
    void UseBL(int bl)
    {
        setBL(getBL()-bl);
    }
    void compareBL(SWatch other)
    {
        if (getBL()>other.getBL())
        {
            System.out.println(getB()+"has higher battery level");
        }
        else if (getBL()< other.getBL())
        {
            System.out.println(other.getB()+"has higher battery level");
        }
        else
        {
            System.out.println("Same battery level");
        }
    }
    void D()
    {
        System.out.println("Brand:"+getB());
        System.out.println("Battery:"+getBL());
        System.out.println("Price:"+getP());
    }
}