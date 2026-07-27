public class LaptopAndBattery
{
    public static void main (String[] args)
{
    Battery b1 = new Battery("LG", 5000);
    Laptop l1 = new Laptop("Dell", "XPS", b1);
    Laptop l2 = new Laptop("HP", "Spectre", b1);
    b1.setC(6000);
    l1.display();
    l2.display();
    Battery b2 = new Battery("Samsung", 7000);
    l2.setBattery(b2);
    b2.setC(8000);
    l1.display();
    l2.display();
}
}
class Battery
{
    private String M;
    private int C;
    Battery(String M,int C)
    {
        this.M=M;
        this.C=C;
    }
    String getM()
    {
        return M;
    }
    void setM(String M)
    {
        this.M=M;
    }
    int getC()
    {
        return C;
    }
    void setC(int C)
    {
        this.C=C;
    }
    void display()
    {
        System.out.println(M);
        System.out.println(C);
    }
}
class Laptop
{
    private String B;
    private String M;
    private Battery battery;
    Laptop(String B,String M,Battery battery)
    {
        this.B=B;
        this.M=M;
        this.battery=battery;
    }
    String getB()
    {
        return B;
    }
    void setB(String B)
    {
        this.B=B;
    }
    String getM()
    {
        return M;
    }
    void setM(String M)
    {
        this.M=M;
    }
    Battery getBattery()
    {
        return battery;
    }
    void setBattery(Battery battery)
    {
        this.battery=battery;
    }
    void display()
    {
        System.out.println(B);
        System.out.println(M);
        battery.display();
    }
}
