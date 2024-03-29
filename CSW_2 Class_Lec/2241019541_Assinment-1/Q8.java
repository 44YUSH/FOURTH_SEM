interface Vehicle
{
    void accelerate();
    void brake();
}

class Car1 implements Vehicle
{
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " mph...");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to " + speed + " mph over " + duration + " seconds...");
    }

    public void brake() {
        System.out.println("Car is braking...");
    }
}

class Bicycle implements Vehicle
{
    public void accelerate() {
        System.out.println("Bicycle is pedaling...");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is pedaling to reach " + speed + " mph...");
    }

    public void brake() {
        System.out.println("Bicycle is slowing down...");
    }
}

class Main1
{
    public static void main(String[] args)
    {
        Car1 myCar = new Car1();
        Bicycle myBicycle = new Bicycle();

        System.out.println("Car:");
        myCar.accelerate();
        myCar.accelerate(60);
        myCar.accelerate(80, 5);
        myCar.brake();

        System.out.println("\nBicycle:");
        myBicycle.accelerate();
        myBicycle.accelerate(40);
        myBicycle.brake();
    }
}
