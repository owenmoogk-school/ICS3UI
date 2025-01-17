import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
        int m, n, sum = 0;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        m = input.nextInt();
        
        while(m > 0){
            n = m % 10;
            sum += Math.pow(n, 3);
            m = m / 10;
        }
        System.out.println("The sum of the cubes of the digits is: "+sum);
  }
}