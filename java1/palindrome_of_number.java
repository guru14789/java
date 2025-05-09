public class palindrome_of_number
 {

    public static boolean pali(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }

        int rev = 0;

        while (num > rev) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        return num == rev || num == rev / 10;
    }

    public static void main(String[] args) {
        int num = 1454842;
        if (pali(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
