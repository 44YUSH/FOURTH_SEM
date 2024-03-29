class Rectangle
{
    private double length;
    private double width;

    public Rectangle()
    {
        this.length = 0;
        this.width = 0;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double Area()
    {
        return length * width;
    }

    public double Perimeter()
    {
        return 2 * (length + width);
    }
}

public class Q2
{
    public static void main(String[] args)
    {
        Rectangle property = new Rectangle();

        property.setLength(10.0);
        property.setWidth(3.5);

        System.out.println("Area: " + property.Area() + "\nPerimeter: " + property.Perimeter());
    }
}