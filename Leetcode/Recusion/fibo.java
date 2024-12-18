public class fibo {
   

   static int  fiboseries(int n){

    if (n <= 1) {
        return n;  // F(0) = 0, F(1) = 1
     }
     
      return fiboseries(n-1) + fiboseries(n-2);

   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        int ans = fiboseries(2);
        System.out.println(ans);
    }
}
