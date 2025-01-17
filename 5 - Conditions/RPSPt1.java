import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    /*Get player choice*/
    System.out.println("Enter your choice (1 - Rock, 2 - Paper, 3 - Scissors)");
    int playerchoice = input.nextInt();
    
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
    if (playerchoice+1 == pcchoice || playerchoice-2 == pcchoice){
      System.out.println("Computer wins. Better luck next time.");
    }
    else{
      if(playerchoice == pcchoice){
        System.out.println("Tie! Try again.");
      }
      else{
        System.out.println("Player Wins! Congratulations!");
      }
    }
  }
}