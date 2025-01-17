import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number");
    double num = input.nextInt();
    double x = num/10;
    int finaln = (int)x;
    System.out.println("The first digit is "+finaln);

    int y = 10*finaln;
    int scndn = (int)num-y;
    System.out.println("The second digit is "+scndn);
  }
}