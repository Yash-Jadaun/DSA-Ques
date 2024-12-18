import java.util.*;
public class upper {
   
   public static char Upper(String s){
      for(int i=0;i<s.length();i++){
          if(Character.isUpperCase(s.charAt(i))){
            return s.charAt(i);
          }
         }
          return '\0';
          
      }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        char ans = Upper("yAsh");

        System.out.println(ans);
    }
}
