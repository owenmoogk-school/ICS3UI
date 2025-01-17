import java.util.Scanner;

class Main {
  
  public static int randomNum(){
    double num1 = Math.random();
    double num2 = (num1*13) + 1;
    int num3 = (int)num2;
    return num3;
  }
  
  
  
  public static void main(String[] args) {
    int score = 1000;
    int cont = 1;
    int risked = 0;
    int prediction = 0;
    int randNum;
    int level = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("RULES\nNumbers 1 - 6 are low\nNumber 8 - 13 are high\nNumber 7 is neither high or low\n");
    
    while (cont == 1 && score > 0){
      System.out.println("You have "+score+" points.");
      System.out.print("Enter points to risk: ");
      risked = input.nextInt();
      System.out.print("Predict (1 = High, 0 = Low): ");
      prediction = input.nextInt();
      while (prediction != 1 && prediction != 0){
        System.out.print("Please enter a valid number (1 or 0): ");
        prediction = input.nextInt();
      }
      randNum = randomNum();
      if (randNum <= 6 && randNum >= 1){
        level = 0;
      }
      if (randNum <= 13 && randNum >= 8){
        level = 1;
      }
      System.out.println("Number is "+randNum);
      if (level == prediction){
        score += risked*2;
        System.out.println("You now have "+score+" points.");
      }
      if (level != prediction){
        score = score - risked;
        System.out.println("You now have "+score+" points.");
      }
      System.out.print("Play again? 1 to continue, 0 to stop: ");
      cont = input.nextInt();
    }
    if (cont == 0){
      System.out.println("Thanks for playing!");
    }
    else if (score <= 0){
      System.out.println("You ran out of points. Better luck next time!");
    }
  }
}