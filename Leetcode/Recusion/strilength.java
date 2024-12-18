public class strilength {
   
   public static  int slength(String s){
        if(s.length()==0){
            return 0;
        }

        if(s.length()==1){
            return 1;
        }
         
        int count=0;
        for(int i=0;i<s.length();i++){
            count++;
        }

        return count;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        int ans = slength("Yash");
        System.out.println(ans);
    }
}
