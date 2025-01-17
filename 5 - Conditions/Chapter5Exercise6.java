import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);


    //random numbers

    double random1 = Math.random();
    double random2 = Math.random();

    int numone =    (int) ((random1)*10)+1;
    int numtwo =   (int) ((random2)*10)+1;

    
    //random operator

    int randompicker = (int) (Math.random()*4);
    String operator = "";

    switch (randompicker) {
      case 0:
        operator = " + ";
        break;
      case 1:
        operator = " - ";
        break;
      case 2:
        operator = " * ";
        break;
      case 3:
        operator = " / ";
        break;
    }


    //console interface

    System.out.println("What is " + numone + operator + numtwo + "?");
    double playeranswer = input.nextDouble();

    double firstnum = (double) numone;
    double secondnum = (double) numtwo;
    
    switch(randompicker){
      case 0:
        if (playeranswer  == firstnum + secondnum){
          System.out.println("Correct!");
        }
        else{
          System.out.println("Incorrect. The answer is " + (firstnum+secondnum));
        }
        break;
      
      case 1:
        if (playeranswer  == firstnum - secondnum){
          System.out.println("Correct!");
        }
        else{
          System.out.println("Incorrect. The answer is " + (firstnum-secondnum));
        }
        break;

      case 2:
        if (playeranswer  == firstnum * secondnum){
          System.out.println("Correct!");
        }
        else{
          System.out.println("Incorrect. The answer is " + (firstnum*secondnum));
        }
        break;

      case 3:
        if (playeranswer  == firstnum / secondnum){
          System.out.println("Correct!");
        }
        else{
          System.out.println("Incorrect. The answer is " + (firstnum/secondnum));
        }
    }


  }
}