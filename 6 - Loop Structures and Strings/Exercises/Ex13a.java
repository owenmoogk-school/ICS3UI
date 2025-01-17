class Main {
  public static void main(String[] args) {
    for (int n = 2; n <= 200; n++){
      int i = n;
      while (i != 1){
        if (i % 2 == 0){
          i = i/2;
        }
        else{
          i = (i*3)+1;
        }
      }
    }
    System.out.println("1-200 initial values all reach 1.");
  }
}