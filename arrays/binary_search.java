//This program performs binary search on arrays
import java.util.*;
public class binary_search
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
    System.out.println("Enter the number to be searched in the array");
    int num = sc.nextInt();
    System.out.println("Performing binary search in the array through recursion");
    int ans_binary_search = Binary_Search(arr,0,arr.length,num);
    if (ans_binary_search!=-1)
    {
        System.out.println("The number "+arr[ans_binary_search]+" is in the index "+ ans_binary_search);
    }
  }
  //This function will enter the elements in the array
  static void EnterElementsInAttay(int arr[], int i)
  {
    if(i==arr.length-1)
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
      if(i == arr.length-1)
      {
        return;
      }
      System.out.print(arr[i] + " ");
      PrintArray(arr,i+1);
  }
  //This function will perform binary search on the array
  /*
  This recusrion method of binary search will only work if the array is in
  the ascending order. I will not work if the array is in descending order.
  */
  static int Binary_Search(int arr[],int left,int right,int num)
  {
    int mid ;
    if(right>=left)
    {
      mid = left + (right - left)/2;
      if(arr[mid]==num)
      {
        return mid;
      }
      else if(num<arr[mid])
      {
        return Binary_Search(arr,left,mid-1,num);
      }
      else //if num>arr[mid]
      {
        return Binary_Search(arr,mid+1,right,num);
      }
    }
    else //if the number is not found in the array
    {
      return -1;
    }
  }
}
