import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a username: ");
    String username = input.nextLine();

    boolean checker = false;
    String password = null;

    while (checker == false){
      System.out.print("Enter a password that is at least 8 characters: ");
      password = input.nextLine();
      int length = password.length();
      if (length > 7){
        checker = true;
      }
    }

    System.out.println("Your username is '"+username.toLowerCase()+"' and your password is '"+password.toLowerCase()+"'");


  }
}