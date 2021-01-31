public class Cuboid extends Rectangle {

    private double height;

    //CONSTRUCTOR
    public Cuboid(double width, double length, double height) {
        super(width, length); //This super call is required to properly extend the Rectangle class.

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Height getter
    public double getHeight() {
        return height;
    }

    //Volume getter
    public double getVolume() {
        return getArea() * getHeight();
    }
}
