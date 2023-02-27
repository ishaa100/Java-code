public class Reverse_string {
    public static void main(String args[]) {
        String word = "HellotoWorld";
        String reverse = new StringBuffer(word).reverse().toString();
        word = "IamIshaAggarwal";
        reverse = new StringBuilder(word).reverse().toString();
        System.out.printf(reverse);
    }     
    public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }       
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }      
        return reverse;
    }
    
}
