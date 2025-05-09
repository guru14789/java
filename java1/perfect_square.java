public class perfect_square {
    public static void main(String[] args) {
        int num = 10;
        int count = 0;

        for (int i = 1; i <= num / 2; i += 1) {
            if (num % i == 0) {
                count += i;
                System.out.println(i);
            }

        }
        System.out.println(count);
    }

}
