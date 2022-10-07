import java.util.*;

public class LCM {
  private static long gcd(int m,int n){
    if(n==0){
      return m;
    }
    else{
      return gcd(n,m%n);
    }
  }
  private static long lcm_naive(int a, int b) {
    return (long)a*b/gcd(a,b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
