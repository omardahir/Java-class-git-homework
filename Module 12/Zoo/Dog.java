public class Dog extends Animal{

  private String name;
  private String sound = "Bark";
  private String type = "Dog";

  Dog(String name){
    super(name);
  }
  public String getSound(){
    return sound;
  }
  public String getType() {
    return type;
  }
  public static void main(String args[]){
    Dog rex = new Dog("Dog Name");
    System.out.println("Name: " + rex.getName());
    System.out.println("Sound: " +rex.getSound());
    System.out.println("Type: " +rex.getType());
  }
}
