import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Input the positive integer: ");
    int number = input.nextInt();
    
    int counter = 2;

    while (counter <= number){
      if (number%counter == 0){
        System.out.print(counter+", ");
        number = number / counter;
        counter = 2;
      }
      else{
        counter++;
      }
    }
  }
}