public class Cow extends Animal{

  private String name;
  private String sound = "Moo...";
  private String color = "brown";
  private String weight = "2,400lbs";
  private String height = "4ft";

  Cow(String name){
    super(name);
  }

  public String getSound(){
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
    Cow beefy = new Cow("beefy");
    System.out.println("Name: " + beefy.getName());
    System.out.println("Sound: " + beefy.getSound());
    System.out.println("Color: " + beefy.getColor());
    System.out.println("Weight: " + beefy.getWeight());
    System.out.println("Height: " + beefy.getHeight());
  }
}
