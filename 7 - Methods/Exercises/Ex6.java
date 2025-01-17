class Main {
  public static void main(String[] args) {
    for (int m = 1; m < 25; m++){
      for (int n = 1; n < m; n++){
        double a = Math.pow(m, 2) - Math.pow(n, 2);
        double b = 2 * n * m;
        double c = Math.pow(n, 2) + Math.pow(m, 2);
        if (a < 100 && b < 100 && c < 100){
          System.out.println(a+" "+b+" "+c);
        }
      }
    }
  }
}