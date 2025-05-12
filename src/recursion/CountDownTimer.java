package recursion;

public class CountDownTimer {
    public static int countDown(int n) {

        //Base Case
        if(n == 0){
            return 0;
        }
        //Recursive Case
        System.out.print(n + " ");
        return countDown(n - 1);
    }

    public static void main(String[] args) {
        countDown(5); 
    }
}