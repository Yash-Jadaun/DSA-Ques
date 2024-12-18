public class reverseanum {
   
    public static int reverse(int n){
     
        int reversed =0;

        while(n!=0){
            int lastDigit = n%10;

            reversed = reversed * 10 + lastDigit;
            n=n/10;
        }
        return reversed;



    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        int n=1182821;
        int ans = reverse(n);

        if(n==ans){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
