import java.util.*;
public class Main {
  public static void main(String[] args) {


    List<Animal> animals = new ArrayList<>();
    animals.add(new Cow("Cow", "Moo"));
    animals.add(new Cat("Cat", "Meow"));
    animals.add(new Dog("Dog", "Woof"));
    animals.add(new Duck("Duck", "Quack"));
    animals.add(new Horse("Horse", "Neigh"));


    System.out.println("Old MacDonald Had A Farm");
    System.out.println("Brought to you by Java!");
    System.out.println("");

    for(int i=1; i < animals.size(); i++ ) {
      animals.get(i).singVerse();
    }

    // TODO: create an array of Animal objects and call `singVerse()` on each of them
  }
}
