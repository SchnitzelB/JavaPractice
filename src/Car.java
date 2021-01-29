public class Car extends Vehicle{

    private String engine;
    private String color;
    private String manufacturerName;


    @Override
    public void moving(int velocity, int direction) {
        super.moving(velocity, direction);
    }

    public Car(int wheels, int doors, String transmissionType, String steeringType, int maxHorsePower, int currentVelocity, int currentDirection, String engine, String color, String manufacturerName) {
        super(4, doors, transmissionType, steeringType, maxHorsePower, currentVelocity, currentDirection);
        // In simple terms, this line, super(), basically calls and initializes the instance variables from the parent class.
        this.engine = engine;
        this.color = color;
        this.manufacturerName = manufacturerName;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    //    public void setModel(String model) {
//        String validModel = model.toLowerCase();
//        if (validModel.equals("carrera") || validModel.equals("commodore")) {
//            this.model = model;
//        } else {
//            this.model = "Unknown";
//        }
//    }



}

/* Using "this.~~~"
 * Using "this.~~~" allows the user to access the private data type,
 * without trying to access it directly.
 *
 * ALWAYS USE "this.~~~", DON'T CHANGE THE ACCESS
 * MODIFIER FROM PRIVATE TO PUBLIC.
 * */

/* Encapsulation
 * Used to hide the fields and methods
 * from public access, e.g., it will the class
 * will be hidden from view outside the object's definition.
 * */

//CLASSES MUST ALWAYS BE INITIALIZED!!!