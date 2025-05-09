public class armstrong {
    public static void main(
        String[] args) {
        int num = 93084;
        int n = num;
        int sum = 0;
        int po = String.valueOf(num).length();
        while (num != 0) {
            int rem = num % 10;
            sum = sum + (int) Math.pow(rem, po);
            num = num / 10;

        }
        if (sum == n) {
            System.out.print("Armstrong");
        } else {
            System.out.print("Not a Armstrong");
        }

    }

}
