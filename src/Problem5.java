/**
 * Created by Mohammad Haider (haidmoham) on 7/20/16.
 */
public class Problem5 {
    public static void main(String[] args){
        int res = 0;
        int temp = 0;
        for (int i = 50000; i < Integer.MAX_VALUE; i++)
            if(isDivisble(i)) {
                res = i;
                break;
            }
        System.out.println(res);
    }
    public static boolean isDivisble(int n){
        for (int i = 1; i <= 20; i++){
            if(n%i != 0)
                return false;
        }
        return true;
    }

}
