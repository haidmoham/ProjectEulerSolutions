/**
 * Created by Mohammad Haider (haidmoham) on 7/20/16.
 */
public class Problem7 {
    public static void main(String[] args){

        int max = 1500000;
        int count = 0;
        int goal = 10001;
        goal++;
        int[] primes = new int[max+1];
        // loop through the numbers one by one
       out: for (int i = 1; i<max; i++) {

            boolean isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }

            // print the number if prime
            if (isPrimeNumber) {
                System.out.println(i + " ");
                count++;
                if (count == goal)
                    break out;
                System.out.print(count + " ");
            }
        }
    }
}
