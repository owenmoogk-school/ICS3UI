class Main {
  public static void main(String[] args) {
    String x = "         lots of words.    ";
    x = x.trim();
    int spaces = 0;
    for (int i = 0; i < x.length(); i++) {
      String y = x.substring(i,i+1);
      if (y.equals(" ")){
        spaces += 1;
      }
    }
    int letters = x.length() - spaces;
    System.out.println("There are "+letters+" letters");
  }
}