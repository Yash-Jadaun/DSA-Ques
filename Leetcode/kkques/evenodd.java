public class evenodd {
   public static String evenOdd(int n){
    
    int check=n&1;

    return check ==0 ? "even" : "odd";

   }
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        String result=evenOdd(28);
        System.out.println(result);
    }
}
