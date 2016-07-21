/**
 * Created by Mohammad Haider (haidmoham) on 7/20/16.
 */
import java.util.*;
public class Problem8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String in = s.next();
        int l = in.length();
        long temp = 0;
        int[] digits = new int[l];
        for (int i = 0; i < l; i++){
            digits[i] = Character.getNumericValue(in.charAt(i));
        }
        for(int i = 13; i < 101; i++) {
            System.out.println(returnProduct(digits, i));
        }

    }
    private static long returnProduct(int[] n, int count){
        long product = 0;
        for (int i = 0; i < count; i++) {
            product *= n[i + count];
            System.out.println(product);
        }
        return product;
    }
}
