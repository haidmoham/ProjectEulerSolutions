/**
 * Created by Mohammad Haider (haidmoham) on 7/20/16.
 */
public class Problem4 {
    public static void main(String[] args){
        int product = 0;
        int temp = 0;
        String max = "";
        for (int i = 900; i < 1000; i++){
            for (int j = 900; j < 1000; j++)
            {
                temp = i*j;
                product = Math.max(i*j, temp);
                if (isPalindrome(Integer.toString(product))){
                    //System.out.println(i + " " + j);
                    max = Integer.toString(product);
                }
            }
        }
        System.out.println(max);
    }
    public static boolean isPalindrome(String N){
        String M = new StringBuilder(N).reverse().toString();
        if (M.equals(N))
            return true;
        return false;
    }
}
