public class q7 {
    public static int calculateOddSum(int n) {
        int sum =0;
        for (int i =1; i <= n; i ++){
            sum += i * i;
        }
        return sum;
    }
}
