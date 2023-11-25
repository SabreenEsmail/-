public class q4 {
    public static boolean isEven (int i) {
        if ((i & 1) == 0) {
            return true;
        } else {
            return false;

        }

    }

    public static void main(String[] args) {
        int number = 10;
        if (isEven(number)) {
            System.out.println(number+"is even.");

        }else {
            System.out.println(number + "is ood.");
        }
    }
}

