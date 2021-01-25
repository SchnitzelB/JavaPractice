public class Vehicle {

    private int wheels;
    private int doors;
    private String transmissionType;
    private String steeringType;
    private int maxHorsePower;

    public Vehicle(int wheels, int doors, String transmissionType, String steeringType, int maxHorsePower) {
        this.wheels = wheels;
        this.doors = doors;
        this.transmissionType = transmissionType;
        this.steeringType = steeringType;
        this.maxHorsePower = maxHorsePower;
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

    public void moving() {
        System.out.println("moving() method called. Vehicle is moving");
    }

    public int getMaxHorsePower() {
        return maxHorsePower;
    }

    public void noFuel() {
        System.out.println("noFuel() method called. Fuel tank is empty!");
    }


}
