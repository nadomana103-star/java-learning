public class PhoneAndCamera
{
    public static void main (String[] args)
    {
        Camera c1=new Camera("Sony",1000);
        Phone p1=new Phone("Apple","Air",c1);
        Phone p2=new Phone("Samsung","A14",c1);
        p1.display();
        p2.display();
        c1.setM(1500);
        Camera c2=new Camera("Vision",2000);
        p2.setCamera(c2);
        p1.display();
        p2.display();
    }
}
class Camera
{
    private String B;
    private int M;

    Camera(String B,int M )
    {
        this.B=B;
        this.M=M;
    }
    String getB()
    {
        return B;
    }
    void setB(String B)
    {
        this.B=B;
    }
    int getM()
    {
        return M;
    }
    void setM(int M)
    {
        this.M=M;
    }
    void display()
    {
        System.out.println("Camera's brand is "+B);
        System.out.println("Camera has " +M+ " megapixels");
    }
}
class Phone
{
    private String B;
    private String M;
    private Camera camera;
    Phone(String B,String M,Camera camera)
    {
        this.B=B;
        this.M=M;
        this.camera=camera;
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
    Camera getCamera()
    {
        return camera;
    }
    void setCamera(Camera camera)
    {
        this.camera=camera;
    }
    void display()
    {
        System.out.println("Phone's brand is "+B);
        System.out.println("Phone's model is "+M);
        System.out.println("Phone's camera is");
        camera.display();
    }
}
