package Leetcode.NewQues;

public class Ques1 {
    public static void allStr(char[] set, int k, String current) {
        // Base case: If we reach the end of the string, return 0
        if (current.length()==k) {
            System.out.println(current);
            return;
        }

       for(int i=0;i<set.length;i++){
          allStr(set, k, current+set[i]);
       }
    }
    public static void main(String[] args) {
          // Input character array
          char[] st = {'a', 'b'};
        
          int k=10;

          allStr(st, k, "");
          
         
    }
}
