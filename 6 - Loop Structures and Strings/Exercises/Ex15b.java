import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value between 2 and 4 (inclusive): ");
    double y = input.nextDouble();

    int counter = 0;
    double x = 0.5;

    while (counter < 50){
      x = y*x*(1-x);
      System.out.println(x);
      counter++;
    }
  }
}