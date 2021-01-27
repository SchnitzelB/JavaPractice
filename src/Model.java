public class Model extends Car {

    private String modelName;
    private String bodyStyling;
    private int modelYear;

    public Model(int wheels, int doors, String transmissionType, String steeringType, int maxHorsePower, int currentVelocity, int currentDirection, String engine, String color, String manufacturerName,
                 String modelName, String bodyStyling, int modelYear) {
        super(4, doors, transmissionType, steeringType, maxHorsePower, currentVelocity, currentDirection, engine, color, manufacturerName);
        this.modelName = modelName;
        this.bodyStyling = bodyStyling;
        this.modelYear = modelYear;
    }

    public String getModelName() {
        return modelName;
    }

    public String getBodyStyling() {
        return bodyStyling;
    }

    public int getModelYear() {
        return modelYear;
    }

    @Override
    public void moving(int velocity, int direction) {
        super.moving();
        System.out.println("The " + getModelYear() + " " + getManufacturerName() + " " + getModelName() + " has approximately " + getMaxHorsePower() + " horsepower!");

    }

    @Override
    public void noFuel() {
        super.noFuel();
        int empty = super.getMaxHorsePower();
        empty -= empty;
        System.out.println("The empty fuel tank for the " + getModelYear() + " " + getManufacturerName() + " " + getModelName() + " now has " + empty + " horsepower!");
    }
}
