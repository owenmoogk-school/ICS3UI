import java.util.Scanner;

class Main {

  public static void drawBar(int number){
    int counter = 0;
    while (counter < number){
      System.out.print("*");
      counter++;
    }
    System.out.println();
  }

  public static void addSpaces(int number){
    int counter = 0;
    while (counter < number){
      System.out.print(" ");
      counter++;
    }
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int lines = input.nextInt()+1;

    int currentLine = 0;
    while (currentLine < lines){
      addSpaces(lines - currentLine);
      drawBar(1+((currentLine-1)*2));
      currentLine++;
    }
  }
}