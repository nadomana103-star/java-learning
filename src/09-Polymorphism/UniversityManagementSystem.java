public class UniversityManagementSystem
{
    public static void main (String[] args)
    {
        Person [] people=new Person[5];
        people[0] = new Student(
                "Alex",
                20,
                1001,
                "Software Engineering",
                3.8
        );

        people[1] = new Student(
                "Emma",
                19,
                1002,
                "Computer Science",
                3.6
        );

        people[2] = new Professor(
                "Michael",
                45,
                "Computer Science",
                18
        );

        people[3] = new Professor(
                "Sophia",
                50,
                "Mathematics",
                25
        );

        people[4] = new ResearchAssistant(
                "Daniel",
                24,
                "Artificial Intelligence",
                1200
        );
        for (Person person : people)
        {
            person.displayInfo();
            person.performRole();
            System.out.println();
        }
    }
}
class Person
{
    private String name;
    private int age;
    Person(String name, int age)
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
        if(name!=null)
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
        if (age<16)
        {
            this.age=16;
        }
        else if (age>100)
        {
            this.age=100;
        }
        else
        {
            this.age=age;
        }
    }
    void displayInfo()
    {
        System.out.println(getName());
        System.out.println(getAge());
    }
    void performRole()
    {
        System.out.println("Person performs a role.");
    }
}
class Student extends Person
{
    private int studentID;
    private String major;
    private double gpa;
    Student(String name, int age,int studentID,String major,double gpa)
    {
        super(name,age);
        setStudentID(studentID);
        setMajor(major);
        setGPA(gpa);
    }
    int getStudentID()
    {
        return studentID;
    }
    void setStudentID(int studentID)
    {
        if (studentID<1)
        {
            this.studentID=1;
        }
        else
        {
            this.studentID=studentID;
        }
    }
    String getMajor()
    {
        return major;
    }
    void setMajor(String major)
    {
        if (major!=null)
        {
            this.major=major;
        }
    }
    double getGPA()
    {
        return gpa;
    }
    void setGPA(double gpa)
    {
        if (gpa<0.0)
        {
            this.gpa=0.0;
        }
        else if (gpa>4.0)
        {
            this.gpa=4.0;
        }
        else
        {
            this.gpa=gpa;
        }
    }
    @Override
    void performRole()
    {
        System.out.println("Student is studying.");
    }
}
class Professor extends Person
{
    private String department;
    private int yearsOfExperience;
    Professor(String name, int age,String department,int yearsOfExperience)
    {
        super(name,age);
        setDepartment(department);
        setYearsOfExperience(yearsOfExperience);
    }
    String getDepartment()
    {
        return department;
    }
    void setDepartment(String department)
    {
        if (department!=null)
        {
            this.department=department;
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
    void performRole()
    {
        System.out.println("Professor is teaching students.");
    }
}
class ResearchAssistant extends Person
{
    private String researchTopic;
    private double monthlyScholarship;
    ResearchAssistant(String name, int age,String researchTopic,double monthlyScholarship)
    {
        super(name,age);
        setResearchTopic(researchTopic);
        setMonthlyScholarship(monthlyScholarship);
    }
    String getResearchTopic()
    {
        return researchTopic;
    }
    void setResearchTopic(String researchTopic)
    {
        if (researchTopic!=null)
        {
            this.researchTopic=researchTopic;
        }
    }
    double getMonthlyScholarship()
    {
        return monthlyScholarship;
    }
    void setMonthlyScholarship(double monthlyScholarship)
    {
        if (monthlyScholarship<0)
        {
            this.monthlyScholarship=0;
        }
        else
        {
            this.monthlyScholarship=monthlyScholarship;
        }
    }
    @Override
    void performRole()
    {
        System.out.println("Research assistant is conducting research.");
    }
}