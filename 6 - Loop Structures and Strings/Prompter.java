import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Input minimum number: ");
    double minNum = input.nextDouble();
    System.out.print("Input maximum number: ");
    double maxNum = input.nextDouble();

    System.out.print("Input a number between "+minNum+" and "+maxNum+": ");
    double givenNum = input.nextDouble();
    
    while (givenNum > maxNum || givenNum < minNum){
      System.out.print("Try Again: ");
      givenNum = input.nextDouble();
    }
  
    System.out.println("Nice!");

  }
}