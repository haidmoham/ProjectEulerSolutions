/**
 * Created by Mohammad Haider (haidmoham) on 7/20/16.
 */
public class Problem3
{
    private static final long in = 600851475143L;
    public static void main(String[] args) {
        System.out.println(maxPrimeFactor(in));
    }

    public static long maxPrimeFactor(long n){
        long factor = -1;
        for (int i = 2; i * i <= n; i++) {
            if (n == 1) {
                break;
            }
            if (n % i != 0) {
                continue;
            }
            factor = i;
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1 ? factor : n;
    }
}