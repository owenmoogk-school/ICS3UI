class Main {
  public static void main(String[] args) {
    System.out.format("%-10s%-10s%-10s%-10s%-10s", "x^1", "x^2", "x^3", "x^4", "x^5");
    System.out.println();
    for (int i = 1; i < 7; i++){
      System.out.format("%-10s%-10s%-10s%-10s%-10s", i, Math.pow(i, 2), Math.pow(i, 3), Math.pow(i, 4), Math.pow(i, 5));
      System.out.println();
    }
  }
}