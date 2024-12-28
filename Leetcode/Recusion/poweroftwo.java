import java.util.*;
public class poweroftwo {

    public static boolean isPower(int n){
         for(int i=0;i<n;i++){
            int pow = (int)Math.pow(2,i);
            
            if(n==pow){
                return true;
            }
             
            
         }

         return false;
        }
        
    
    
    
    
    
    public static void main(String[] args) {
        boolean ans = isPower(3);
        System.out.println(ans);

    }
}
