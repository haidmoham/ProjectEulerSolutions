/**
 * Created by Mohammad Haider (haidmoham) on 7/20/16.
 */
public class Problem6 {
    public static void main(String[] args){
        int sumsq, sqsum, diff;
        int n = 100;
        n++;
        sumsq = 0;
        sqsum = 0;
        diff = 0;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = i;
            sumsq += (ar[i] * ar[i]);
            sqsum += (ar[i]);
        }
        System.out.println(sumsq);
        sqsum = sqsum * sqsum;
        System.out.println(sqsum);
        diff = sqsum - sumsq;
        System.out.println(diff);
    }
}
