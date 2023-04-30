import java.util.*;
class Frequency_of_number
{
  //This class calculates the frequency of a number in an array
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[]= new int[size];
    EnterArray(arr,0,arr.length);
    PrintArray(arr,0,arr.length);
    System.out.println("");
    //sorting array in ascending order before counting Frequency of a number
    System.out.println("sorting array in ascending order before counting Frequency of a number");
    QuickSort(arr,0, arr.length-1);
    PrintArray(arr,0,arr.length);
    System.out.println("");
    CountFrequency( arr, arr.length);
  }
  static void EnterArray(int[] arr, int i,int size)
  {
    if (i==size)
    {
      return ;
    }
    Scanner sc = new Scanner(System.in);
    arr[i] = sc.nextInt();
    EnterArray(arr,i+1,size);
  }
  static void PrintArray(int[] arr, int i,int size)
  {
    if (i==size)
    {
      return;
    }
    System.out.print(arr[i] + " ");
    PrintArray(arr,i+1,size);
  }
  //quickSort algorithm
  static void QuickSort(int arr[],int low, int high)
  {
    if(low<high)
    {
      int IndexPI = partition(arr,low,high);
      QuickSort(arr,low,IndexPI-1);
      QuickSort(arr,IndexPI+1,high);
    }
  }
  //quick sort partition algo
  static int partition(int arr[], int low, int high)
  {
    int SwapIndex = low-1;
    int pivot = arr[high];
    for(int i = low; i<high; i++)
    {
      if(arr[i]<pivot)
      {
        SwapIndex++;
        int temp = arr[i];
        arr[i] = arr[SwapIndex];
        arr[SwapIndex] = temp;
      }
    }
    int temp2 = arr[SwapIndex+1];
    arr[SwapIndex+1] = arr[high];
    arr[high] = temp2;
    return SwapIndex+1;
  }

  static void CountFrequency(int arr[], int n)
  {
       int i = 0;
       while (i<n)
       {
         int  count = 1;

       while (i<n-1 && arr[i]==arr[i+1])
       {
         i++;
         count++;
       }
       System.out.println(arr[i] + " is present "+count+ " times in the array ");
       i++;
     }
  }
}
