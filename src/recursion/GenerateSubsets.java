package recursion;

public class GenerateSubsets {
    
    public static void generateSubsets(String str){

        //Base case
        if(str.length() == 0){
            return;
        }

        //Recursive case
        for(int i = 0; i < str.length(); i++){
            char removed = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i+1);
            System.out.println(removed);
            generateSubsets(remaining);
        }
      
    }

     public static void main(String[] args) {
        String s = "biaic";
        generateSubsets(s);
    }
}
