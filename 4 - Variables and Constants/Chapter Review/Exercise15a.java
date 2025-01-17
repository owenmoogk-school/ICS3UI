import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the principal amount");
    double principal = input.nextDouble();
    System.out.println("Enter the number of years");
    double years = input.nextDouble();
    System.out.println("Enter the interest rate");
    double interestRate = input.nextDouble();
    
    double amount = principal * (1 + (years*interestRate));
    System.out.println("The value after the term is $"+amount);
  }
}