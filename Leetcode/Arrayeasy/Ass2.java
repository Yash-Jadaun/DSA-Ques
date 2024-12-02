 import java.util.Scanner;
public class Ass2 {
    public static void main(String[] args) {
        //Ques1

        // System.out.println("Enter a number");
        // Scanner s= new Scanner(System.in);
        // int num = s.nextInt();

        // if(num % 2 == 0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }



        //Ques 2
        // System.out.println("Enter a Name");
        // Scanner s = new Scanner(System.in);
        // String name = s.nextLine();
        // System.out.println("Good Morning" + " " + name);



        //Ques3
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter the principal value");
        // Float p = s.nextFloat();
        // System.out.println("Enter the time");
        // int t = s.nextInt();
        // System.out.println("Enter the rate");
        // Float r = s.nextFloat();

        // Float Si = (p*t*r)/100;

        // System.out.println("Simple Interest is:" + " " + Si);

        

        //Ques4
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter num 1");
        // Float num1 = s.nextFloat();
        // System.out.println("Enter num 2");
        // Float num2 = s.nextFloat();

        // System.out.println("Enter the operator");
        // char op = s.next().trim().charAt(0);

        // if(op == '+'){
        //     Float result = num1 +num2;
        //     System.out.println(result);

        // }
        // else if(op == '-'){
        //     Float result = num1 - num2;
        //     System.out.println(result);
        // }
        // else if(op == '*'){
        //     Float result = num1 * num2;
        //     System.out.println(result);
        // }
        // else if(op == '/'){
        //     Float result = num1/num2;
        //     System.out.println(result);
        // }
        
        // else{
        //     System.out.println("Invalid Operator");
        // }



        //Ques5

        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter num1");
        // int num1 = s.nextInt();
        // System.out.println("Enter num2");
        // int num2 = s.nextInt();

        // if(num1 == num2){
        //     System.out.println("Both nums are equal");
        // }else{
        //     int maxnum = Math.max(num1,num2);
            
        //      System.out.println("Greater number is " + " " + maxnum);
        // }



        //Ques6
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter the currency in rupees");
        // Float rs = s.nextFloat();
        // Float dl = (0.012f * rs);
        // System.out.println(dl);

       

    
    
        //Ques7

        //Fibo
        // int term,a =0,b=1,c;
        // System.out.println("Enter term");
        // Scanner s = new Scanner(System.in);
        // term = s.nextInt(); 
        // for(int i=1; i<=term; i++){
        //     System.out.print(a + " ");
        //     c = a+b;
        //     a = b;
        //     b =c;
            

            
        // }


        //  To print sum of n fibonacci series
        //    System.out.println("Enter term");
        // Scanner s = new Scanner(System.in);
        // int term = s.nextInt();
        // int a = 0;
        // int b = 1;
        // int sum =0;
        // for(int i =0;i<term ;i++){ sum += a; //Ye isliye kara kiyuki a is the current fibonacci number at each iteration
        //     int c = a+b;
        //         c = b;
        //         b = a;

               
        //         sum += c;

              
        //  }
        //  System.out.println(sum);



        //Palindrome
        
        // System.out.println("Enter a String");
        // Scanner s= new Scanner(System.in);
        // String a = s.nextLine();
        
        // for(int i =0; i<a.length(); i++){
        //     for(int j = a.length() - 1; j>a.length(); j--){
        //         if(a.charAt(i) == a.charAt(j)){
        //          System.out.println("Palindrome");
        //         }else{
        //             System.out.println("Not Palindrome");
        //         }
        //     }
        // } 

      
        // System.out.println("Enter a String");
        // Scanner s = new Scanner(System.in);
        // String a = s.nextLine();
        // boolean isPalindrome = true;
        // int length = a.length();

        // for(int i = 0; i< length / 2; i++){
        //     if(a.charAt(i) != a.charAt(length - 1 -i)){
        //         isPalindrome = false;
        //         break;
        //     }
        // }

        // if(isPalindrome){
        //     System.out.println("Palindrome");
        // }else{
        //     System.out.println("Not Palindrome");
        // }



        //wrost Approach
        // System.out.println("Enter a String");
        // Scanner s = new Scanner(System.in);
        // String a = s.nextLine();
        // boolean isPalindrome = true;
        // int length = a.length();
        // for(int i=0;i<length -1;i++){
        //     for(int j = length - 1 - i;j>i ;j++){
        //        if(i == length - 1 - j){
        //         if(a.charAt(i) != a.charAt(j)){
        //             isPalindrome = false;
        //             break;
        //        }
                
        //     }
           
        // }
        // if(!isPalindrome){
        //     break;
        // }
        // }

        // if(isPalindrome){
        //     System.out.println("Palindrome");
        // }else{
        //     System.out.println("Not Palindrome");
        // }


        //Ques9 Armstrong Number
         
        // int n,arm=0,rem,c;
        // System.out.println("Enter a number");
        //  Scanner s = new Scanner(System.in);
        //   n = s.nextInt();
        //   c= n;
        //   while(n>0){
        //    rem = n%10;
        //    arm =(rem * rem * rem)+ arm;
        //    n = n/10;
                
        //   }
        //   if(c == arm){
        //     System.out.println("Armstrong Number");
        //   }else{
        //     System.out.println("Not Armstrong");
        //   }




























    }
    
}
