import java.util.*;

public class Inversions {

    private static long getNumberOfInversions(int[] a) {
        long numberOfInversions = 0;
//        if (right <= left + 1) {
//            return numberOfInversions;
//        }
//        int ave = (left + right) / 2;
//        numberOfInversions += getNumberOfInversions(a, b, left, ave);
//        numberOfInversions += getNumberOfInversions(a, b, ave, right);
//        //write your code here
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    numberOfInversions++;
                }
            }
        }
        return numberOfInversions;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(getNumberOfInversions(a));
    }
}

