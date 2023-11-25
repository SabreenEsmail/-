public class q3 {
    public static boolean isMultiple(long n, long m){
        return n % m == 0;

    }

    public static void main(String[] args) {
        long n = 10;
        long m = 5;
        boolean result = isMultiple(n,m);
        System.out.println(result);
    }
}
