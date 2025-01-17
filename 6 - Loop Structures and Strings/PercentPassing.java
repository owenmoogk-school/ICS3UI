import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the grades(%). When finished type '-1': ");

    double totalNumber = 0;
    double numberAbove70 = 0;
    int currentInput = 0;

    while (currentInput != -1){
      currentInput = input.nextInt();
      if (currentInput != -1){
        if (currentInput>70){
          numberAbove70 += 1;
          totalNumber += 1;
        }
        else{
          totalNumber +=1;
        }
      }
    }
    double percentPassing = 100*(numberAbove70/totalNumber);

    System.out.println(percentPassing+"% of the class is above 70%");

  }
}