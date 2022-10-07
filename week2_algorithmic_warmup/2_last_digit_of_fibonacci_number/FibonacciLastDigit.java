import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
       int[] arr = new int[n+1];
       arr[0]=0;
       arr[1]=1;
       for(int i=2;i<=n;i++){
           String str=Long.toString(arr[i-1]+arr[i-2]);
           str=str.substring(str.length()-1,str.length());
           arr[i]=Integer.parseInt(str);
       }
       return arr[n];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<=1){
            System.out.println(n);
        }
        else{
            int c = getFibonacciLastDigitNaive(n);
            System.out.println(c);
        }

    }
}

