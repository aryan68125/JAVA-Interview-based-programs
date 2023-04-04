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

    //Binary search using recursion
    System.out.println("Performing binary search in the array through recursion");
    int ans_binary_search = Binary_Search(arr,0,arr.length,num);
    if (ans_binary_search!=-1)
    {
        System.out.println("The number "+arr[ans_binary_search]+" is in the index "+ ans_binary_search);
    }

    //Binary search using for loop
    System.out.println("Performing Binary search through while loop");
    binarySearchWhileLoop(arr,0,arr.length-1,num);
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
  //This function will perform binary search on the array
  /*
  This recusrion method of binary search will only work if the array is in
  the ascending order. I will not work if the array is in descending order.
  */
  static int Binary_Search(int arr[],int left,int right,int num)
  {
    int mid ;
    if(left<=right)
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
  //binary search through while loop
  public static void binarySearchWhileLoop(int arr[],int left, int right, int num)
  {
    int mid = (left+right)/2;
    while(left<=right)
    {
      if(arr[mid]<num)
      {
        left = mid+1;
      }
      else if(arr[mid]>num)
      {
        right = mid-1;
      }
      else
      {
        System.out.println(arr[mid]+" is in index "+mid);
        break;
      }
      mid = (left+right)/2;
    }
    if(left>right)
    {
      System.out.println("Element not found");
    }
  }
}
