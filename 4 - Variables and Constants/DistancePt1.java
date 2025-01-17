import java.text.NumberFormat;

class Main {
  public static void main(String[] args) {
    double l1=12.2;
    double l2=10.6;
    double l3=5.8;
    double total = l1+l2+l3;
    System.out.println(NumberFormat.getNumberInstance().format(total));
  }
}