import java.util.Arrays;
public class leetcode {
    
    
    // static int[] permutation(int[] nums){
        
    //     int [] ans=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         ans[i]=nums[nums[i]];
           
            
    //     } return ans;
        

    // }




    //  static int[] concat(int[] nums){
    //     int [] ans=new int[2*nums.length];
    //     for(int i=0;i<nums.length;i++){
           
    //         for(int j=0;j<i;j++){
    //             ans[i]=nums[i];
    //             ans[i+nums.length]=nums[i];
                
    //         }
    //     }return ans;

    //  }



        // static int [] runningSum(int [] nums){
        //     int [] runningSum = new int[nums.length];
        //     runningSum[0] = nums[0];
          
        //     for(int i=0;i<nums.length;i++){
        //         for(int j=i+1;j>i;j++){
        //            runningSum[i]=nums[i]+nums[j];
        //         }

        //     }return runningSum;
        // }




        // static int[] runningSum(int[] nums) {
        //     int[] runningSum = new int[nums.length];
        //     int sum = 0;
        //     for (int i = 0; i < nums.length; i++) {
        //         sum += nums[i];
        //         runningSum[i] = sum;
        //     }
        //     return runningSum;
        // }
        
    





           static int accounts(int[][] accounts){
            int maxWealth=0;
            for(int i=0;i<accounts.length;i++){
                int currentWealth=0;
                for(int j=0;j<accounts[i].length;j++){
                    currentWealth+=accounts[i][j];

                }
                if(currentWealth>maxWealth){
                    maxWealth=currentWealth;
                }



                }return maxWealth;
            }

           
    
    
    
    
    
    
    
    public static void main(String[] args) {
    //    int[] nums={1,2,1};
    //    System.out.println(Arrays.toString(permutation(nums)));

        //   System.out.println(Arrays.toString(concat(nums)));
        
        // int[] result = runningSum(nums);
        // System.out.println(Arrays.toString(runningSum(nums)));

        int[][] account1={{1,2,1},{20,2,1},{4,5,6}};
        System.out.println(accounts(account1));
    }
}
