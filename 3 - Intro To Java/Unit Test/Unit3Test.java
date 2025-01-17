/**
 *Main.java 
 *Owen Moogk 
 *ICS 3UI
 *March 10 2020 
 * 
 *This program is able to print all of my courses, giving my timetable. On the bottom there is my edited schedule for a flip day
 */

class Main {
  public static void main(String[] args) {
    System.out.println("\n");
    System.out.println("Regular Day Schedule:\n");
    System.out.format("%-20s%-10s","Subject","Period");
    System.out.println("\n");
    System.out.format("%-20s%-10s","English","A");
    System.out.println();
    System.out.format("%-20s%-10s","Auto Shop","B");
    System.out.println();
    System.out.format("%-20s%-10s","Lunch"," ");
    System.out.println();
    System.out.format("%-20s%-10s","Science","C");
    System.out.println();
    System.out.format("%-20s%-10s","Computer Science","D");
    System.out.println("\n\n");
    System.out.println("Flip Day Schedule:\n");
    System.out.format("%-20s%-10s","Subject","Period");
    System.out.println("\n");
    System.out.format("%-20s%-10s","English","A");
    System.out.println();
    System.out.format("%-20s%-10s","Auto Shop","B");
    System.out.println();
    System.out.format("%-20s%-10s","Lunch"," ");
    System.out.println();
    System.out.format("%-20s%-10s","Computer Science","D");
    System.out.println();
    System.out.format("%-20s%-10s","Science","C");
  }
}