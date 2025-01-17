import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int d1;
    int d2;
    int d3;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first distance");
    d1 = input.nextInt();
    System.out.println("Enter the second distance");
    d2 = input.nextInt();
    System.out.println("Enter the third distance");
    d3 = input.nextInt();
    int total = d1+d2+d3;
    System.out.println("The length is "+total);

  }
}