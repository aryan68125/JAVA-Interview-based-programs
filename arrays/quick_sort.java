//This program uses quick sort on the array to sort the elements
import java.util.*;
public class quick_sort
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

    //quick sort algorithm
    System.out.println("Press 1 : Perform quick sort using forloop on the array");
    System.out.println("Press 2 : Perform quick sort using recursion on the array");
    int choice = sc.nextInt();
    if(choice ==1)
    {
      //quick sort using loop
      System.out.println("Performing quick sort using forloop on the array");
      // bubbleSortUsingLoop(arr);
      // //print array after bubble sort is complete
      // PrintArray(arr,0);
      // System.out.println("\n");
    }
    else if(choice==2)
    {
      //quick sort using recursion
       System.out.println("Performing quick sort using recursion on the array");
       quick_sortUsingRecursion(arr, 0, arr.length-1);
       //print array after quick sort is complete
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
  //This function applies quick sort using recursion
  static void quick_sortUsingRecursion(int arr[], int low, int high) //handleing recursion
  {
    if(low<high)
    {
      int indexPI = partition(arr,low,high); //partition the array logically
      quick_sortUsingRecursion(arr,low,indexPI-1); //left partition
      quick_sortUsingRecursion(arr,indexPI+1,high); // right partition
    }
  }
  static int partition(int arr[], int low,int high) //handleing quick sort logic partition logic and
                                                    // sorting of elements
  {
    int swapIndex = low-1;
    int pivot = arr[high];
    for(int j = low;j<high;j++)
    {
      if(arr[j]<pivot)
      {
        swapIndex++;
        int temp=arr[j];
        arr[j]=arr[swapIndex];
        arr[swapIndex]=temp;
      }
    }
    int temp2 = arr[swapIndex+1];
    arr[swapIndex+1]= arr[high];
    arr[high]= temp2;
    return swapIndex+1;
  }
}
