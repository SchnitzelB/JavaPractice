public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

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