class Main {
  public static void main(String[] args) {
    
    int counter = 0;
    while (counter < 5){
      double doubleRoll = (Math.random()*6)+1;
      int roll = (int) doubleRoll;
      double doubleRoll2 = (Math.random()*6)+1;
      int roll2 = (int) doubleRoll2;
      int total = roll+roll2;
      System.out.println("You rolled "+roll+" and "+roll2+" for a total of "+total);
      counter++;
    }

  }
}