import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    //get values
    
    System.out.print("Enter inital bacteria amount: ");
    double n = input.nextDouble();
    System.out.print("Enter a constant value for K: ");
    double k = input.nextDouble();
    System.out.print("Enter the growth time period in hours: ");
    double t = input.nextDouble();

    //find result

    double e = Math.exp(k*t);
    double result = n*e;
    int roundedresult = (int) result;

    //output

    System.out.println(roundedresult+" bacteria will be present after "+t+" hours");
  }
}