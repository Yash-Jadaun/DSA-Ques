public class reverse {
   
   public static void fun(int n){
    if(n==0){
        return;
    }
     
    System.out.println(n);
    fun(--n);


    
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        fun(5);
    }
}
