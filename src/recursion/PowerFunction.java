package recursion;

public class PowerFunction {
    public static int powerFunction(int base, int exp) {

        // Base case
        if (exp == 1) {
            return base;
        }

        // Recursive case
        return base * powerFunction(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println(powerFunction(3, 2));
    }
}
