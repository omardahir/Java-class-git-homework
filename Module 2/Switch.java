public class Switch {
  public static void main(String[] args){
int myNum = 10;

switch(myNum % 2) {
  case 0:
  System.out.print(myNum);
  System.out.println(" is even");
  break;
  case 1:
  System.out.print(myNum);
  System.out.println(" is odd");
  break;
  default:
  System.out.println("Code is wrong");
    }
  }
}
