public class EmployeeManagementSystem
{
    public static void main (String[] args)
    {
        Employee[] employees=new Employee[5];
        employees [0] = new Developer("Alex", 101, 5000, "Java", 2);

        employees [1] = new Developer("Emma", 102, 5500, "Spring", 3);

        employees [2] = new Manager("Michael", 201, 8000, 8, "IT");

        employees [3] = new Tester("Sophia", 301, 4200, "Selenium", true);

        employees [4] = new Tester("Daniel", 302, 4100, "JUnit", false);
        for(Employee employee : employees)
        {
            employee.work();
            employee.displayInfo();
        }
    }
}
class Employee
{
    private String Name;
    private int ID;
    private double Salary;
    Employee(String Name,int ID, double Salary)
    {
        setName(Name);
        setID(ID);
        setSalary(Salary);
    }
    String getName()
    {
        return Name;
    }
    void setName(String Name)
    {
        if (Name!=null)
        {
            this.Name=Name;
        }
    }
    int getID()
    {
        return ID;
    }
    void setID(int ID)
    {
           this.ID=ID;
    }
    double getSalary()
    {
        return Salary;
    }
    void setSalary(double Salary)
    {
        if (Salary<0)
        {
            this.Salary=0;
        }
        else
        {
            this.Salary=Salary;
        }
    }
    void work()
    {
        System.out.println("Employee is working.");
    }
    void displayInfo()
    {
        System.out.println(getName());
        System.out.println(getID());
        System.out.println(getSalary());
    }
}
class Developer extends Employee
{
    private String programmingLanguage;
    private int yearsOfExperience;
    Developer(String Name,int ID, double Salary,String programmingLanguage,int yearsOfExperience)
    {
        super(Name,ID,Salary);
        setProgrammingLanguage(programmingLanguage);
        setYearsOfExperience(yearsOfExperience);
    }
    String getProgrammingLanguage()
    {
        return programmingLanguage;
    }
    void setProgrammingLanguage(String programmingLanguage)
    {
        if (programmingLanguage!=null)
        {
            this.programmingLanguage=programmingLanguage;
        }
    }
    int getYearsOfExperience()
    {
        return yearsOfExperience;
    }
    void setYearsOfExperience(int yearsOfExperience)
    {
        if (yearsOfExperience<0)
        {
            this.yearsOfExperience=0;
        }
        else
        {
            this.yearsOfExperience=yearsOfExperience;
        }
    }
    @Override
    void work()
    {
        System.out.println("Developer is writing Java code.");
    }
}
class Manager extends Employee
{
    private int TeamSize;
    private String Department;
    Manager(String Name,int ID, double Salary,int TeamSize,String Department)
    {
        super(Name,ID,Salary);
        setTeamSize(TeamSize);
        setDepartment(Department);
    }
    int getTeamSize()
    {
        return TeamSize;
    }
    void setTeamSize(int TeamSize)
    {
        if(TeamSize<1)
        {
            this.TeamSize=1;
        }
        else
        {
            this.TeamSize=TeamSize;
        }
    }
    String getDepartment()
    {
        return Department;
    }
    void setDepartment(String Department)
    {
        if (Department!=null)
        {
            this.Department=Department;
        }
    }
    @Override
    void work()
    {
        System.out.println("Manager is managing the development team.");
    }
}
class Tester extends Employee
{
    private String TestingTool;
    private boolean Automation;
    Tester(String Name,int ID, double Salary,String TestingTool,boolean Automation)
    {
        super(Name,ID,Salary);
        setTestingTool(TestingTool);
        setAutomation(Automation);
    }
    String getTestingTool()
    {
        return  TestingTool;
    }
    void setTestingTool(String TestingTool)
    {
        if (TestingTool!=null)
        {
            this.TestingTool=TestingTool;
        }
    }
    boolean getAutomation()
    {
        return Automation;
    }
    void setAutomation(boolean Automation)
    {
        this.Automation=Automation;
    }
    @Override
    void work()
    {
        System.out.println("Tester is testing the application.");
    }
}