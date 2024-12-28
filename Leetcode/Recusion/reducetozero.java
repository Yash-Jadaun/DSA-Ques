public class reducetozero {
    
    public static int zero(int n){
         int count=0;
        
         while(n!=0){
         if(n%2==0){
            n=n/2;
         }
         else{
            n-=1;
         }
         count++;

    }
    
    return count;

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
         int ans = zero(4);
        System.out.println(ans);
    }
}
