import java.util.*;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double  totVal=0;
        int totWeight = 0;
        double[] ratio = new double[values.length];
        for(int i=0;i<values.length;i++) {
            ratio[i] = (double) values[i] / (double) weights[i];
        }
        for(int i=0;i<values.length;i++){
            int j=0;
            int maxIndex = j;
            while(j<ratio.length){
                if(ratio[j]>ratio[maxIndex]){
                    maxIndex=j;
                }
                j++;

            }
            if(totWeight+weights[maxIndex]<=capacity){
                totWeight+=weights[maxIndex];
                totVal+=values[maxIndex];
                ratio[maxIndex]=0;
            }
            else {
                int rem = capacity - totWeight;
                totVal += (double) values[maxIndex] * rem / weights[maxIndex];
                break;
            }
        }
        return totVal;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
