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



        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

    }


}





