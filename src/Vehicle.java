public class Vehicle {

    private int wheels;
    private int doors;
    private String transmissionType;
    private String steeringType;
    private int maxHorsePower;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(int wheels, int doors, String transmissionType, String steeringType, int maxHorsePower, int currentVelocity, int currentDirection) {
        this.wheels = wheels;
        this.doors = doors;
        this.transmissionType = transmissionType;
        this.steeringType = steeringType;
        this.maxHorsePower = maxHorsePower;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void moving(int velocity, int direction) {
        System.out.println("moving() method called. Vehicle is moving");
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);

    }

    public int getMaxHorsePower() {
        return maxHorsePower;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void noFuel() {
        System.out.println("noFuel() method called. Fuel tank is empty!");
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }


}
