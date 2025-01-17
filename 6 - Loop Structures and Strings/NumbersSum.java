import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("What do you want the sum to go up to: ");
    double numCap = input.nextDouble();
    int currentNum = 1;
    int total = 0;

    while (currentNum < numCap){
      System.out.println(currentNum);
      total += currentNum;
      currentNum += 1;
    }

    System.out.println("The total of all integers between 0 and "+numCap+" (exclusive) is "+total);

  }
}