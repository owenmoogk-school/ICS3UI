import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the desired amount");
    double desired = input.nextDouble();
    System.out.println("Enter the number of years");
    double years = input.nextDouble();
    System.out.println("Enter the interest rate");
    double interestRate = input.nextDouble();
    
    double principal = desired / (1 + (years*interestRate));
    System.out.println("The inital value needed is $"+principal);
  }
}