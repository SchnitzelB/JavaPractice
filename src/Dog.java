public class Dog extends Animal {

    // You must have a constructor within the Dog class that
    // calls on the main constructor from Animal class to
    // utilize inheritance and avoid an error.

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);    //super() means to call a constructor from the class we are extending from.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    /* Overriding Methods
    * Creating a version of the same method from the Animal class,
    * but make it unique for the Dog class.
    * */

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
        /*
        * Because super.move(5); was used, dog.move() will not
        * be called. Instead, Animal.move() will be called because
        * super.move() indicates that the .move() method from the class
        * we are extending from will be called.
        *
        * E.g., only the move() method from the OG class is gonna be called.
        * */
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

}
