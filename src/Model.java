public class Model extends Car {

    private String modelName;
    private String bodyStyling;
    private int modelYear;

    public Model(int wheels, int doors, String transmissionType, String steeringType, int maxSpeed, String engine, String color, String manufacturerName,
                 String modelName, String bodyStyling, int modelYear) {
        super(4, doors, transmissionType, steeringType, maxSpeed, engine, color, manufacturerName);
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
}
