import java.util.Scanner;

class Main {

  public static boolean isPrime(int number){
    boolean isPrime = true;
    for (int i = 2; i <= number/2; i++)
    {
      if(number % i == 0){
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input your integer: ");
    int num = input.nextInt();
    if (num < 1){
      System.out.println("Number must be greater than or equal to one.");
    }
    else{
      boolean result = isPrime(num);
      if (result == true){
        System.out.println(num+" is prime");
      }
      else{
        System.out.println(num+" is not prime");
      }
    }
  }
}