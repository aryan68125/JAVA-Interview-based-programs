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

    System.out.println("Press 1 : Perform bubble sort using forloop on the array");
    System.out.println("Press 2 : Perform bubble sort using forloop on the array (Optimized version)");
    System.out.println("Press 3 : Perform bubble sort using recursion on the array");
    int choice = sc.nextInt();
    if(choice ==1)
    {
      //bubble sort using loop
      System.out.println("Performing bubble sort using forloop on the array");
      bubbleSortUsingLoop(arr);
      //print array after bubble sort is complete
      PrintArray(arr,0);
      System.out.println("\n");
    }
    else if(choice==2)
    {
      //bubblesort using loop optimized version
      System.out.println("Performing bubble sort using forloop on the array (Optimized version)");
      bubbleSortUsingLoopOptimized(arr);
      //print array after bubble sort is complete
      PrintArray(arr,0);
      System.out.println("\n");
    }
    else if(choice==3)
    {
      //bubble sort using recursion
       System.out.println("Performing bubble sort using recursion on the array");
       bubbleSortUsingRecursion(arr, arr.length);
       //print array after bubble sort is complete
       PrintArray(arr,0);
       System.out.println("\n");
    }
    else
    {
      System.out.println("Wrong choice");
    }
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
  //bubble sort using loop optimized version
  public static void bubbleSortUsingLoopOptimized(int arr[])
  {
    /*
    The reason why we are using arr.length-1 in the loop for passes because j+1
    will go out of bounds if we would have run the loop for arr.length
    */
    for(int i =0;i<arr.length-1;i++) //loop for number of passes
    {
      // for optimization when array is already sorted and no swapping happens
      boolean swapped = false;
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
          swapped = true;
        }
      }
      /*
      This will stop the passes loop from progressing anyfurther if there is no
      swapping happening in any iteration of a particular pass which would mean
      that the array elements are already sorted.
      */

      if(swapped==false)
      {
        break;
      }
    }
  }

  //bubble sort using recursion
    public static void bubbleSortUsingRecursion(int arr[],int n) //n = arr.length
    {
           // Base case
      if (n == 1)
          return;

       int count = 0;
      // One pass of bubble sort. After
      // this pass, the largest element
      // is moved (or bubbled) to end.
      for (int i=0; i<n-1; i++)
          if (arr[i] > arr[i+1])
          {
              // swap arr[i], arr[i+1]
              int temp = arr[i];
              arr[i] = arr[i+1];
              arr[i+1] = temp;
                count = count+1;
          }

        // Check if any recursion happens or not
        // If any recursion is not happen then return
       if (count == 0)
          return;

       // Largest element is fixed,
       // recur for remaining array
       bubbleSortUsingRecursion(arr, n-1);
    }
}
