import java.util.*;

public class Change {
    private static int getChange(int m) {
        //write your code here
//        int count=0;
//        while(m>0){
//            if(m>=1 && m<5){
//                m--;
//            }
//            else if(m>=5 && m<10){
//                m=m-5;
//            }
//            else{
//                m=m-10;
//            }
//            count++;
//        }
//        return count;
         return (int)(Math.floor( m/10)+Math.floor((m%10)/5)+Math.floor(m%5));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

