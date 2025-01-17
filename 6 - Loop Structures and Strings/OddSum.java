import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the int: ");    
    int number = input.nextInt();
    int total = 0;

    for (int i=1; i<=number; i+=2){
      total += i;
    }

    System.out.println("The total of all odd numbers between 1 and "+number+" is "+total);
  }
}