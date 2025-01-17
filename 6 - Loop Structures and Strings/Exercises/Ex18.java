import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = input.next();

    System.out.print("Enter your middle initial: ");
    String middleName = input.next();

    System.out.print("Enter your last name: ");
    String lastName = input.next();

    firstName = firstName.substring(0,1);
    middleName = middleName.substring(0,1);
    lastName = lastName.substring(0,1);

    firstName = firstName.toLowerCase();
    middleName = middleName.toLowerCase();
    lastName = lastName.toUpperCase();

    System.out.println(firstName+lastName+middleName);
  }
}