public class Nth_Root {

    public static double nthRoot(double x, int n, double epsilon) {
        if (x < 0 && n % 2 == 0) {
            throw new IllegalArgumentException("Even root of negative number is not real.");
        }

        double guess = x / n;
        double prevGuess;

        do {
            prevGuess = guess;
            guess = ((n - 1) * guess + x / Math.pow(guess, n - 1)) / n;
        } while (Math.abs(guess - prevGuess) > epsilon);

        return guess;
    }

    public static void main(String[] args) {
        double x = 27;
        int n = 3;
        double epsilon = 1e-10;

        double result = nthRoot(x, n, epsilon);
        System.out.println(n + "th root of " + x + " = " + result);
    }
}
