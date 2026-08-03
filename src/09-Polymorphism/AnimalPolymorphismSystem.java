public class AnimalPolymorphismSystem
{
    public static void main (String[] args)
    {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Rocky",3,"Golden");
        animals[1] = new Cat("Milo",2,"White");
        animals[2] = new Bird("Sky",1,true);
        for(Animal animal : animals)
        {
            animal.makeSound();
        }
    }
}
class Animal
{
    String name;
    int age;

    Animal(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }

    void makeSound()
    {
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal
{
    String breed;

    Dog(String name,int age,String breed)
    {
        super(name,age);
        this.breed=breed;
    }

    @Override
    void makeSound()
    {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal
{
    String color;

    Cat(String name,int age,String color)
    {
        super(name,age);
        this.color=color;
    }

    @Override
    void makeSound()
    {
        System.out.println("Cat is meowing");
    }
}
class Bird extends Animal
{
    boolean canFly;

    Bird(String name,int age,boolean canFly)
    {
        super(name,age);
        this.canFly=canFly;
    }

    @Override
    void makeSound()
    {
        System.out.println("Bird is singing");
    }
}