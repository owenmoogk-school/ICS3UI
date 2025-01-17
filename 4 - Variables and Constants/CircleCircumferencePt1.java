import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the radius");
    double radius = input.nextInt();
    final double pi = 3.141592;
    double c = 2*pi*radius;
    System.out.println("The circumference is "+c);

  }
}