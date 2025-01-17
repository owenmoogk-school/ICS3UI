import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Input the integer you would like the factorial of: ");
    int number = input.nextInt();
    int total = 1;

    for (int i = number; i>0; i--){
      total = total * i;
    }
    System.out.println(number+"! = "+total);

  }
}