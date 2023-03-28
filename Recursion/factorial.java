//Java Program to find the Factorial of a Number
import java.util.*;
public class factorial
{
     public static void main(String []args)
     {
        //Take input from the user
        //Create an instance of the Scanner Class
        Scanner sc=new Scanner(System.in);
        //Declare and Initialize the variable
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        System.out.println("Factorial of the number: "+ fact(num));
     }
     //recursive function that calls itself until a base condition is met here the base condition is 1 and it's calculating factorial.
     static int fact(int n)
     {
       if (n>1)
         {
           return n*fact(n-1);
         }
       else
       {
          return 1 ;
       }
     }
}
