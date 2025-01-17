import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    //get values from user

    System.out.print("Principal Amount: ");
    double p = input.nextDouble();
    System.out.print("Interest rate: ");
    double r = input.nextDouble();
    System.out.print("Number of monthly payments: ");
    double m = input.nextDouble();

    //calculate

    double x = Math.pow((1+(r/12)), (-m));
    double result = (p*(r/12))/(1-x);

    //output

    System.out.println(result);



  }
}