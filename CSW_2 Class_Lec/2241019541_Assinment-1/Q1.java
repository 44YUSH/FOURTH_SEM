class Car 
{
    private String make;
    private String model;

    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
}
class CartEster
{
    public static void main(String[] args)
    {
        Car myCar1 = new Car("Toyota", "Camry");
        Car myCar2 = new Car(null, null);

        System.out.println("myCar1 - Make: " + myCar1.getMake() + ", Model: " + myCar1.getModel());
        System.out.println("myCar2 - Make: " + myCar2.getMake() + ", Model: " + myCar2.getModel());

        myCar2.setMake("TATA");
        myCar2.setModel("Nano");

        System.out.println("\nUpdated myCar2 - Make: " + myCar2.getMake() + ", Model: " + myCar2.getModel());
    }
}
