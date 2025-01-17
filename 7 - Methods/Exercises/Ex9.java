import java.util.Scanner;

class Main {

  public static int randomStones() {
    double num1 = Math.random();
    double num2 = (num1 * 16 ) + 15;
    int num3 = (int) num2;
    return num3;
  }

  public static boolean isValidInput(int number) {
    if (number <= 3 && number >= 1) {
      return true;
    } else {
      return false;
    }
  }

  public static int randomChoice() {
    double num1 = Math.random();
    double num2 = (num1 * 3) + 1;
    int num3 = (int) num2;
    return num3;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int stones = randomStones();
    int computerChoice = 0;

    while (stones > 0) {
      System.out.print("There are " + stones + " stones. How many would you like? ");
      int playerChoice = input.nextInt();
      boolean isValidInput = isValidInput(playerChoice);
      while (isValidInput == false || playerChoice > stones) {
        System.out.print("Please enter a valid number: ");
        playerChoice = input.nextInt();
        isValidInput = isValidInput(playerChoice);
      }
      stones = stones - playerChoice;
      if (stones <= 0) {
        System.out.println("Computer wins!");
        break;
      }
      computerChoice = randomChoice();
      while (computerChoice > stones) {
        computerChoice = randomChoice();
      }
      System.out.println("There are " + stones + " stones. The computer takes " + computerChoice + " stones.");
      stones = stones - computerChoice;
      if (stones <= 0) {
        System.out.println("Player wins!");
        break;
      }
    }
  }
}