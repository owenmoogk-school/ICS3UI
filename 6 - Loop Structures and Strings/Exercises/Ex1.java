import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Input the integer: ");
    int number = input.nextInt();

    int checkUntil = (int)(Math.sqrt(number))+1;
    boolean isPrime = true;

    for (int i = 2; i <= checkUntil; i++){
      if (number%i == 0){
        isPrime = false;
        break;
      }
    }

    if (isPrime == true){
      System.out.println(number+" is prime.");
    }
    else if (isPrime == false){
      System.out.println(number+" is not prime");
    }
  }
}