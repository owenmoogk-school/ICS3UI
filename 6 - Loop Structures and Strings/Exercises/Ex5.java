import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Input the positive integer: ");
    int number = input.nextInt();
    String num = Integer.toString(number);

    int length = num.length();

    for (int i = 0; i < length; i++){
      System.out.println(num.substring(i,i+1));
    }
  }
}