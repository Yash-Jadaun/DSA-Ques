
import java.io.*;
import java.util.Scanner;

public class Ass3 {
	
	//ques 21
		// static void Fibo(int N){
		// 	int num1 = 0, num2 = 1;
		// 	for(int i =0; i<N; i++){
		// 		//Print the Number
		// 		System.out.print(num1 + " ");
				
		// 		//swap
		// 		int temp = num1 + num2;
		// 		num1 = num2;
		// 		num2 =temp;
		// 	}
		// }



        //ques print sum of terms of fibo series

		// static void fiboSum(int N){
		// 	int num1 = 0;
		// 	int num2 = 1;
			
        //     int sum =0;
		// 	for(int i =3;i<=N;i++){
		// 		 int num3 = num1+num2;
		// 		  num1 = num2;
		// 		  num2 = num3;

		// 		 sum += i;


		// 	}System.out.print(sum);


		// }


		//Fibo sum using index
		// static void fiboSum(int n){
		// 	int num1 =0,num2 = 1;
		// 	int fibo [] = new int[n+1];
		// 	fibo[0] = 0; fibo[1] =1;

		// 	int sum = fibo[0] + fibo[1];
			
		// 	for(int i =2;i<=n;i++){
		// 		fibo[i] = fibo[i-1] + fibo[i-2];
		// 		sum += fibo[i];
		// 	}
		// 	System.out.print(sum);
		// 		}



   //ques23
		// static void factors(){
		// 	Scanner s = new Scanner(System.in);
		// 	System.out.println("Enter a number");
		// 	int n = s.nextInt();
		// 	for(int i=1;i<=n;i++){
		// 		if(n%i==0){
		// 			System.out.println("Factors of n is:" + " " + i);
		// 		}
		// 		else{

		// 		}
	
		// 	}
		// }
	
     
		// static void sum(){
		// 	int sum =0;
		// 	Scanner s = new Scanner(System.in);
		// 	System.out.println("Enter the value of n");
		// 	     int  n = s.nextInt();
		// 	// int n =2;
		// 	for(int i=1;i<=n;i++){
		// 		System.out.println("Enter the value of num");
		// 		int num = s.nextInt();
                
		// 		if(num >0 || num<0){
		// 			sum+=num;
					
		// 		}else{
		// 			break;
		// 		}
				


				
				


				

		// 	}
		// 	System.out.println("The sum is:" + " " + sum);

		// }



		//ques 25
		// static void max(){
			// int sum =0;
			// Scanner s = new Scanner(System.in);
			// System.out.println("Enter the value of n");
			//      int  n = s.nextInt();
			// int n =2;
		// 	     int max = Integer.MIN_VALUE;
		// 	for(int i=1;i<=n;i++){
		// 		System.out.println("Enter the value of num");
		// 		int num = s.nextInt();
                
		// 		if(num >0 || num<0){
		// 			// sum+=num;
					
		// 		}if(num==0){
		// 			break;
		// 		}
		// 		if(max<i){
		// 			max = i;
		// 		}
				
        //         }
		// 	System.out.println("The max is:" + " " + max);

		// }


		// Intermediate Programs

		//ques1
		// static void factorial(){
		// Scanner s = new Scanner(System.in);
		// System.out.println("Enter num");
        // int num = s.nextInt();
		// long result = 1;
		// for(int i =1;i<=num;i++){
		// 	result *= i;
			
		// }
		// System.out.println(result);

		// }



		//ques4
		// static void discount(){
		// 	Scanner s = new Scanner(System.in);
		// 	System.out.println("Enter the list price");
		// 	int l = s.nextInt();
		// 	System.out.println("Enter selling price");
		// 	int sp = s.nextInt();
		// 	int d = l-sp;
		// 	int discountpercent = (d*100/l);
		// 	System.out.println("Your discount is"+ "  " + discountpercent + "%");
		// }


		//ques5
		// static void distance(){
		// 	Scanner s = new Scanner(System.in);
		// 	System.out.println("Enter the coordinates of the first point (x1 and y1)");
	    //      System.out.println("x1");
		// 	 double x1 = s.nextDouble();
		// 	 System.out.println("y1");
		// 	 double y1 = s.nextDouble();


