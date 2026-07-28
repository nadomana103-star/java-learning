public class BankEmployeeSystem
{
    public static void main (String[] args)
    {
        Manager m1= new Manager("Aman",101,5000,5);
        Developer d1= new Developer("Alex",102,4000,"Java");
        m1.display();
        d1.display();
        d1.work();
    }
}
class Employee
{
    private String name;
    private int id;
    private double salary;
    Employee(String name,int id,double salary)
    {
        setName(name);
        setID(id);
        setSalary(salary);
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
    int getId()
    {
        return id;
    }
    void setID(int id)
    {
        if (id>=1 && id<=10000)
        {
            this.id=id;
        }
        else if (id<1)
        {
            this.id=1;
        }
        else if (id>10000)
        {
            this.id=10000;
        }
    }
    double getSalary()
    {
        return salary;
    }
    void setSalary(double salary)
    {
        if (salary>=0)
        {
            this.salary=salary;
        }
        if (salary<0)
        {
            this.salary=0;
        }
    }
    void display()
    {
        System.out.println("----- Employee -----");
        System.out.println("Name : "+getName());
        System.out.println("ID : "+getId());
        System.out.println("Salary : "+getSalary());
    }

    void work()
    {
        System.out.println("Employee is working");
    }
}
class Manager extends Employee
{
    private int teamSize;
    Manager(String name,int id,double salary,int teamSize)
    {
        super(name,id,salary);
        setTeamSize(teamSize);
    }
    int getTeamSize()
    {
        return teamSize;
    }
    void setTeamSize(int teamSize)
    {
        if (teamSize>=0)
        {
            this.teamSize=teamSize;
        }
        else
        {
            this.teamSize=0;
        }
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Team size : "+getTeamSize());
    }
    @Override
    void work()
    {
        System.out.println("Manager manages team");
    }
}
class Developer extends Employee
{
    private  String programmingLanguage;
    Developer(String name , int id, double salary,String programmingLanguage)
    {
        super(name,id,salary);
        setProgrammingLanguage(programmingLanguage);
    }
    String getProgrammingLanguage()
    {
        return programmingLanguage;
    }
    void setProgrammingLanguage(String programmingLanguage)
    {
        if (programmingLanguage!= null)
        {
            this.programmingLanguage=programmingLanguage;
        }
    }
    @Override
    void work()
    {
        System.out.println(
                "Developer writes " + programmingLanguage + " code"
        );
    }
}