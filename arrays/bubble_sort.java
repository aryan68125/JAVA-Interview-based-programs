//Bubble sort program
import java .util.*;
public class bubble_sort
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements inside the array one by one");
    EnterElementsInAttay(arr,0);
    System.out.println("Printing the array");
    PrintArray(arr,0);
    System.out.println("\n");

    //bubble sort using loop
    System.out.println("Performing bubble sort using forloop on the array");
    bubbleSortUsingLoop(arr);
    //print array after bubble sort is complete
    PrintArray(arr,0);
    System.out.println("\n");
  }
  //This function will enter the elements in the array
  static void EnterElementsInAttay(int arr[], int i)
  {
    if(i==arr.length)
    {
      return;
    }
    Scanner sc2 = new Scanner(System.in);
    arr[i] = sc2.nextInt();
    EnterElementsInAttay(arr,i+1);
  }
  //This function will print the array
  static void PrintArray(int arr[],int i)
  {
      if(i == arr.length)
      {
        return;
      }
      System.out.print(arr[i] + " ");
      PrintArray(arr,i+1);
  }
  //bubble sort using loop
  public static void bubbleSortUsingLoop(int arr[])
  {
    /*
    The reason why we are using arr.length-1 in the loop for passes because j+1
    will go out of bounds if we would have run the loop for arr.length
    */
    for(int i =0;i<arr.length-1;i++) //loop for number of passes
    {
      /*
       pass 1 : i=0 len=5
                j< len - 0 -1 ; 5-0-1=4
                j will run from 0 to 4 (number of iterations in each pass)
       pass 2 : i=1 len=5
                j< len - 1 -1 ; 5-1-1=3
                j will run from 0 to 3 (number of iterations in each pass)
       pass 2 : i=2 len=5
                j< len - 2 -1 ; 5-2-1=2
                j will run from 0 to 2 (number of iterations in each pass)
      pass 2 : i=3 len=5
               j< len - 3 -1 ; 5-3-1=1
               j will run from 0 to 1 (number of iterations in each pass)
      */
      for(int j = 0;j<arr.length-i-1;j++) //loop for number of iterations
      {
        if(arr[j]>arr[j+1])
        {
          int temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
}
