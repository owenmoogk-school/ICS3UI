import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the time in minutes");
    double inputmins = input.nextDouble();
    double hours = inputmins/60;
    int inthours = (int) hours;
    double minutes = inputmins%60;
    System.out.println("The time is "+inthours+":"+minutes);
  }
}