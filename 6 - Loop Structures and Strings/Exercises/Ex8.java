import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    double doubleNumber = (Math.random()*20)+1;
    int number = (int) doubleNumber;

    int answer = 0;

    while (answer != number){
      System.out.print("Enter a number between 1 and 20: ");
      answer = input.nextInt();
      if (answer != number){
        System.out.println("Try again.");
      }
    }
    System.out.println("You won!!");
  }
}