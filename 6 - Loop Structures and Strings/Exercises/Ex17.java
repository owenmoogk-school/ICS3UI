import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String guess = "";
    String password = "yeet";
    int counter = 0;
    while (counter != 3){
      System.out.print("Enter the password: ");
      guess = input.next();
      if (guess.equals("yeet") == false){
        System.out.println("The password you typed is incorrect");
      }
      counter++;
      if (guess.equals("yeet") == true){
        counter = counter-1;
        System.out.println("Welcome.");
        break;
      }
      if (counter == 3){
        System.out.println("Access Denied.");
        break;
      }
    }
  }
}