import java.util.*;
public class insertion_sort
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

    //performing insertion sort
    System.out.println("Press 1 : Perform Insertion sort using loop");
    System.out.println("Press 2 : Perform Insertion sort using recursion");
    int choice = sc.nextInt();
    if(choice == 1)
    {
      //insertion sort using loop
      System.out.println("Performing insertion sort using loop");
      insertionSortUsingLoop(arr);
      PrintArray(arr,0);
      System.out.println("\n");
    }
    else if(choice == 2)
    {
      //insertion sort using recursion
      System.out.println("Performing insertion sort using recursion");
      insertionSortRecursive(arr,arr.length);
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
  //insertion sort using loop
  static void insertionSortUsingLoop(int arr[])
  {
      //insertion sort outer loop to drive the insertion sort
      for(int i=1;i<arr.length;i++)
      {
        int temp = arr[i]; //backup the lement to be sorted
        int j = i-1; //initialize the j variable to i-1
        //insertion sort inner loop to drive the shifting of elements in the array
        while(j>=0 && arr[j]>temp)
        {
          /*
           Shifting the elements until jbecomes 0 or we find an element which is
           less than the number (temp) which is being sorted here
_          */
          arr[j+1]=arr[j]; //shifting elements
          j=j-1; //update j to keep driving the while loop
        }
        arr[j+1] = temp; //put the temp variable in a sorted fashion in the array
      }
  }
    // insertion sort using recursion
    static void insertionSortRecursive(int arr[], int n) //arr.length = n
    {
        // Base case
        if (n <= 1)
            return;

        // Sort first n-1 elements
        insertionSortRecursive( arr, n-1 );

        // Insert last element at its correct position
        // in sorted array.
        int temp = arr[n-1];
        int j = n-2;

        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && arr[j] > temp)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
    }
}
