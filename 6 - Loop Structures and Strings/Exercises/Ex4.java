import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Input the car model number or 0 to quit: ");
    int model = input.nextInt();
    
    while (model != 0){
      if (model == 119 || model == 179 || model == 189 || model == 190 || model == 191 || model == 192 || model == 193 || model == 194 || model == 195 || model == 221 || model == 780){
      System.out.println("Your car is defective. It must be repaired.");
      }
      else{
        System.out.println("Your car is not defective.");
      }
      System.out.print("Input the car model number or 0 to quit: ");
      model = input.nextInt();
    }
  }
}