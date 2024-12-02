
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int ans =0;
        while(true){
            System.out.println("Enter the Operator");
            char op = s.next().trim().charAt(0);
             if(op == '+' || op == '-' || op == '/' || op == '%' ){
                //input two numbers
                System.out.println("Enter number 1");
                int num1 = s.nextInt();
                System.out.println("Enter number 2");
                int num2 = s.nextInt();


                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1/num2;
                    }
                
                }
                else if(op == '%'){
                    ans = num1 % num2;
                }

                System.out.println("The result is:" +  ans);
            }else{
                System.out.println("Invalid Operator");
            }
             
          
        }
        
   
    }
}
