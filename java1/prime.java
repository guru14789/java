public class prime {
    public static void main(String[] args) {
        int upto = 10;

        System.out.println("Prime numbers up to " + upto + ":");
        for (int num = 2; num <= upto; num++) {
            boolean primed = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primed = false;
                    break;
                }
            }

            if (primed) {
                System.out.print(num + " ");
            }
        }
    }
}
