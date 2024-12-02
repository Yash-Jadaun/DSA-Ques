import java.util.Scanner;
import java.lang.Integer;
public class Ass4 {
    
    
    static void max(){
        // largest(2, 3, 4);
        
    //    System.out.println(largest());
    //    System.out.println(smallest());
   

    }
    
    
    
    // static int largest(){
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("enter first num");
    //     int first = s.nextInt();
    //     System.out.println("enter second num");
    //     int second = s.nextInt();
    //     System.out.println("enter third num");
    //     int third = s.nextInt();

    //     int max = first;
    //     if(second > max){
    //         max = second;
    //     }
    //     if(third>max){
    //         max = third;
    //     }
    //     System.out.println("max is");
    //     return max;
    // }



    // static int smallest(){
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("enter first num");
    //     int first = s.nextInt();
    //     System.out.println("enter second num");
    //     int second = s.nextInt();
    //     System.out.println("enter third num");
    //     int third = s.nextInt();

    //     int min = first;
    //     if(second < min){
    //         min = second;
    //     }
    //     if(third<min){
    //         min = third;
    //     }
    //     System.out.println("min is");
    //     return min;
    // }

    
    
    
    // static void evenodd(){
    //       Scanner s = new Scanner(System.in);
    //       System.out.println("enter num");
    //         int num = s.nextInt();
    //         if(num%2==0){
    //             System.out.println("even number");
    //         }else{
    //             System.out.println("odd");
    //         }


          
    // }


    // static void vote(){
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("enter age");
    //     int age = s.nextInt();
    //     if(age>=18){
    //         System.out.println("you are eligible");
    //     }else{
    //         System.out.println("You are not eligible");
    //     }
        
    // }


    //   static void sum(){
    //     System.out.println("enter how many numbers you want sum");
    //     Scanner s = new Scanner(System.in);
    //     int n = s.nextInt();
    //     int sum=0;
    //     while(n>0){
    //         System.out.println("enter num");
    //         int num = s.nextInt();
    //         if(num>0 || num<0){
    //             sum+=num;
    //         }else{
    //             break;
    //         }
           
    //     }System.out.println("Sum of numbers is:" + " " + sum);
    //   }
    
    
        // static void prod(){
        //     Scanner s= new Scanner(System.in);
        //     System.out.println("enter first num");
        //     int num1 = s.nextInt();
        //     System.out.println("enter num2");
        //     int num2 = s.nextInt();
        //     int prod = num1*num2;
        //     System.out.println("The product is" + " " + prod);
        // }




        //    static void circle(){
        //     Scanner s = new Scanner(System.in);
        //     System.out.println("enter radius of circle");
        //     float r = s.nextFloat();
        //     float area = 3.14f*r*r;
        //     float circum = 2*3.14f*r;
        //     System.out.println("Area of circle is" + area);
        //     System.out.println("Circumference of circle is" + circum);



        //    }
    
    
            //    static boolean isprime(int n){
            //     if(n<=1)
            //      return false;


            //      for(int i=2;i<n;i++)
            //      if(n%i==0)
            //      return false;

            //      return true;
            //    }
    
                 
            //   static void grades(){
            //     System.out.println("enter your marks");
            //     Scanner s = new Scanner(System.in);
            //     int marks = s.nextInt();
            //     if(91<=marks && marks<=100){
            //         System.out.println("AA");
            //     }
            //     else if(81<=marks && marks<=90){
            //         System.out.println("AB");
            //     }
            //     else if(71<=marks && marks<=80){
            //         System.out.println("BB");
            //     }
            //     else if(61<=marks && marks<=70){
            //         System.out.println("BC");
            //     }
            //     else if(51<=marks && marks<=60){
            //         System.out.println("CD");
            //     }
            //     else if(41<=marks && marks<=50){
            //         System.out.println("DD");
            //     }
            //     else{
            //         System.out.println("fail");
            //     }
            //   }
    
            
            // static void factorial(){
            //     int fact=1;
            //     Scanner s = new Scanner(System.in);
            //     System.out.println("enter factorial");
            //     int num = s.nextInt();
            //     for(int i=2;i<=num;i++){
            //         fact*=i;
                    
