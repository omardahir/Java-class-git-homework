public class GoldenRetrever extends Dog{

  private String name;
  private String sound = "Bark";
  private String weight = "70 lbs";
  private String color = "light brown";
  private String height = "23 in";

  GoldenRetrever(String name){
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
    GoldenRetrever rex = new GoldenRetrever("Rex");
    System.out.println("Name: " + rex.getName());
    System.out.println("Sound: " +rex.getSound());
    System.out.println("Weight: "+rex.getWeight());
    System.out.println("Color: "+rex.getColor());
    System.out.println("Height: "+rex.getHeight());
  }
}
