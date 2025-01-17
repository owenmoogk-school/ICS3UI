import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Input a time less than 4.5 seconds");
    double time = input.nextDouble();
    double height = 100 - (4.9*(time*time));
    System.out.println("The height is "+height);
  }
}