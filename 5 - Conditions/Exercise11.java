import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //get values

    System.out.print("Enter a value for A: ");
    double a = input.nextDouble();
    System.out.print("Enter a value for B: ");
    double b = input.nextDouble();
    System.out.print("Enter a value for C: ");
    double c = input.nextDouble();

    double discriminant = (b*b) - (4*a*c);

    //check number of roots

    int roots = 0;

    if (discriminant > 0){
      roots = 2;
    }
    if (discriminant < 0){
      roots = 0;
    }
    if (discriminant == 0){
      roots = 1;
    }

    //find roots (if any) and display

    if (roots == 1){
      double root = (-b) / (2*a);
      System.out.println("The root is "+root);
    }
    if (roots == 0){
      System.out.println("There are no roots");
    }
    if (roots == 2){
      double rootdisc = Math.sqrt(discriminant);
      double root1 = ((-b)+rootdisc) / (2*a);
      double root2 = ((-b)-rootdisc) / (2*a);
      System.out.println("The roots are "+ root1 +" and "+ root2);
    }
  }
}