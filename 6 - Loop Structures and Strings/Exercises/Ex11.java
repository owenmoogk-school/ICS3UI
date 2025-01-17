import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the starting hour: ");
    int hour = input.nextInt();

    System.out.print("Enter am or pm: ");
    String version = input.next();

    System.out.print("Enter the number of elapsed hours: ");
    int elapsed = input.nextInt();

    int looped = 0;
    int counter = 0;
    while (counter < elapsed){
      hour++;
      if (hour == 13){
        hour = 1;
        looped++;
      }
      counter++;
    }

    if (looped%2 != 0){
      if (version.equals("am") == true){
        version = "pm";
      }
      else{
        version = "am";
      }
    }
    System.out.println("The time is: "+hour+":00 "+version);

  }
}