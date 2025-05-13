package recursion;

public class DecimalToBinary {

    public static String toBinary(int input) {
        // Base case
        if (input == 0) {
            return "";
        }

        // Recursive case
        return toBinary(input / 2) + (input % 2);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10));
    }
}
