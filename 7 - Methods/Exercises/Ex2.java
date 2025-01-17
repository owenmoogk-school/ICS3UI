import java.util.Scanner;

class Main {
  public static void inchesToCentimeters(double inches){
    double centimeters = 2.54 * inches;
    System.out.println(inches+" inches equals "+centimeters+" centimeters");
  }
  
  public static void feetToCentimeters(double feet){
    double centimeters = 30 * feet;
    System.out.println(feet+" feet equals "+centimeters+" centimeters");
  }

  public static void yardsToMeters(double yards){
    double meters = 0.91 * yards;
    System.out.println(yards+" yards equals "+meters+" meters");
  }

  public static void milesToKilometers(double miles){
    double kilometers = 1.6 * miles;
    System.out.println(miles+" miles equals "+kilometers+" kilometers");
  }

  public static void centimetersToInches(double centimeters){
    double inches = centimeters / 2.54;
    System.out.println(centimeters+" centimeters equals "+inches+" inches");
  }

  public static void centimetersToFeet(double centimeters){
    double feet = centimeters / 30;
    System.out.println(centimeters+" centimeters equals "+feet+" feet");
  }

  public static void meterstoYards(double meters){
    double yards = meters / 0.91;
    System.out.println(meters+" meters equals "+yards+" yards");
  }

  public static void kilometersToMiles(double kilometers){
    double miles = kilometers / 1.6;
    System.out.println(kilometers+" kilometers equals "+miles+" miles");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Chart:\n1: Inches to Centimeters\n2: Feet to Centimeters\n3: Yards to Meters\n4: Miles to Kilometers\n5: Centimeters to Inches\n6: Centimeters to Feet\n7: Meters to Yards\n8: Kilometers to Miles");
    System.out.print("Enter a choice between 1 and 8: ");
    int choice = input.nextInt();
    System.out.print("Enter the value: ");
    double value = input.nextDouble();
    if (choice >= 1 && choice <= 8){
      switch (choice){
        case 1:
          inchesToCentimeters(value);
          break;
        case 2:
          feetToCentimeters(value);
          break;
        case 3:
          yardsToMeters(value);
          break;
        case 4:
          milesToKilometers(value);
          break;
        case 5:
          centimetersToInches(value);
          break;
        case 6:
          centimetersToFeet(value);
          break;
        case 7:
          meterstoYards(value);
          break;
        case 8:
          kilometersToMiles(value);
          break;
      }
    }
    else{
      System.out.println("Invalid selection.");
    }
  }
}