package recursion;

public class SumofNaturalNumbers {

    // Base case
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }

}
