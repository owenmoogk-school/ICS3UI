import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a sentence: ");
    String sentence = input.nextLine();

    System.out.print("Enter a string: ");
    String toRemove = input.nextLine();

    String fin = sentence.replaceAll(toRemove, "");

    System.out.println(fin);
  }
}