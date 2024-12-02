package Dsaques.InterviewQues;

public class QuickSort {
    
    public static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
           int correct = arr[i];

           if(arr[i]<arr.length && arr[i]!=arr[correct]){
                  //swap
                  swap(arr,i,correct);
           }else{
            i++;
           }


        }

        //search missing num
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }

        //case 2;
        return arr.length;
    }


    public static void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        int [] arr={5,4,2,1};
      
        System.out.println(sort(arr));
    }
}
