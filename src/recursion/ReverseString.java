package recursion;

public class ReverseString {
    
    public static String reverseString(String s){
        
        //base case
        if(s.isEmpty()){
            return s;
        }

        //recursive case
        return reverseString(s.substring(1)) + s.charAt(0);

    }

    public static void main(String[] args) {
        String s = "woah what the heck";
        System.out.println(reverseString(s));
    }

}
