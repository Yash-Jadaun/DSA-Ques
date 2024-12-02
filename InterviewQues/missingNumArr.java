package Dsaques.InterviewQues;

import java.util.*;

public class missingNumArr {
  
   public static void missing(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;

            if(arr[i] > 0 && arr[i] <= arr.length && arr[i]!=arr[correct]){
                //swap
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }


       
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
          System.out.println(ans);
   }
  
  
  
   public static void swap(int [] arr,int first,int second){
    int temp=arr[first];
     arr[first]=arr[second];
     arr[second]=temp;
   }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    public static void main(String[] args) {
       int [] arr={5,4,1};
        missing(arr);
       System.out.println(Arrays.toString(arr));   
    }
}
