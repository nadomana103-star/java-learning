public class MovieSystem
{
    public static void main(String[] args)
    {
        Movie m1 = new Movie("Interstellar", "Sci-Fi", 8.7);
        Movie m2 = new Movie("Avatar", "Fantasy", 7.5);
        m1.setR(2);
        m2.setR(5);
        m1.compare(m2);
        m1.display();
        m2.display();
    }
}
class Movie
{
    private String MT;
    private String G;
    private double R;
    Movie(String mt,String g,double r)
    {
        MT=mt;
        G=g;
        R=r;
    }
    String getMT()
    {
        return MT;
    }
    void setMT(String mt)
    {
        MT=mt;
    }
    String getG()
    {
        return G;
    }
    void setG(String g)
    {
        G=g;
    }
    double getR()
    {
        return R;
    }
    void setR(double r)
    {
        if(r>=0&&r<=10)
        {
            R=r;
        }
    }
    void compare(Movie other)
    {
        if (getR()>other.getR())
        {
            System.out.println(getMT()+"'s rating bigger");
        }
        else if (getR()< other.getR())
        {
            System.out.println(other.getMT()+"'s rating bigger");
        }
        else
        {
            System.out.println("Same rating");
        }
    }
    void display()
    {
        System.out.println(getMT());
        System.out.println(getG());
        System.out.println(getR());
    }
}