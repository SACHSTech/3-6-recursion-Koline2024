package recursion;

public class SumOfDigits {

    public static int sumOfDigits(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(120305));
    }
}