		// 	 System.out.println("Enter the coordinates of the second point (x2 and y2)");
	    //      System.out.println("x2");
		// 	 double x2 = s.nextDouble();
		// 	 System.out.println("y2");
		// 	 double y2 = s.nextDouble();

		// 	 double distance =Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		// 	 System.out.println(distance);
			
	
		// }
	

		// static void power(){
		// 	Scanner s = new Scanner(System.in);
		// 	System.out.println("Enter the value of n");
		// 	int n = s.nextInt();
		// 	// int n=3;
		// 	// double power = Math.pow(n, 3);
		//     double power = Math.pow(n, 4);
		// 	System.out.println(power);
		// }


        
		//ques8
        

		// static int commission(){
		//     System.out.println("enter commission earned");
		// 	Scanner s = new Scanner(System.in);
		// 	int ce = s.nextInt();
		// 	System.out.println("enter total sales");
		// 	int ts = s.nextInt();
		// 	int CP = (ce*100/ts);
        //     return CP;
			
		// }


		//ques9

		// static int depreciation(){
		// 	Scanner s = new Scanner(System.in);
		// 	System.out.println("enter cost of asset");
		//     int ca = s.nextInt();
		// 	System.out.println("enter salvage value");
		// 	int sv = s.nextInt();
		// 	System.out.println("enter useful life");
		// 	int ul = s.nextInt();
		// 	int Annual_Depreciation_Expense = ca-sv/100;

	    //  	return Annual_Depreciation_Expense;
			
		// }


		//ques14
		// static void armstrong(){
		// Scanner s = new Scanner(System.in);
		// System.out.println("enter a number");
		// int n = s.nextInt();
		// int originalnumber = n;
		// int sum=0;
		
		// while(n>0){
		// 	int rem = n%10;
		// 	int num = rem*rem*rem;
		// 	sum+=num;
		// 	 n/=10;

			
            
		// }
		// if(sum==originalnumber){
		// 	System.out.println("armstrong number");
		// }else{
		// 	System.out.println("Not armstrong");
		// }
          
		// }
	


		//ques16
		// static void revstring(){
        //  Scanner s = new Scanner(System.in);
		//  String st = s.nextLine();
		//  char ch;
		//  String nstr = "";
		//  for(int i=0;i<st.length();i++){
		// 	ch = st.charAt(i);
		// 	nstr = ch+nstr;
		//  }
		//  System.out.println("Reversed word:" + nstr);
				

			

		// }



		//ques19
		// static int GCD(int x,int y){
		// 	if(x == 0)
		// 		if(x == 0)
		// 			return y;
		// 		if(y==0)
		// 			return x;

		// 			if(x==y)
		// 			return x;


		// 			if(x>y)
		// 			return GCD(x-y, y); //recursive substraction
		// 			return GCD(x,y-x);  //recursive substraction
		// 		}

			
		//ques20
		// static void lcm(int a,int b){
		// 	int ans = (a > b) ? a:b;
		// 	while(true){
		// 		if(ans%a==0 && ans%b==0){
        //            break;
				   
		// 		}ans++;
				
		// 	}
		// 	System.out.println(ans);

		// }


		//ques21
		//  static void vowel(){
		// 	char ch = 'b';
		    
        //     if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
        //       System.out.println("vowel");
		// 	}else{
		// 		System.out.println("consonent");
		// 	}
				
			
		// }
		 
        
		//ques22
		// static void perfect(){
		// 	int n =6;
		// 	int sum=0;
		// 	for(int i=1;i<=n;i++){
		// 		if(n%i==0){
		// 			sum+=i;
		// 		}
				
		// 	}
		// 	if(n==sum){
		// 		System.out.println("perfect num");
		// 	}else{
		// 		System.out.println("not perfect");
		// 	}
		// }


		//ques23
		// static void leapyear(int n){
		// 	if(n%4==0){
		// 		System.out.println("leapyear");
		// 	}else{
		// 		System.out.println("not leapyear");
		// 	}

		// }
        

