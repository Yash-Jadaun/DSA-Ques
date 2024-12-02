public class ithbit {
    public static int getithBit(int number,int i){
        return (number >>i) & 1;
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int number=27;
        int i=1;

        int ans = getithBit(number, i);
        System.out.println(ans);
    }
}
