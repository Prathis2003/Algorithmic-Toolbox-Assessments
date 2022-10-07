import java.util.Arrays;
import java.util.Scanner;

public class ChangeDP {
    private static int getChange(int ind, int T, int arr[]) {
        //write your code here
        if (ind == 0) {
            if (T % arr[ind] == 0) {
                return T / arr[ind];
            } else {
                return Integer.MAX_VALUE;
            }
        }

        int notTake = getChange(ind - 1, T, arr);
        int take = Integer.MAX_VALUE;
        if (arr[ind] <= T) {
            take = 1 + getChange(ind, T - arr[ind], arr);
        }
        return Math.min(take, notTake);

    }

    private static int minCoinChange(int ind, int T, int[] a) {
        int ans = getChange(ind, T, a);
        if (ans >= Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int a[] = new int[]{1, 3, 4};

        int ans = minCoinChange(a.length - 1, T, a);
        System.out.println(ans);


    }
}

