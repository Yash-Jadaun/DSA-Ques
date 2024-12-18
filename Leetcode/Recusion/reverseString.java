import java.util.*;

public class reverseString {
    public static char[] reverse(char [] s ){
        int i=0;
        int j=s.length-1;
        
        while(i<j){
         
                swap(s,i,j);
                i++;
                j--;
            
        }

        return s;
    }


    public static void swap(char [] arr,int first,int second){
         char temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        char []ans = reverse(s);

        System.out.println(Arrays.toString(ans));


    }
}
