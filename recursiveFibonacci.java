  import java.util.Scanner;
  
  class Main {
  
   public static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int entrada = Integer.parseInt(input.nextLine());
      System.out.println(fibo(entrada))
    }
  }
