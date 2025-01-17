import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the numbers");
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    int n3 = input.nextInt();
    int n4 = input.nextInt();
    int n5 = input.nextInt();
    double total = n1+n2+n3+n4+n5;
    double avg = total/5;
    System.out.println("The average is "+avg);

  }
}