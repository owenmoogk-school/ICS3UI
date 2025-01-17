import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the numbers");
    double total = 0;
    int n1 = input.nextInt();
    total = n1;
    int n2 = input.nextInt();
    total += n2;
    int n3 = input.nextInt();
    total += n3;
    int n4 = input.nextInt();
    total += n4;
    int n5 = input.nextInt();
    total += n5;
    double avg = total/5;
    System.out.println("The average is "+avg);

  }
}