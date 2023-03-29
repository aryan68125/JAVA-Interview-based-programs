//calculate the next fibnocci number in a fibnocci series
import java.util.*;
public class fibnocci
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of the fibnocci numbers you want to print");
    int num = sc.nextInt();
    for(int i=0;i<num;i++)
    {
      System.out.print(fib(i)+" ");
    }
  }
  static int fib(int n)
  {
  if (n==0)
  {
    return 0;
  }
  if(n==1 || n==2)
  {
    return 1;
  }
  return fib(n-1)+fib(n-2);
  }
}
