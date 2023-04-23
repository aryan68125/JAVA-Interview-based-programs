import java.util.*;
public class selection_sort
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements in the array");
    EnterArray(arr,0,arr.length);
    System.out.println("Printing the elements of the Array");
    PrintArray(arr,0,arr.length);
    System.out.println("");
    //selection sort
    selectionSort(arr);
    System.out.println("Printing the array after performing selection sort");
    PrintArray(arr,0,arr.length);
    System.out.println("");
  }
  static void EnterArray(int arr[],int i, int size)
  {
    if (i==size)
    {
      return;
    }
    Scanner sc = new Scanner(System.in);
    arr[i] = sc.nextInt();
    EnterArray(arr,i+1,size);
  }
  static void PrintArray(int arr[], int i, int size)
  {
    if (i==size)
    {
      return;
    }
    System.out.print(arr[i]+" ");
    PrintArray(arr,i+1,size);
  }

  //selection sort
  static void selectionSort(int arr[])
  {
      for(int i=0;i<arr.length-1;i++)
      {
        int min_index = i;
        for(int j = i+1; j<arr.length; j++)
        {
          if(arr[j]<arr[min_index])
          {
            min_index = j;
          }
        }
        //swapping here
        int temp = arr[min_index];
        arr[min_index]=arr[i];
        arr[i]=temp;
      }
  }

}
