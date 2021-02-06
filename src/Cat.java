public class Cat extends Dog {
  
  public Cat (String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    super(coat, eyes, legs, tail, teeth, teeth, teeth, coat);
  }

  @Override
  public void walk() {
    System.out.println("Cat.walk() called");
  }

}
