import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    int position = 4;
    int movementCounter = 0;
    int counter = 0;
    int longestMovement = 0;
    int totalMoves = 0;


    while (counter < 50){
      position = 4;
      movementCounter = 0;
      while (position != 0 && position != 8){
        int direction = (int)(Math.random()*2);
        if (direction == 1){
          position = position - 1;
          movementCounter++;
        }
        if (direction == 0){
          position = position + 1;
          movementCounter++;
        }
      }
      if (movementCounter > longestMovement){
        longestMovement = movementCounter;
      }
      totalMoves += movementCounter;
      counter++;
    }

    double avgMoves = totalMoves/50;

    System.out.println("The greatest number of steps taken in the 50 tries is "+longestMovement);
    System.out.println("The average moves before reaching an end is "+avgMoves);
  }
}