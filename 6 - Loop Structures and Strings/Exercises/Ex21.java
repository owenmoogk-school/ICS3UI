import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = input.nextLine();

    System.out.print("Enter your last name: ");
    String lastName = input.nextLine();

    String lastLetter = lastName.toLowerCase();

    char character = lastLetter.charAt(0);

    if (character >= 97 && character <= 105){
      System.out.println(firstName+" "+lastName+" is assigned to group 1.");
    }
    if (character >= 106 && character <= 115){
      System.out.println(firstName+" "+lastName+" is assigned to group 2.");
    }
    if (character >= 116 && character <= 122){
      System.out.println(firstName+" "+lastName+" is assigned to group 3.");
    }

  }
}