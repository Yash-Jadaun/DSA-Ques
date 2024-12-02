public class mountainarray {
 

   int search(int[] arr,int target){
    int peak = peakIndexInMountainArray(arr);
   int firsttry = OrderAgnostics(arr, target, 0, peak);

   if(firsttry!=-1){
    return firsttry;

   }

   return OrderAgnostics(arr, target, peak+1, arr.length-1);

   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    static int peakIndexInMountainArray(int[] arr){
        int start =0;
        int end = arr.length-1;
        
        while(start<end){
            // int mid = (start+end)/2;//this may exceed th int range of java

            int mid = start + (end - start)/2;

            if( arr[mid] > arr[mid+1]){ //move left
                end=mid;

            }else{
               start=mid+1;

            }

        }
        return start;
   }
   
   
   
   
   
   
     
   static int binarysearch(int[] arr, int target,int start,int end){
    // int start =0;
    // int end = arr.length;
    while(start<=end){
        // int mid = (start+end)/2;//this may exceed th int range of java

        int mid = start + (end - start)/2;

        if(target < arr[mid]){ //move left
            end = mid - 1;

        }else if(target > arr[mid]){
            start = mid + 1;

        }else{
            return mid;
        }

    }
    return -1;
}


   
   
   
static int OrderAgnostics(int[] arr, int target,int start,int end){
    // int start=0;
    // int end=arr.length-1;


    //find whether the array is sorted in ascending or descending
    boolean isAsc;
    if(arr[start] < arr[end]){
        isAsc = true;

    }else{
        isAsc=false;
    }
      
  while(start<=end){
       
    int mid = start + (end - start) /2;

    if(arr[mid] == target){
        return mid;
    }
    if(isAsc){
        if(target<arr[mid]){
            end = mid - 1;
        }else {
            start = mid + 1;
        }
    }else{
        if(target>arr[mid]){
            end = mid - 1;
        }else {
            start = mid + 1;
        }
        
    }
    
  }return -1;
}

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
       
    }
}
