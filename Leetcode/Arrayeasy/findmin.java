public class findmin {
    static int min(int[] arr){
      if(arr.length==0){
        return -1;

      }
      for(int i=0;i<arr.length;i++){
        int min=arr[0];
        if(arr[i]<min){
            min=arr[i];
            return min;
        }
      }return -1;
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int [] arr={1,2,-9,4,0};
        System.out.println(min(arr));
    }
}
