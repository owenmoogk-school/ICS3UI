import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value for X: ");
    double x = input.nextDouble();
    System.out.print("Enter a value for Y: ");
    double y = input.nextDouble();

    double logx = Math.log(x);
    double result = Math.exp(logx * y);
    System.out.println("The result from using the formula is "+result);

    double resultpow = Math.pow(x,y);
    System.out.println("The result from using the Math.pow() method is: "+resultpow);
  }
}