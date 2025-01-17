import java.util.Scanner;

class Main {
  
  public static double hoursToMinuites(double calc){
    calc = calc * 60;
    return calc;
  }
  public static double daysToHours(double calc){
    calc = calc * 24;
    return calc;
  }
  public static double minuitesToHours(double calc){
    calc = calc / 60;
    return calc;
  }
  public static double hoursToDays(double calc){
    calc = calc / 24;
    return calc;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Type 1 for hours to minuites; 2 for days to hours; 3 for minuites for hours; and 4 for hours to days: ");
    int request = input.nextInt();
    System.out.print("Enter the value to be converted: ");
    double value = input.nextInt();
    double result = 0;

    if (request == 1){
      result = hoursToMinuites(value);
    }
    if (request == 2){
      result = daysToHours(value);
    }
    if (request == 3){
      result = minuitesToHours(value);
    }
    if (request == 4){
      result = hoursToDays(value);
    }

    System.out.println("The result is "+result);
  }
}