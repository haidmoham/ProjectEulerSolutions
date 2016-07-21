import java.util.*;

/**
 * Created by Mohammad Haider (haidmoham) on 7/20/16.
 */
public class Problem2 {
    public static void main(String[] args){
        int n = 50;
        long[] fib = new long[n+1];
        long sum = 0;
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i <= n; i++){
            fib[i] = fib[i-1] + fib[i-2];
            if (fib[i]%2 == 0 && fib[i] < 4000000)
                sum += fib[i];
        }
        System.out.println(sum);
    }
}
