public class Huskey extends Dog{

  private String name;
  private String sound = "Bark";
  private String weight = "52 lbs";
  private String color = "white";
  private String height = "23 in";

  Huskey(String name){
    super(name);
  }
  public String getSound(){
    return sound;
  }
  public String getWeight() {
    return weight;
  }
  public String getColor() {
    return color;
  }
  public String getHeight() {
    return height;
  }
  public static void main(String args[]){
    Huskey Snow = new Huskey("Snow");
    System.out.println("Name: " + Snow.getName());
    System.out.println("Sound: " +Snow.getSound());
    System.out.println("Weight: "+Snow.getWeight());
    System.out.println("Color: "+Snow.getColor());
    System.out.println("Height: "+Snow.getHeight());
  }
}
