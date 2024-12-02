public class sqrt {
    
    static int sqrt(int n){
        for(int i=0;i<=n;i++){
            if(i*i==n){
                return i;
            }
            
        }
        return -1;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int n=40;
      System.out.println(  sqrt(n));
    }
}
