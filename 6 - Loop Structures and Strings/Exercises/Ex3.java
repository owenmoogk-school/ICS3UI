import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    double value = 2500;
    double rate = .075;
    int years = 0;

    while (value < 5000){
      years++;
      value += value * rate;
    }
    System.out.println(years);
  }
}