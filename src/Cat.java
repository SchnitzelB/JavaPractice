public class Cat extends Dog {
  
  public Cat(String breed, String coatColor, String sexType, String earType,int height, int weight) {
    super(breed, coatColor, sexType, earType, height, weight);
  }

  @Override
  public void isBarking() {
    System.out.println("The " + getBreed() + " is now meowing. Nice going!" + "\n" + "Meow!");
  }

}
