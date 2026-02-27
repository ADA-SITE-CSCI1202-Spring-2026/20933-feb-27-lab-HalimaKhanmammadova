public class MathDemo {

    // a. returns the smaller of two numbers
    public static int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    // b. returns the larger of two numbers
    public static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    // c. returns the sum of all numbers in an array
    public static int sum(int[] args) {
        int total = 0;
        for (int n : args) {
            total += n;
        }
        return total;
    }

    // d. returns the average of all numbers in an array
    public static float mean(int[] args) {
        return (float) sum(args) / args.length;
    }

    // e. returns the factorial of n (e.g. 5! = 5x4x3x2x1 = 120)
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}