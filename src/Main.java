public class Main {

    public static void main(String[] args) {

        //Person Challenge begins here
        System.out.println("Person Challenge");
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName());

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        // Wall Area Challenge begins here
        System.out.println("Wall Area Challenge");

        Wall wall = new Wall(5,5);
        //This sets the instance variables within the
        //Wall class.
        //private double width = 5;
        //private double height = 5;

        System.out.println("Area = "  + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        System.out.println("Point Challenge");

        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println("Distance(0,0) = " + first.distance());
        System.out.println("Distance(second) = " + second.distance(second));
        System.out.println("Distance(2,2) = " + first.distance(2,2));

        Point point = new Point();

        System.out.println("Distance() = " + point.distance());

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        System.out.println("Complex Number Challenge");

        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);

        one.add(1,1);

        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

        one.subtract(number);

        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

        number.subtract(one);

        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

    }


}





