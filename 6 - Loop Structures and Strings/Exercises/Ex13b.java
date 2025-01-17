class Main {
  public static void main(String[] args) {

    int highestCycles = 0;
    int highestNumber = 0;
    
    for (int n = 2; n <= 200; n++){

      int i = n;
      int counter = 0;

      while (i != 1){
        if (i % 2 == 0){
          i = i/2;
          counter++;
        }
        else{
          i = (i*3)+1;
          counter++;
        }
      }
      if (counter > highestCycles){
        highestCycles = counter;
        highestNumber = n;
      }
    }
    System.out.println("Between 1 and 200, the maximum iterations to reach 1 is "+highestCycles+" and the number producing this is "+highestNumber);
  }
}