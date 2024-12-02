package Dsaques.InterviewQues;

import java.util.*;

public class missingPositive {
   
    public int missing(int [] arr){
        int i=0;
        while(arr[i] > 0 && arr[i] <= arr.length && i<arr.length){
           int correct = arr[i]-1;

           if(arr[i]!=arr[correct]){
               //swap
               swap(arr,i,correct);
           }
           else{
            i++;
           }
        }

        //search
        for(int index=0;index<arr.length;index++){
            if(arr[index]<=0){
                index++;
            }
            if((index+1)!=arr[index]){
                return index+1;
            }
        }
        return -1;
    }


    //swap
    public void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        missingPositive mp = new missingPositive();
        int [] arr ={3,4,-1,1};

        int ans = mp.missing(arr);
        System.out.println(ans);
          
    }
}
