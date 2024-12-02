public class Floorofno {
    
    
    
    
    static int floor(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int mid = start + (end - start)/2;

            if(target>arr[arr.length-1]){
                return -1;
            }
            else if(target<arr[mid]){
                  end = mid - 1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }return arr[end];
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int target = 15;
        int [] arr = {2,3,5,9,14,16,18};
        System.out.println(floor(arr, target));
    }
    
}
