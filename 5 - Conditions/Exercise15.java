import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    //get inputs

    System.out.println("1. Final Amount");
    System.out.println("2. Initial Amount");
    System.out.println("3. Constant (half-life)");
    System.out.print("Find: ");
    double finding = input.nextDouble();

    //calculations and output

    if (finding == 1 || finding == 2 || finding == 3){
      if (finding == 1){
        System.out.print("Enter the elapsed time in years: ");
        double t = input.nextDouble();
        System.out.print("Enter the constant (half-life): ");
        double k = input.nextDouble();
        System.out.print("Enter the inital mass: ");
        double n = input.nextDouble();

        double result = n*(Math.exp(k*t));
        System.out.println(result);
      }


      if (finding == 2){
        System.out.print("Enter the final mass: ");
        double y = input.nextDouble();
        System.out.print("Enter the elapsed time in years: ");
        double t = input.nextDouble();
        System.out.print("Enter the constant (half-life); ");
        double k = input.nextDouble();

        double result = y / (Math.exp(k*t));
        System.out.println("Initial Amount: "+result);
      }


      if (finding == 3){
        System.out.print("Enter the inital mass: ");
        double n = input.nextDouble();
        System.out.print("Enter the final mass: ");
        double y = input.nextDouble();
        System.out.print("Enter the elapsed time in years: ");
        double t = input.nextDouble();

        double result = Math.log(y/n)/t;
        System.out.println("Constant (half-life): "+ result);
      }
    }


    else{
      System.out.println("Error. Please enter 1, 2, or 3");
    }

  }
}