public class infinitearray {
   
   
    static int binarySearch(int[] arr,int target,int start,int end){
        // int start =0;
        // int end = arr.length;

        while(start<=end){
            int mid = start + (end - start)/2;

           if(target>arr[arr.length-1]){
            return -1;
           }
           else if(target<arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start= mid + 1;
            }else{
                return mid;
            }
        }return -1;

    }
    
    
    static int ans(int[] arr,int target){
        //first find the range
        //first start with a box of size 2;
         int  start=0;
         int  end=1;

          while(target>arr[end]){
            int newStart=end+1;


            end = end+(end-start)*2;   
            start=newStart;
          }
          
         return binarySearch(arr, target, start, end);

    }
    
    
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        //start with the box of size 2

        int [] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
      System.out.println(ans(arr, target));
    }
}
