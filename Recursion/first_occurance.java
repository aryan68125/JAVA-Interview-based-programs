//This program will print the first occurance of an element in the array
import java.util.*;
public class first_occurance
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the element one by one in the array");
    // for(int i = 0;i<size;i++)
    // {
    //   arr[i]=sc.nextInt();
    // }
    enterArray(arr,0);
    System.out.println("Printing the array elements");
    printArray(arr,0);
    }

    //Enter elements in the array recursively
    static void enterArray(int arr[],int i)
    {
        if(i==arr.length)
        {
          return;
        }
        Scanner sc2 = new Scanner(System.in);
        arr[i] = sc2.nextInt();
        //i++ will not be accepted here it will cause the code to explode use i+1 instead
        enterArray(arr,i+1);
    }
    //Print elements in the array recursively
    static void printArray(int arr[],int i)
    {
        if(i==arr.length)
        {
          return;
        }
        System.out.println(arr[i]);
        //i++ will not be accepted here it will cause the code to explode use i+1 instead
        printArray(arr,i+1);
     }
}
