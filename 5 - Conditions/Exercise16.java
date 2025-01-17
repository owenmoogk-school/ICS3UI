import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an angle in degrees: ");
    double degangle = input.nextDouble();

    double radangle = Math.toRadians(degangle);

    System.out.println("Sine: "+Math.sin(radangle));
    System.out.println("Cosine: "+Math.cos(radangle));
    System.out.println("Tangent: "+Math.tan(radangle));
  }
}