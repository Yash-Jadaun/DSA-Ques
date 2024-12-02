package ArraysMedium;
import java.util.*;

public class insertremovedelete {
   
   class RandomizedSet{
    private ArrayList<Integer> nums;
    private HashMap<Integer, Integer> valToIndex;
    private Random random;
   
  public RandomizedSet(){
    nums = new ArrayList<>();
    valToIndex = new HashMap<>();
    random = new Random();
  }


  public boolean insert(int val){
    if(valToIndex.containsKey(val)){
        return false;
    }
    valToIndex.put(val, nums.size());
    nums.add
  }









}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        
    }
}
