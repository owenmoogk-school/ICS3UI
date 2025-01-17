import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the percentage:  ");
    int percentage = input.nextInt();
    if (percentage > 100 || percentage<0){
      System.out.println("Error, please enter an integer between 0 and 100 (inclusive).");
    }
    else{
      System.out.print("The corresponding letter grade is:  ");
      if (percentage > 89 && percentage < 101){
      System.out.println("A");
      }
      if (percentage >79 && percentage <90){
        System.out.println("B");
      }
      if (percentage>69 && percentage < 80){
        System.out.println("C");
      }
      if (percentage >59 && percentage < 70){
        System.out.println("D");
      }
      if (percentage <60){
        System.out.println("F");
      }
    }
  }
}