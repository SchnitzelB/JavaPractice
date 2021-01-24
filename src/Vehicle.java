public class Vehicle {

    private int wheels;
    private int doors;
    private String transmissionType;
    private String steeringType;
    private int maxSpeed;

    public Vehicle(int wheels, int doors, String transmissionType, String steeringType, int maxSpeed) {
        this.wheels = wheels;
        this.doors = doors;
        this.transmissionType = transmissionType;
        this.steeringType = steeringType;
        this.maxSpeed = maxSpeed;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }


}
