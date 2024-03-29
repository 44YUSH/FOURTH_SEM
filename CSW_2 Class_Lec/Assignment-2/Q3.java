class Car implements Comparable<Car>
{
    private String Color;
    private String Model;
    private double Speed;

    public Car(String Color, String Model, double Speed)
    {
        this.Color = Color;
        this.Model = Model;
        this.Speed = Speed;
    }

    public String getModel()
    {
        return Model;
    }

    public String toString()
    {
        return "Car [Color=" + Color + ", Model=" + Model + ", Speed=" + Speed + "]";
    }

    public boolean equals(Car other)
    {
        if (this.Speed == other.Speed && this.Color.equals(other.Color) && this.Model.equals(other.Model))
            return true;

        if (other == null || getClass() != other.getClass())
            return false;

        Car otherCar = (Car) other;
        return Speed == otherCar.Speed && this.Color.equals(otherCar.Color) && this.Model.equals(otherCar.Model);
    }

    public int compareTo(Car otherCar)
    {
        return Double.compare(this.Speed, otherCar.Speed);
    }
}

public class Q3
{
    public static void main(String[] args)
    {
        Car C1 = new Car("Red", "Alto", 15.99);
        Car C2 = new Car("Blue", "Nano", 12.99);

        System.out.println(C1);
        System.out.println(C2);

        if (C1.compareTo(C2) > 0)
            System.out.println(C1.getModel() + " is Faster than " + C2.getModel());
        else if (C1.compareTo(C2) < 0)
            System.out.println(C1.getModel() + " is Slower than " + C2.getModel());
        else
            System.out.println("Same");
    }
}