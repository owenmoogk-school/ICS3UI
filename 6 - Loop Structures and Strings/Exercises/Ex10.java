import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num1 = input.nextInt();
    System.out.print("Enter a second number: ");
    int num2 = input.nextInt();
    int temp = 0;

    while (num2 > 0){
      temp = num1%num2;
      num1 = num2;
      num2 = temp;
    }

    System.out.println("The GDC is: "+num1);


  }
}