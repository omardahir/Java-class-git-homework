public class Pomeranian extends Dog{

  private String name;
  private String sound = "Bark";
  private String weight = "5.5 lbs";
  private String color = "white";
  private String height = "9 in";

  Pomeranian(String name){
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
    Pomeranian Max = new Pomeranian("Max");
    System.out.println("Name: " + Max.getName());
    System.out.println("Type: " + rex.getType());
    System.out.println("Sound: " +Max.getSound());
    System.out.println("Weight: "+Max.getWeight());
    System.out.println("Color: "+Max.getColor());
    System.out.println("Height: "+Max.getHeight());
  }
}
