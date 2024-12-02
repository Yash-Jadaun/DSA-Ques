public class PowerOfTwoQ {
  public static boolean power(int n){
         while(n>1){
            if((n&(n-1))==0){
                return true;
            
            }
            
         }
         return false;
     }
  
  
  
  
  
  
  
  
  
  
  
    public static void main(String[] args) {
        boolean check = power(4);
         System.out.println(check);
    }
}
