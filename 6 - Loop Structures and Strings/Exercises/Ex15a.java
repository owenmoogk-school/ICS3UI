import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a starting number: ");
    double x = input.nextDouble();

    int counter = 0;

    while (counter < 50){
      x = 2*x*(1-x);
      System.out.println(x);
      counter++;
    }
  }
}