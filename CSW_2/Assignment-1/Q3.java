class Point
{
    private int X;
    private int Y;

    public Point(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }

    public Point(Point augotePoint) 
    {                                   // copy
        this.X = augotePoint.X;
        this.Y = augotePoint.Y;
    }

    public int getX()
    {
        return X;
    }

    public int getY()
    {
        return Y;
    }

    public void set(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }

    public static void main(String[] args)
    {
        Point point1 = new Point(5, 10);
        Point point2 = new Point(point1); //copy

        System.out.println("Original: (" + point1.getX() + ", " + point1.getY()+")");
        System.out.println("CopY: (" + point2.getX() + ", " + point2.getY()+")");

        point2.set(20, 30); // ModifY point2

        System.out.println("\nAfter modifYing point2: ");
        System.out.println("Original: (" + point1.getX() + ", " + point1.getY()+")");
        System.out.println("CopY: (" + point2.getX() + ", " + point2.getY()+")");
    }
}