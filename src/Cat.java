public class Cat extends Dog {
  
  public Cat (String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    super(name, size, weight, eyes, legs, tail, teeth, coat);
  }

  @Override
  public void walk() {
    System.out.println("Cat.walk() called");
    System.out.println("The " + getCoat() + " " +  getName() + " is now meowing!" + "\n" + "Great going slick!");
  }

}