		// static void sum(int n){
		// 	int sum=0;
		// 	while(n>0){
		// 		int rem = n%10;
		// 		sum+=rem;
		// 		n/=10;


		// 	}
		// 	System.out.println(sum);

		// }




		//ques25
		// public static int countEvenDaysInAugust() {
		// 	int evenDays = 0;
		// 	for (int day = 1; day <= 31; day++) {
		// 		if (day % 2 == 0) {
		// 			evenDays++;
		// 		}
		// 	}
		// 	return evenDays;
		// }
	

        //ques26
		// static void sum() {
		// 	int sump = 0;
		// 	int sumn = 0;
		// 	Scanner s = new Scanner(System.in);
		// 	System.out.println("Enter how many numbers you want to add:");
		// 	int n = s.nextInt();
	
		// 	while (n > 0) {
		// 		System.out.println("Enter the numbers:");
		// 		int N = s.nextInt();
	
		// 		if (N == 0) {
		// 			break; // Exit the loop if the input is 0
		// 		} else if (N > 0) {
		// 			sump += N;
		// 		} else if (N < 0) {
		// 			sumn += N;
		// 		}
	
		// 		n--; // Decrement the counter to process the correct number of inputs
		// 	}
	
		// 	System.out.println("The sum of positive numbers is: " + sump);
		// 	System.out.println("The sum of negative numbers is: " + sumn);
		// }
	
    
	
	
	
	
	
		public static void main(String[] args) {
        // int N = 8;
		// Fibo(8);

        // int N = 8;
		// fiboSum(8);

		// fiboSum(4);
		// factors();

		// sum();
		// max();

		// factorial();

		// discount();

	    // distance();

		// power();

		//  System.out.println(commission());

		// System.out.println(depreciation());

		// armstrong();

		// revstring();

		// int x = 4,y=2;
		// System.out.println("GCD of" + " " + x + " " + "and" + " " + y + " " + "is"  + " " + GCD(x, y));
       

		// lcm(4, 2);

		// vowel();

		// perfect();

		// leapyear(2016);

		// sum(153);

		//    go(31);

	// 	int evenDays = countEvenDaysInAugust();
    //     System.out.println("Kunal can go out " + evenDays + " days in August.");
    // }



	    sum();


         






//ques1
// Scanner s = new Scanner(System.in);
// System.out.println("Enter radius of circle");
// float r = s.nextFloat();
// float area = (2f*3.14f*r);
// System.out.println("Area of circle is" + " " + area);


//ques2

// Scanner s = new Scanner(System.in);
// System.out.println("Enter length of base");
// float b = s.nextFloat();
// System.out.println("Enter height");
// float h = s.nextFloat();
// float area = (1*b*h/2);
// System.out.println("Area of circle is" + " " + area);


//ques21
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// int p = 0;
// int c = 1;
// int count = 2;
// while(count<=n){
//     int temp =c;
//   c = c+p; 
//    p = temp;
//    count++;                

// }
// System.out.print(count);


//ques 23
// System.out.println("Enter an integer");
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// for(int i =1;i<n;i++){
// 	if(n % i == 0){
// 		System.out.println("Factors of this number is" + " " + i);
// 	    }
// 	else{
		
// 	}
	
// }


//ques24
//  int sum =0;   
// System.out.println("Enter the value of num");
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// int i = 2;

// while(i>0){
// 	System.out.println("Enter a number");
// 	int num = s.nextInt();
// 	if(num>0 || num<0){
// 		// num+=n;
// 		sum+=num;
		
// 		i++;
// 	}
// 	else{
// 		break;
// 	}
// }
// System.out.println("Sum of the entered:" + " " + sum);
// s.close();

	
//ques25

// Scanner s = new Scanner(System.in);
// int max = Integer.MIN_VALUE;
// int i =0;
// while(true){
// 	System.out.println("Enter the value of n");
// 	int n = s.nextInt();
// 	if(n==0){
// 		break;

// 	}
// 	if(n>max){
// 		max =n;
// 	}
// 	i++;
// }

// System.out.println("Maximum number entered" + " " + max);


		}}










    

