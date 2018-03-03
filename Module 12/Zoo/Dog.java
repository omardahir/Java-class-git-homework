public class Dog extends Animal{

  private String name;
  private String sound = "Bark";

  Dog(String name){
    super(name);
  }
  public String getSound(){
    return sound;
  }
  public static void main(String args[]){
    Dog rex = new Dog("Dog Name");
    System.out.println("Name: " + rex.getName());
    System.out.println("Sound: " +rex.getSound());
  }
}
