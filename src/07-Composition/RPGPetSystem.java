public class RPGPetSystem
{
    public static void main (String[] args)
    {
        Pet p1= new Pet("Taska","XZ",10);
        Player player1= new Player("Aman",80,p1);
        Pet p2 =new Pet("Ne Taska","XZ1",15);
        p1.levelUp();
        p1.levelUp();
        p1.levelUp();
        p1.levelUp();
        player1.display();
        player1.changePet(p2);
        p2.levelUp();
        player1.display();
    }
}
class Pet
{
    private String name;
    private String species;
    private int level;
    Pet(String name,String species,int level)
    {
        this.name=name;
        this.species=species;
        this.level=level;
    }
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getSpecies()
    {
        return species;
    }
    void setSpecies(String species)
    {
        this.species=species;
    }
    int getLevel()
    {
        return level;
    }
    void setLevel(int level)
    {
        if (level>=1 && level<=100)
        {
            this.level=level;
        }
        else if (level<1)
        {
            this.level=1;
        }
        else if (level>100)
        {
            this.level=100;
        }
    }
    void levelUp()
    {
        setLevel(getLevel()+1);
    }
    void display()
    {
        System.out.println("----- Pet -----");
        System.out.println("Name: "+getName());
        System.out.println("Species: "+getSpecies());
        System.out.println("Level: "+getLevel());
    }
}
class Player
{
    private String name;
    private int level;
    private Pet pet;
    Player(String name,int level,Pet pet)
    {
        this.name=name;
        this.level=level;
        this.pet=pet;
    }
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name=name;
    }
    int getLevel()
    {
        return level;
    }
    void setLevel(int level)
    {
        if (level>=1 && level<=100)
        {
            this.level=level;
        }
        else if (level<1)
        {
            this.level=1;
        }
        else if (level>100)
        {
            this.level=100;
        }
    }
    Pet getPet()
    {
        return pet;
    }
    void setPet(Pet pet)
    {
        this.pet=pet;
    }
    void changePet(Pet pet)
    {
        setPet(pet);
    }
    void display()
    {
        System.out.println("----- Player -----");
        System.out.println("Name: "+getName());
        System.out.println("Level: "+getLevel());
        pet.display();
    }
}