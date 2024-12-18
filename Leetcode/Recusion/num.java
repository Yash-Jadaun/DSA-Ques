public class num {
    
    // public static void fun(int n){
    //     if(n==0){
    //         return;
    //     }

    //      for(int i=1;i<n;i++){
    //         System.out.println(i);
    //      }
    // }


    public static void fun(int n){
        if(n==0){
            return;
        }

        fun(n-1);
        System.out.println(n);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
      fun(5);

     

    }
}
