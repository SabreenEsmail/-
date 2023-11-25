public class q6 {
    public static int calculateOddSum(int n) {
        int sum =0;
        for (int i =1; i <= n; i += 2){
            sum += i;
        }
        return sum;
    }
}
