public class sumofdigits {
    
public static int fun(int n){
    if(n==0){
        return 1;
    }

    int lastDigit = n%10;
    n = n/10;

    return lastDigit * fun(n);
}
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int ans = fun(1342);
        System.out.println(ans);
    }
}
