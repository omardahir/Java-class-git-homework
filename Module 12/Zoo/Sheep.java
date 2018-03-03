
public class Sheep extends Animal{

  private String name;
  private String sound = "Baahahaa...";
  private String color = "white";
  private String weight = "220";
  private String height = "4ft";

  Sheep(String name){
    super(name);
  }
  public String getSound() {
    return sound;
  }
  public String getColor() {
    return color;
  }
  public String getWeight() {
    return weight;
  }
  public String getHeight() {
    return height;
  }

  public static void main(String args[]){
    Sheep shelly = new Sheep("Shelly");
    System.out.println("Name: " + shelly.getName());
    System.out.println("Sound: " +shelly.getSound());
    System.out.println("Color: " +shelly.getColor());
    System.out.println("Weight: " +shelly.getWeight());
    System.out.println("Height: " +shelly.getHeight());

  }
}
