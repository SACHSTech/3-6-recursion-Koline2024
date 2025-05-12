package recursion;

public class EvenNumbersInARange {
    
    public static void printEvens(int start, int end){
        //base case
       if(start != end){
        printEvens(start+1, end);
       }

       if(start % 2 == 0){
        System.out.println(start);
       }
    }

    public static void main(String[] args) {
        printEvens(1, 5); 
    }
    
}