            //     }System.out.println("The factorial of a number is:" + " " + fact);

            // }
    



        //    static void palindrome(){
        //     Scanner s = new Scanner(System.in);
        //         System.out.println("enter a string");
        //         String st = s.nextLine();
        //         int n = st.length();
        //         boolean ispalindrome = true;

        //         for(int i=0;i<n/2;i++){
        //             if(st.charAt(i)!=st.charAt(n-1-i)){
        //                ispalindrome=false;
        //                break;
        //             }
        //         }if(ispalindrome){
        //             System.out.println("palindrome");
        //         }else{
        //             System.out.println("not palindrome");
        //         }
            
        //    }


        // static void pythagoras(){
        //     Scanner s= new Scanner(System.in);
        //     System.out.println("enter first num");
        //     int first = s.nextInt();
        //     System.out.println("enter second num");
        //     int second = s.nextInt();
        //     System.out.println("enter third num");
        //     int third = s.nextInt();
        //     if(first*first+second*second==third*third){
        //         System.out.println("pythagoras triplet follows");
        //     }else{
        //         System.out.println("no pythagoras triplet follow");
        //     }
        // }


    //     static void prime(){
    //     Scanner s=new Scanner(System.in);
    //     int lowerbound,upperbound;

    //     System.out.println("enter lower bound of the interval");
    //     lowerbound = s.nextInt();

    //     System.out.println("enter upper bound of the interval");
    //     upperbound = s.nextInt();

    //     s.close();


    //  System.out.printf("\nprime numbers bw %d and %d are" ,lowerbound,upperbound);

    //      for(int i=lowerbound;i<=upperbound;i++){

    //         if(i==1 || i==0)
    //         continue;


    //         if(isprime(i)){
    //             System.out.println(i);
    //         }

    //        }

    //    }



    //    static boolean isprime(int num){
    //     if(num<=1){
    //         return false;
    //     }
    //     for(int j=2;j<=num/2;j++){
    //         if(num%j==0){
    //             return false;
    //         }
    //     }
    //        return true;

    //    }






    // static void func(){
    //     Scanner s = new Scanner(System.in);

    //     int lowerbound,upperbound;

    //     System.out.println("enter lower bound of the interval:");
    //     lowerbound=s.nextInt();


    //     System.out.println("enter upper bond of the interval:");
    //     upperbound = s.nextInt();

    //     s.close();

    //     System.out.printf("\nprime numbers bw %d and %d are",lowerbound,upperbound);
    
    //     for(int i=lowerbound;i<=upperbound;i++){
    //         if(i==1||i==0)
    //         continue;

    //         if(isprime(i)){
    //             System.out.println(i);
    //         }

            
    //     }
    
    
    
    
    
    // }



    // static boolean isprime(int num){
    //     if(num<=1){
    //         return false;
    //     }
    //     for(int j=2;j<=Math.sqrt(num);j++){
    //         if(num%j==0)
    //         return false;
    //     }
    

    //        return true;

    // }


      

    //    static void sum(){
    //     int sum=0;
    //     Scanner s=new Scanner(System.in);
    //     System.out.println("enter the value of n");
    //     int n = s.nextInt();
    //     for(int i=1;i<=n;i++){
    //         sum+=i;
    //     }
    //     System.out.println("The sum of numbers is:" + " " + sum);

    //    }
       

    // ------------Assignment 4 Completed-------------------





















    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // max();

        // evenodd();

        // vote();

        // sum();

        //    prod();
        // circle();
           
    //   System.out.println(isprime(1));
        
        //   grades();

        // factorial();

        //    palindrome();

            // pythagoras();

            // prime();

            sum();
    
        
    }
}
