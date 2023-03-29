//This program will calculate the power of a number when the power is a positive number.
import java.util.*;
public class power
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The number");
      long x = sc.nextLong();
      System.out.println("Enter the power of the number");
      long num = sc.nextLong();
      System.out.println("Power of the number "+x+ "^"+num+ " = "+p(x,num));
    }
    static long p(long x, long n)
    {
      if (n!=0)
      {
        return x*p(x,n-1);
      }
      else
      {
        return 1;
      }
    }
}
