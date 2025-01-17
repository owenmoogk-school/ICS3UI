import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the temperature in Fahrenheit");
    int temp = input.nextInt();
    double x = (double)temp - 32;
    double fin = 5.0/9.0 *x;
    System.out.println("The temp in Celsius is "+fin);
  }
}