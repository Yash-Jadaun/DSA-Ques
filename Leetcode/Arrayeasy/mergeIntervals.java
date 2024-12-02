import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import java.util.Comparator;
public class mergeIntervals {

    public static int[][] merge(int[][] intervals){
          if(intervals.length<=1)
          return intervals;

       Arrays.sort(intervals,Comparator.comparing(i -> i[0]));
       
       List<int[]>result = new ArrayList<>();

       int[] newInterval = intervals[0];
       result.add(newInterval);

       for(int[] interval : intervals){
        if(interval[0]<=newInterval[1])

        newInterval[1] = Math.max(newInterval[1],interval[1]);
       
        else{
            newInterval = interval;
            result.add(newInterval);
        }
       }

       return result.toArray(new int[result.size()] []);
    }












    public static void main(String[] args) {
     int [][] intervals ={{1,3},{2,6},{8,10},{15,18}};
    
     System.out.println(Arrays.deepToString(merge(intervals)));
}
}
