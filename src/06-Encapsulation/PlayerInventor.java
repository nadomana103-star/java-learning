public class PlayerInventor
{
    public static void main(String[] args)
    {
        Item i1 = new Item("Sword", 1, 100);
        Item i2 = new Item("Potion", 5, 20);
        i1.increase(1);
        i2.increase(2);
        i1.decrease(2);
        i2.decrease(1);
        i1.compare(i2);
        i1.display();
        i2.display();
    }
}
class Item
{
    private String IN;
    private int Q;
    private double P;
    Item(String in,int q,double p)
    {
        IN=in;
        Q=q;
        P=p;
    }
    String getIN()
    {
        return IN;
    }
    void setIN(String in)
    {
        IN=in;
    }
    int getQ()
    {
        return Q;
    }
    void setQ(int q)
    {
        if (q>=0)
        {
            Q=q;
        }
    }
    double getP()
    {
        return P;
    }
    void setP(double p)
    {
        P=p;
    }
    void increase(int a)
    {
        setQ(getQ()+a);
    }
    void decrease(int a)
    {
        setQ(getQ()-a);
    }
    void compare(Item other)
    {
        double total1 = getP() * getQ();
        double total2 = other.getP() * other.getQ();

        if(total1 > total2)
        {
            System.out.println(IN + " has higher value");
        }
        else if(total1 < total2)
        {
            System.out.println(other.IN + " has higher value");
        }
        else
        {
            System.out.println("Same value");
        }
    }
    void display ()
    {
        System.out.println(getIN());
        System.out.println(getQ());
        System.out.println(getP());
    }
}