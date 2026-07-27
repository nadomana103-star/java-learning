public class AnimalSystem
{
    public static void main (String[] args)
    {
        Dog d1= new Dog("Rocky","Golden Retriever",5);
        d1.setAge(6);
        d1.setBreed("German Shepherd");
        d1.display();
    }
}
class Animal
{
    private String name;
    private int age;
    Animal(String name,int age)
    {
        setName(name);
        setAge(age);
    }
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        if (name!=null)
        {
            this.name=name;
        }
    }
    int getAge()
    {
        return age;
    }
    void setAge(int age)
    {
        if (age>=1 && age<=100)
        {
            this.age=age;
        }
        else if (age<1)
        {
            this.age=1;
        }
        else if (age>100)
        {
            this.age=100;
        }
    }
    void display()
    {
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
    }
}
class Dog extends Animal
{
    private String breed;

    Dog(String name,String breed,int age)
    {
        super(name,age);
        setBreed(breed);
    }
    String getBreed()
    {
        return breed;
    }
    void setBreed(String breed)
    {
        if (breed!=null)
        {
            this.breed=breed;
        }
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Breed : "+getBreed());
    }
}