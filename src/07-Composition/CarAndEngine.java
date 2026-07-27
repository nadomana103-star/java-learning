public class CarAndEngine
{
    public static void main (String[] args)
{
    Engine e1 = new Engine("BMW", 625);
    Car c1 = new Car("BMW", "M5", e1);
    e1.setHP(700);
    c1.display();
    e1.display();
}
}
class Engine
{
    private String B;
    private int HP;
    Engine(String B,int HP)
    {
        this.B=B;
        this.HP=HP;
    }
    String getB()
    {
        return B;
    }
    void setB(String B)
    {
        this.B=B;
    }
    int getHP()
    {
        return HP;
    }
    void setHP(int HP)
    {
        this.HP=HP;
    }
    void display()
    {
        System.out.println(B);
        System.out.println(HP);
    }
}
class Car
{
    private String B;
    private String M;
    private Engine engine;
    Car(String B,String M,Engine E)
    {
        this.B=B;
        this.M=M;
        engine=E;
    }
    String getB()
    {
        return  B;
    }
    void setB(String B)
    {
        this.B=B;
    }
    String getM()
    {
        return  M;
    }
    void setM(String M)
    {
        this.M=M;
    }
    Engine getEngine()
    {
        return engine;
    }
    void setEngine(Engine E)
    {
        engine=E;
    }
    void display()
    {
        System.out.println(B);
        System.out.println(M);
        engine.display();
    }
}
