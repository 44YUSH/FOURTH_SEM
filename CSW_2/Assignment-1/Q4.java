class Laptop
{
    private String model;
    private int price;

    public void set(String model, int price)
    {
        this.model = model;
        this.price = price;
    }

    public String toString()
    {
        return "Laptop Model: " + model + ", Price: ₹" + price;
    }
}

class Main2
{
    public static void main(String[] args)
    {
        Laptop britney = new Laptop();

        britney.set("HP Pavillion", 45000);

        System.out.println(britney.toString());
    }
}
