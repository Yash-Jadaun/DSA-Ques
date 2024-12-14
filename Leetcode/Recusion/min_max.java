import java.util.*;
public class min_max {
   public static int minmax(int [] arr){
        // int max =arr[0];
        // for(int i=1;i<arr.length-1;i++){
        //     if(arr[i+1]>arr[i]){
        //         max=arr[i+1];
        //     }
        // }
        // return max;


    //     int min = arr[0]; // Initialize with the first element
    //     for (int i = 1; i < arr.length; i++) { // Start from second element
    //         if (arr[i] < min) { // Compare current element with min
    //             min = arr[i]; // Update min if a smaller element is found
    //         }
    //     }
    //     return min; // Return the smallest element
    // }
   
   
   
         Arrays.sort(arr);
        //  int min = arr[0];

        //  return min;

        int max = arr[arr.length-1];
        return max;
   
   }
   
   
   
   
   
    public static void main(String[] args) {
        int [] arr = {1,4,3,-5,-4,8,6};
        int ans=minmax(arr);
        System.out.println(ans);
    }
}
