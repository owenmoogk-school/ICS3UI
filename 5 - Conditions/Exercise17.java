import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an angle in degrees: ");
    double degangle = input.nextDouble();

    double radangle = Math.toRadians(degangle);

    System.out.println("Arcsin: "+Math.asin(radangle));
    System.out.println("Arccos: "+Math.acos(radangle));
    System.out.println("Arctan: "+Math.atan(radangle));
  }
}