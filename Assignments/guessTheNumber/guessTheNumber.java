import java.util.Scanner;
import java.util.Random;

public class guessTheNumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random rdm = new Random();
    int myNumber = rdm.nextInt(500) - 250;

    System.out.println("Hello, guess a number between -250 and 250:");
    int input = Integer.parseInt(sc.nextLine());
    while(input != myNumber) {
      if (input < myNumber) {
        System.out.println("The number that you entered is too low");
      }
      else if (input > myNumber) {
        System.out.println("The number that you entered is too high");
      }
      else if (input == myNumber) {
        break;
      }
        input = Integer.parseInt(sc.nextLine());
    }
    System.out.println("You entered the right Number");
  }
}
