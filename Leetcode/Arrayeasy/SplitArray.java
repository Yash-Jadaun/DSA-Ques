public class SplitArray {
    
    public int splitArray(int[] nums, int m){
        int start=0;
        int end=0;

        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
             end += nums[i];
            
        }


        //binary search

        while(start < end){
        // try for the potential ans 

        int mid = start + (end - start)/2;

        //calculate how many peices u can divide this in with this max sum
        int sum = 0;
        int peices = 1;

        for(int num:nums){
            if(sum + num > mid){
                //u cannot add this in this subarray, make new one
                //say u add this num in new subarray, then sum = num
                sum = num;
                peices++;

            }else{
                sum += num;
            }
        }

       if(peices>m){
        start = mid + 1;
       }else{
        end = mid;
       }

        }

        return end; //here start == end

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
    }
}
