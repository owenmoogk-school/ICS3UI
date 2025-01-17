import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    /*Get player choice*/
    System.out.println("Enter your choice (1 - Rock, 2 - Paper, 3 - Scissors)");
    int playerchoice = input.nextInt();
    
    /*Checks number is valid*/
    if (playerchoice == 1 || playerchoice == 2 || playerchoice == 3){

      /*Display player choice*/
      switch(playerchoice){
        case 1: System.out.println("Player Throws Rock"); break;
        case 2: System.out.println("Player Throws Paper"); break;
        case 3: System.out.println("Player Throws Scissors"); break;
      }

      /*Get pc choice*/
      double choice = (3*(Math.random()))+1;
      int pcchoice = (int)choice;
      
      /*Display pc choice*/
      switch(pcchoice){
        case 1: System.out.println("Computer Throws Rock"); break;
        case 2: System.out.println("Computer Throws Paper"); break;
        case 3: System.out.println("Computer Throws Scissors"); break;
      }

      /*determine winner*/
      switch(pcchoice){
        case 1: if (pcchoice == 1){
          System.out.println("Tie! Try again.");
        }
        else{
          if (pcchoice == 2){
            System.out.println("Compter wins. Better luck next time.");
          }
          else{
            System.out.println("Player Wins! Congratulations!");
          }
        }
        break;
        case 2: if (pcchoice == 2){
          System.out.println("Tie! Try again.");
        }
        else{
          if (pcchoice == 3){
            System.out.println("Compter wins. Better luck next time.");
          }
          else{
            System.out.println("Player Wins! Congratulations!");
          }
        }
        break;
        case 3: if (pcchoice == 3){
          System.out.println("Tie! Try again.");
        }
        else{
          if (pcchoice == 1){
            System.out.println("Compter wins. Better luck next time.");
          }
          else{
            System.out.println("Player Wins! Congratulations!");
          }
        }
        break;
      }
    }

    /*Give error message*/
    else{
      System.out.println("Invalid, please try again.");
    }
  }
}