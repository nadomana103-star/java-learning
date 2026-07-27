public class FoodDeliverySystem
{
    public static void main (String [] args)
    {
        Restaurant r1=new Restaurant("Burger House","25 Green Street",4.6);
        Restaurant r2=new Restaurant("Sushi World","88 Ocean Avenue",4.9);
        Order o1=new Order("Aman",35.50,r1);
        o1.display();
        o1.applyDiscount(20);
        o1.display();
        r1.changeRating(4.8);
        o1.display();
        o1.changeRestaurant(r2);
        r2.changeRating(5.0);
        o1.display();
    }
}
class Restaurant
{
    private String name;
    private String address;
    private double rating;
    Restaurant(String name,String address,double rating)
    {
     setName(name);
     setAddress(address);
     setRating(rating);
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
    String getAddress()
    {
        return address;
    }
    void setAddress(String address)
    {
        if (address!=null)
        {
            this.address=address;
        }
    }
    double getRating()
    {
        return rating;
    }
    void setRating(double rating)
    {
        if (rating>=0.0 && rating<=5.0)
        {
            this.rating=rating;
        }
        else if (rating<0.0)
        {
            this.rating=0.0;
        }
        else if (rating>5.0)
        {
            this.rating=5.0;
        }
    }
    void changeRating(double rating)
    {
        setRating(rating);
    }
    void display()
    {
        System.out.println("Restaurant name : "+getName());
        System.out.println("Address : "+getAddress());
        System.out.println("Rating : "+getRating());
    }
}
class Order
{
    private String customerName;
    private  double totalPrice;
    private Restaurant restaurant;
    Order(String customerName,double totalPrice,Restaurant restaurant)
    {
        setCustomerName(customerName);
        setTotalPrice(totalPrice);
        setRestaurant(restaurant);
    }
    String getCustomerName()
    {
        return customerName;
    }
    void setCustomerName(String customerName)
    {
        if (customerName!=null)
        {
            this.customerName=customerName;
        }
    }
    double getTotalPrice()
    {
        return totalPrice;
    }
    void setTotalPrice(double totalPrice)
    {
        if (totalPrice>=0 )
        {
            this.totalPrice=totalPrice;
        }
    }
    Restaurant getRestaurant()
    {
        return restaurant;
    }
    void setRestaurant(Restaurant restaurant)
    {
        if (restaurant!=null)
        {
            this.restaurant=restaurant;
        }
    }
    void changeRestaurant(Restaurant restaurant)
    {
        setRestaurant(restaurant);
    }
    void applyDiscount(int percent)
    {
        setTotalPrice(getTotalPrice()-(getTotalPrice()*percent)/100);
    }
    void display()
    {
        System.out.println("Customer : "+getCustomerName());
        System.out.println("Price : "+getTotalPrice());
        System.out.println("Restaurant");
        getRestaurant().display();
    }
}