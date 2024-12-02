public class uniqueNum {
   
   
   public static int unique(int[] arr){
       int uniqueNum=0;
       for(int i=0;i<arr.length;i++){
        uniqueNum+=arr[i];
   
    }
    return uniqueNum;

   }
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        int [] arr ={-2,3,2,-4,4,5,-5};
        int check = unique(arr);
        System.out.println(check);
    }
}
