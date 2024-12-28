import java.util.*;
public class powerofthree {
    
    public static boolean ispow(int n){
        if(n==0 || n<0){
            return false;
        }

        for(int i=0;i<15;i++){
            int pow =(int)Math.pow(3,i);

            if(n==pow){
                return true;
            }
        }

        return false;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        boolean ans = ispow(10);
        System.out.println(ans);
    }
}
