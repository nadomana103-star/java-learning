public class VehicleManagerSystem
{
    public static void main (String [] args)
    {
        Car c1= new Car("Toyota Corolla","Toyota",2020,180,20000,4,"Gasoline",5);
        Truck t1= new Truck("FH16","Volvo",2019,120,80000,25000,6,"Construction materials");
        Motorcycle m1= new Motorcycle("Ninja ZX-6R","Kawasaki",2022,260,15000,636,"Sport",true);
        c1.display();
        t1.display();
        m1.display();
        c1.setPrice(30000);
        t1.setCargoCapacity(300000);
        m1.setType("Not sport");
        c1.display();
        t1.display();
        m1.display();
        c1.drive();
        t1.drive();
        m1.drive();
    }
}
class Vehicle
{
    private String VehicleName;
    private String Brand;
    private int ProductionYear;
    private int MaximumSpeed;
    private double Price;
    Vehicle(String VehicleName,String Brand,int ProductionYear,int MaximumSpeed, double Price)
    {
        setVehicleName(VehicleName);
        setBrand(Brand);
        setProductionYear(ProductionYear);
        setMaximumSpeed(MaximumSpeed);
        setPrice(Price);
    }
    String getVehicleName()
    {
        return VehicleName;
    }
    void setVehicleName(String VehicleName)
    {
        if (VehicleName!=null)
        {
            this.VehicleName=VehicleName;
        }
    }
    String getBrand()
    {
        return Brand;
    }
    void setBrand(String Brand)
    {
        if (Brand!=null)
        {
            this.Brand=Brand;
        }
    }
    int getProductionYear()
    {
        return ProductionYear;
    }
    void setProductionYear(int ProductionYear)
    {
        if(ProductionYear < 1900)
        {
            this.ProductionYear = 1900;
        }
        else if(ProductionYear > 2026)
        {
            this.ProductionYear = 2026;
        }
        else
        {
            this.ProductionYear = ProductionYear;
        }
    }
    int getMaximumSpeed()
    {
        return MaximumSpeed;
    }
    void setMaximumSpeed(int MaximumSpeed)
    {
        if(MaximumSpeed<0)
        {
            this.MaximumSpeed=0;
        }
        else
        {
            this.MaximumSpeed=MaximumSpeed;
        }
    }
    double getPrice()
    {
        return Price;
    }
    void setPrice(double Price)
    {
        if (Price>=0)
        {
            this.Price=Price;
        }
    }
    void display()
    {
        System.out.println("Name : "+ getVehicleName());
        System.out.println("Brand : "+ getBrand());
        System.out.println("Production Year :"+getProductionYear());
        System.out.println("Maximum Speed :"+getMaximumSpeed());
        System.out.println("Price : "+getPrice());
    }
    void drive()
    {
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle
{
    private int doors;
    private String fuelType;
    private int seats;
    Car(String VehicleName,String Brand,int ProductionYear,int MaximumSpeed, double Price,int doors,String fuelType,int seats )
    {
        super(VehicleName,Brand,ProductionYear,MaximumSpeed,Price);
        setDoors(doors);
        setFuelType(fuelType);
        setSeats(seats);
    }
    int getDoors()
    {
       return doors;
    }
    void setDoors(int doors)
    {
        if (doors<1)
        {
            this.doors=1;
        }
        else
        {
            this.doors=doors;
        }
    }
    String getFuelType()
    {
        return fuelType;
    }
    void setFuelType(String fuelType)
    {
        if (fuelType!=null)
        {
            this.fuelType=fuelType;
        }
    }
    int getSeats()
    {
        return seats;
    }
    void setSeats(int seats)
    {
        if (seats<1)
        {
            this.seats=1;
        }
        else
        {
            this.seats=seats;
        }
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Doors : "+getDoors());
        System.out.println("Fuel type : "+getFuelType());
        System.out.println("Seats : "+getSeats());
    }
    @Override
    void drive()
    {
        System.out.println("Car is driving on the road");
    }
}
class Truck extends Vehicle
{
    private double cargoCapacity;
    private int wheels;
    private String cargoType;
    Truck(String VehicleName,String Brand,int ProductionYear,int MaximumSpeed, double Price,double cargoCapacity,int wheels,String cargoType)
    {
        super(VehicleName,Brand,ProductionYear,MaximumSpeed,Price);
        setCargoCapacity(cargoCapacity);
        setWheels(wheels);
        setCargoType(cargoType);
    }
    double getCargoCapacity()
    {
        return cargoCapacity;
    }
    void setCargoCapacity(double cargoCapacity)
    {
        if (cargoCapacity<0.0)
        {
            this.cargoCapacity=0.0;
        }
        else
        {
            this.cargoCapacity=cargoCapacity;
        }
    }
    int getWheels()
    {
        return wheels;
    }
    void setWheels(int wheels)
    {
        if (wheels<4)
        {
            this.wheels=4;
        }
        else
        {
            this.wheels=wheels;
        }
    }
    String getCargoType()
    {
        return cargoType;
    }
    void setCargoType(String cargoType)
    {
        if (cargoType!=null)
        {
            this.cargoType=cargoType;
        }
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Cargo capacity : "+getCargoCapacity());
        System.out.println("Wheels : "+getWheels());
        System.out.println("Cargo type : "+getCargoType());

    }
    @Override
    void drive()
    {
        System.out.println("Truck is transporting cargo");
    }
}
class Motorcycle extends Vehicle
{
    private double engineCapacity;
    private String type;
    private boolean hasABS;
    Motorcycle(String VehicleName,String Brand,int ProductionYear,int MaximumSpeed, double Price,double engineCapacity,String type,boolean hasABS)
    {
        super(VehicleName,Brand,ProductionYear,MaximumSpeed,Price);
        setEngineCapacity(engineCapacity);
        setType(type);
        setHasABS(hasABS);
    }
    double getEngineCapacity()
    {
        return engineCapacity;
    }
    void setEngineCapacity(double engineCapacity)
    {
        if(engineCapacity<0)
        {
            this.engineCapacity=0;
        }
        else
        {
            this.engineCapacity=engineCapacity;
        }
    }
    String getType()
    {
        return type;
    }
    void setType(String type)
    {
        if(type!=null)
        {
            this.type=type;
        }
    }
    boolean getHasABS()
    {
        return hasABS;
    }
    void setHasABS(boolean hasABS)
    {
        this.hasABS=hasABS;
    }
    @Override
    void display()
    {
         super.display();
         System.out.println("Engine capacity : "+getEngineCapacity());
         System.out.println("Motorcycle type : "+getType());
         System.out.println("ABS : "+getHasABS());
    }
    @Override
    void drive()
    {
        System.out.println("Motorcycle is riding fast");
    }
}