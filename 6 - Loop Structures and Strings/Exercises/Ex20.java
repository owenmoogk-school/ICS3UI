import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter text: ");
    String words = input.nextLine();

    int count = 0;
    
    for (int i = 0; i < words.length(); i++){
      if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i'|| words.charAt(i) == 'o' || words.charAt(i) == 'u' || words.charAt(i) == 'A' || words.charAt(i) == 'E' || words.charAt(i) == 'I'|| words.charAt(i) == 'O' || words.charAt(i) == 'U'){
        count++;
      }
    }
    System.out.println("The number of vowels in "+words+" is "+count);


  }
}