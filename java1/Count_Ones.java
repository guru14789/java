public class Count_Ones {
    public static int countOnesBitwise(int n, int n1) {
        int result = 0;
        while (n != 0 || n1 != 0) {
            int count = n & 1;
            int count1 = n1 & 1;
            if (count != count1) {
                result += 1;
            }
            n >>= 1;
            n1 >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 4;
        int number1 = 5;
        System.out.println(countOnesBitwise(number, number1));
    }
}
