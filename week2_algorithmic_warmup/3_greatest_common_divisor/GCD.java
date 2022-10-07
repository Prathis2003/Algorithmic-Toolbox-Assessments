import java.util.*;

public class GCD {
  private static int gcd_efficient(int m, int n) {
    if(n==0){
      return m;
    }
    else{
      return gcd_efficient(n,m%n);
    }
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_efficient(a, b));
  }
}
