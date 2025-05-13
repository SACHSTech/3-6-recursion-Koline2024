package recursion;

public class SumArray {
    public static int sumArray(int[] arr, int n){
        //Base case
        if(n == 0){
            return 0;
        }

        //Recursive case
        return arr[n-1] + sumArray(arr, n-1);
    }

    public static void main(String args[]) {

        int[] numbers = {1,2,3,4};


        System.out.println(sumArray(numbers, 3));

    }
}
