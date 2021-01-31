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

        System.out.println("Complex Operations Challenge");

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

        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"Long Silky");
        Fish fish = new Fish("Clownfish", 4,2,1,2,3);

        System.out.println("The " + dog.getName() + " weighs " + dog.getWeight() + " lbs.");
        dog.eat();
        dog.walk();
        //dog.run();
        fish.rest();

        /* METHOD OVERLOADING
        * Method overloading means defining a method in the child class that
        * already exists in the parent class with the same
        * signature (same name, same args).
        *
        * Method Overloading is AKA, Runtime Polymorphism and Dynamic Method Dispatch
        * because the method that will be called is decided at runtime by the
        * JVM!
        *
        * Only Instance Methods can be overridden, NOT STATIC METHODS.
        *
        * It is recommended to use '@Override' immediately above the method definition when overriding.
        * '@Override' is an annotation that the compiler reads and will decide if the method is
        * overridden properly.
        *
        *
        * */

        /* EXTENDING METHODS
        * By extending the parent class, the child class receives all the
        * methods defined in the parent class AKA Derived Methods.
        * */

        /*
        * */

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        System.out.println("Vehicle Operations Challenge");

        Vehicle vehicleOne = new Vehicle(4,2,"Automatic","Power Steering",500,0,0);
        Car car = new Car(vehicleOne.getWheels(), vehicleOne.getDoors(), vehicleOne.getTransmissionType(), vehicleOne.getSteeringType(),
                vehicleOne.getMaxHorsePower(), vehicleOne.getCurrentVelocity(), vehicleOne.getCurrentDirection(), "V8","Crimson Red","Chevrolet");

        Model modelOne = new Model(vehicleOne.getWheels(), vehicleOne.getDoors(), vehicleOne.getTransmissionType(), vehicleOne.getSteeringType(), vehicleOne.getMaxHorsePower(), vehicleOne.getCurrentVelocity(), vehicleOne.getCurrentDirection(), car.getEngine(), car.getColor(), car.getManufacturerName(), "Bel Air","Car",1959);
        Model modelTwo = new Model(vehicleOne.getWheels(), vehicleOne.getDoors(), vehicleOne.getTransmissionType(), vehicleOne.getSteeringType(), vehicleOne.getMaxHorsePower(), vehicleOne.getCurrentVelocity(), vehicleOne.getCurrentDirection(), car.getEngine(), car.getColor(), car.getManufacturerName(), "El Camino","Pickup Truck",1975);

        System.out.println(car.getTransmissionType());
        modelOne.moving(250,3);
        modelTwo.moving(500,2);
        modelTwo.noFuel();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        System.out.println("Cylinder Challenge");

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55,7.25);

        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volume = " + cylinder.getVolume());

        System.out.println();



    }


}





