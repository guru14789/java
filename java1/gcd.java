import java.util.Arrays;

public class gcd {

    public static int gcdOfMinAndMax(int[] nums) {
        int mini = Arrays.stream(nums).min().getAsInt();
        int maxi = Arrays.stream(nums).max().getAsInt();

        while (mini != 0) {
            int temp = mini;
            mini = maxi % mini;
            maxi = temp;
        }

        return maxi;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = gcdOfMinAndMax(numbers);
        System.out.println("GCD of min and max: " + result);
    }
}
