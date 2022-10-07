import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
       long[] arr = new long[(int)n+1];
       arr[0]=0;
       arr[1]=1;
       for(int i=2;i<=n;i++){
           String str=Long.toString(arr[i-1]+arr[i-2]);
           if(str.length()>4){
               str=str.substring(str.length()-4);
           }
           arr[i]=Long.parseLong(str);
       }
       return (long)arr[(int)n]%m;


    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        if(n<=1){
            System.out.println(n%m);
        }
        else{
            System.out.println(getFibonacciHugeNaive(n, m));
        }

    }
}

