public class sumofdigits {
    
    public static int sumdigits(int n){
        int sum=0;
        
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int n=12345;

        int ans = sumdigits(n);

        System.out.println(ans);
    }
}
