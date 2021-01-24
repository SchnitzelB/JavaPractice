public class Vehicle {

    private int wheels;
    private int doors;
    private int color;
    private String changingGears;
    private int maxSpeed;

    public Vehicle(int wheels, int doors, int color, String changingGears, int maxSpeed) {
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
        this.changingGears = changingGears;
        this.maxSpeed = maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getColor() {
        return color;
    }

    public String getChangingGears() {
        return changingGears;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}
