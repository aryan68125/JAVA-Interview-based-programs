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

}
