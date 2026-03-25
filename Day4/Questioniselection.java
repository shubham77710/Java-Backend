public class Questioniselection {
    public static void main(String[] args) {
        // number is positive or not
        // int i = 1;
        // if( i >= 0 ){
        //     System.out.println("i is a positive number");
        // }
        // else{
        //     System.out.println("i is not a positive number");
        // }

        //Even or odd
        // int i = 1;
        // if( i % 2 == 0 ){
        //     System.out.println("i is a even number");
        // }
        // else{
        //     System.out.println("i is a odd number");
        // }

        //voting eligibility
        // int age = 18;
        // if( age >= 18 ){
        //     System.out.println("Eligible for voting");
        // }
        // else{
        //     System.out.println("Not Eligible for voting");
        // }

        //Greater two numbers
        // int i = 10;
        // int j = 30;
        // if( i > j ){
        //     System.out.println("i is greater than j");
        // }
        // else{
        //     System.out.println("i is not greater than j");
        // }

        //Temperature Category
        // int temp1 = 82;
        // if(temp1 < 10){
        //     System.out.println("Very Cold");
        // }
        // else if( temp1 >= 10 && temp1 < 25){
        //     System.out.println("Moderate");
        // }
        // else
        //     System.out.println("Hot");

        //Student Grade Card
        // int number = 82;
        // if(number > 90){
        //     System.out.println("Grade A");
        // }
        // else if( number >= 75){
        //     System.out.println("Grade B");
        // }
        // else if( number >= 60){
        //     System.out.println("Grade C");
        // }
        // else if( number >= 40){
        //     System.out.println("Grade D");
        // }
        // else{
        //     System.out.println("Fail");
        // }

        //Largest Of Three Numbers
        
        // int n1 = 4 , n2 = 6, n3 = 2 ;
        // if( n1 > n2 && n1 > n3){
        //     System.out.println("n1 is largest");
        // }
        // else if( n2 > n1 && n2 > n3){
        //     System.out.println("n2 is largest");
        // }
        // else{
        //     System.out.println("n3 is largest");
        // }

        //Number sign check
        // int number = 0 ;
        // if( number > 0){
        //     System.out.println("Positive");
        // }
        // else if( number < 0 ){
        //     System.out.println("Negative");
        // }
        // else{
        //     System.out.println("Number is eual to zero");
        // }

        //Day of week
        // int i = 3 ;
        // switch (i) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     default:
        //         System.out.println("Sunday");
        //         break;
        // }

        // Simple Calculator
        // int i = '/' ;
        // int a = 5 , b = 2;
        // switch (i) {
        //     case '+':
        //         System.out.println("Addition"+" "+(a+b));
        //         break;
        //     case '-':
        //         System.out.println("Subtraction"+" "+(b-a));
        //         break;
        //     case '*':
        //         System.out.println("Multilication"+" "+(a*b));
        //         break;
        //     default:
        //         System.out.println("Division"+" "+(a/b));
        //         break;
        // }

        // Challenge Question
        int year = 2024;
        if( year%4==0 || year%400==0){
            System.out.println("The Year is Leap Year");
        }
        else
            System.out.println("The year is not leap year");
    }
}
