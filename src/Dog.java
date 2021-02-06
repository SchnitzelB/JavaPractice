public class Dog {

  private String breed;
  private String coatColor;
  private String sexType;
  private String earType;

  private int height;
  private int weight;

  public Dog(String breed, String coatColor, String sexType, String earType,int height, int weight) {
    this.breed = breed;
    this.coatColor = coatColor;
    this.sexType = sexType;
    this.earType = earType;
    this.height = height;
    this.weight = weight;
  }

  public String getBreed() {
    return breed;
  }

  public String getCoatColor() {
    return coatColor;
  }

  public String getSexType() {
    return sexType;
  }

  public String getEarType() {
    return earType;
  }

  public int getHeight() {
    return height;
  }

  public int getWeight() {
    return weight;
  }

  public void isBarking() {
    System.out.println("The " + getBreed() + " is barking!" + "\n" + 
    "Woof!");
  }

}