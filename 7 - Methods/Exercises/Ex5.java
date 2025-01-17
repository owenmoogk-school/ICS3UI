import java.util.Scanner;

class Main {

  public static double getDollarAmount(int quarters, int dimes, int nickles, int pennies){
    double total = 0;
    total += quarters * .25;
    total += dimes * .10;
    total += nickles * .05;
    total += pennies * .01;
    return total;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your total coins:\n");
    System.out.print("Quarters: ");
    int quarter = input.nextInt();
    System.out.print("Dimes: ");
    int dime = input.nextInt();
    System.out.print("Nickels: ");
    int nickle = input.nextInt();
    System.out.print("Pennies: ");
    int penny = input.nextInt();



    double theTotal = getDollarAmount(quarter, dime, nickle, penny);
    System.out.println(theTotal);
  }
}