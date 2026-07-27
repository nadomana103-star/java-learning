public class GameCharacterSystem
{
    public static void main(String[] args)
    {
        Weapon w1=new Weapon("Excalibur",100,5);
        Characters c1=new Characters("Knight",100,4,w1);
        Characters c2=new Characters("Mage",150,6,w1);
        w1.upgradeDamage(10);
        c1.display();
        c2.display();
        Weapon w2=new Weapon("Dark Sword",200,10);
        c2.setWeapon(w2);
        c1.attack(c2);
        c2.attack(c1);
        c1.takeDamage(20);
        c1.display();
        c2.display();
    }
}
class  Weapon
{
    private String name;
    private int damage;
    private int level;
    Weapon(String name,int damage,int level)
    {
        this.name=name;
        this.damage=damage;
        this.level=level;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void setDamage(int damage)
    {
        if(damage >= 0)
        {
            this.damage = damage;
        }
    }
    int getDamage()
    {
        return damage;
    }
    void setLevel(int level)
    {
        if (level>=1 && level<=100)
        {
            this.level=level;
        }
        else if (level>100)
        {
            this.level=100;
        }
    }
    int getLevel()
    {
        return level;
    }
    void upgradeDamage(int damage)
    {
        setDamage(getDamage()+damage);
    }
    void display()
    {
        System.out.println("----- Weapon Information -----");
        System.out.println("Name: "+getName());
        System.out.println("Damage: "+getDamage());
        System.out.println("Level: "+getLevel());
    }
}
class Characters
{
    private  String name;
    private int health;
    private int level;
    private  Weapon weapon;
    Characters(String name,int health,int level,Weapon weapon)
    {
        this.name=name;
        setHealth(health);
        setLevel(level);
        setWeapon(weapon);
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void setHealth(int health)
    {
        if(health < 0)
        {
            this.health = 0;
        }
        else if(health > 1000)
        {
            this.health = 1000;
        }
        else
        {
            this.health = health;
        }
    }
    int getHealth()
    {
        return health;
    }
    void setLevel(int level)
    {
        if (level>=1 && level<=100)
        {
            this.level=level;
        }
    }
    int getLevel()
    {
        return level;
    }
    void setWeapon(Weapon weapon)
    {
        if(weapon != null)
        {
            this.weapon = weapon;
        }
    }
    Weapon getWeapon()
    {
        return weapon;
    }
    void takeDamage(int damage)
    {
        if(damage > 0)
        {
            setHealth(health - damage);
        }
    }
    void attack(Characters other)
    {
        other.takeDamage(weapon.getDamage());
    }
    void display()
    {
        System.out.println("Name: "+getName());
        System.out.println("Health: "+getHealth());
        System.out.println("Level: "+getLevel());
        weapon.display();
    }
}

