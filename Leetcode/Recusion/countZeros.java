public class countZeros {
    
    public static int countZeros(int n){
         int count=0;

         while(n>0){
            int rem = n%10;
            n=n/10;
            if(rem==0){
               count++;
            }

         }
        

         return count;

    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int n=1010102010;

        int ans = countZeros(n);

        System.out.println(ans);
    }
}
