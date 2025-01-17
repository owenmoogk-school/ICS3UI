import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the diameter of your pizza! (In inches)");
    double diameter = input.nextDouble();
    double price = .75+1+(.05*diameter*diameter);
    double pricehundred = price * 100;
    double roundedprice = Math.round(pricehundred);
    double fprice = roundedprice/100;
    System.out.println("The price is $"+fprice);
  }
}