import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.print("Input your title: ");
    String title = input.nextLine();

    if (title.compareToIgnoreCase("Mr.") == 0){
      System.out.println("Hello, sir");
    }
    else if (title.compareToIgnoreCase("Mrs.") == 0 || title.compareToIgnoreCase("Miss") == 0 || title.compareToIgnoreCase("Ms.") == 0){
      System.out.println("Hello, ma'am");
    }
    else {
      System.out.println("Hello "+ name);
    }
  }
}